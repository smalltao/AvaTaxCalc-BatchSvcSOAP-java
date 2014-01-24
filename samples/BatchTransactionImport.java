import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.batch.*;
import junit.framework.Assert;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Properties;

/**
 * Author: Tim Longley 
 * Title: Sr. Developer Relations Engineer 
 * Company: Avalara 
 * Division: Developer Relations
 * Date: Dec 30, 2013 Time: 11:30 AM
 * 
 */
public class BatchTransactionImport {

  public static void main(String[] args) {
    try {
      BatchSvcSoap port = getBatchSvc();
      Batch batch = new Batch();
      batch.setBatchStatusId("Waiting");
      batch.setBatchTypeId("TransactionImport");
      batch.setCompanyId( );
      //NOTE: CompanyId can be obtained from the Admin Console, Organization Tab by
      //      selecting the Company Name then copying the digits at the end of the URL string.
      //      for example: https://admin-development.avalara.net/AvaTax/Company/CompanyEdit.aspx?id=12345
      //                   12345 will be the CompanyID.
      batch.setName("..//batchservicetest.csv");
      batch.setOptions("Add File");

      BatchFile batchFile = new BatchFile();
      batchFile.setName(batch.getName());
      batchFile.setContentType("application/vnd.csv");

      String filePath = "batchservicetest.csv";
      byte[] contents = GetBytes(filePath);
      batchFile.setFilePath(filePath);
      batchFile.setSize(contents.length);
      batchFile.setContent(contents);

      BatchFile[] batchFiles = new BatchFile[1];
      batchFiles[0] = batchFile;
      ArrayOfBatchFile arrayofBatchFile = new ArrayOfBatchFile();
      arrayofBatchFile.setBatchFile(batchFiles);
      batch.setFiles(arrayofBatchFile);
      batch.setCreatedDate(Calendar.getInstance());
      batch.setCompletedDate(Calendar.getInstance());
      batch.setModifiedDate(Calendar.getInstance());

      //Batch Save
      System.out.println("BatchSave");
      BatchSaveResult batchSaveResult = port.batchSave(batch);
      System.out.println("BatchSaveResult:" + batchSaveResult.getResultCode());
      System.out.println("BatchId:" + batchSaveResult.getBatchId());
      FetchRequest fetchRequest = new FetchRequest();
      fetchRequest.setFields("*,Files.Content");
      fetchRequest.setFilters("BatchId=" + batchSaveResult.getBatchId());
      int batchId = batchSaveResult.getBatchId();
      //Batch Fetch
      System.out.println("\n");
      System.out.println("BatchFetch");
      BatchFetchResult batchFetchResult = port.batchFetch(fetchRequest);
      System.out.println("BatchFetchResult:" + batchFetchResult.getResultCode());
      System.out.println("BatchCount:" + batchFetchResult.getBatches().getBatch().length);

      
      //            Batch tempBatch;
//            for (int i=0;i<batchFetchResult.getBatches().getBatch().length;i++)
//            {
//                tempBatch=batchFetchResult.getBatches().getBatch(i);
//                Assert.assertEquals(batchSaveResult.getBatchId(),tempBatch.getBatchId());
//                Assert.assertEquals(batch.getBatchTypeId(),tempBatch.getBatchTypeId());
//                Assert.assertEquals(batch.getName(),tempBatch.getName());
//                Assert.assertEquals(batch.getOptions(),tempBatch.getOptions());
//
//                Assert.assertEquals(batch.getFiles().getBatchFile().length,tempBatch.getFiles().getBatchFile().length);
//            }

//            //BatchDelete
//            System.out.println("\n");
//            System.out.println("BatchDelete");
//            DeleteRequest deleteRequest = new DeleteRequest();
//
//            deleteRequest.setFilters("BatchId="+batchId);
//            DeleteResult deleteResult = port.batchDelete(deleteRequest);
//            System.out.println("BatchDeleteResult:"+deleteResult.getResultCode());
//            Assert.assertEquals(SeverityLevel.Success,deleteResult.getResultCode());
      
      
      
      // Results
    } catch (ServiceException | SOAPException | IOException ex) {
      System.out.println("Exception: " + ex.getMessage());
    }
  }

  private static BatchSvcSoap getBatchSvc() throws ServiceException, SOAPException, MalformedURLException, IOException {
    BatchSvc batchSvc;
    BatchSvcSoap port;
    Properties properties = new Properties();
    //Warning: Credentials MUST be a valid Account Admin login and password - not account number and license key
    File file = new File("avatax4j.properties");
    try {
      properties.load(new FileInputStream(file));
    } catch (IOException e) {
      System.out.println("Unable to load avatax4j.properties");
      throw e;
    }
    String url = properties.getProperty("avatax4j.url");
    Assert.assertFalse("avatax4j.url property is not configured in avatax4j.properties", url == null || url.length() == 0);

    String account = properties.getProperty("avatax4j.account");
    boolean accountSet = !isEmpty(account);

    String license = properties.getProperty("avatax4j.license");
    boolean licenseSet = !isEmpty(license);

    //REQUIRED for batchsvc requests
    String userName = properties.getProperty("avatax4j.userName");
    boolean userNameSet = !isEmpty(userName);

    String password = properties.getProperty("avatax4j.password");
    boolean passwordSet = !isEmpty(password);

//Check for existance of Username and Password in avatax4j property file
    Assert.assertTrue("In the avatax4j property file, "
            + "either avatax4j.license and "
            + "avatax4j.account need to be"
            + " specified, or avatax4j.userName and "
            + "avatax4j.password need to be specified",
            ((licenseSet && accountSet)
            || (userNameSet && passwordSet)));

    batchSvc = new BatchSvcLocator();

    port = batchSvc.getBatchSvcSoap(new URL(url));

    // Set the profile
    Profile profile = new Profile();
    profile.setClient("BatchSvcImportTransactionSample,1.1.0.0");
    port.setProfile(profile);

    // Set security
    Security security = new Security();
    if (accountSet && licenseSet) {
      security.setAccount(account);
      security.setLicense(license);
    } else if (userNameSet && passwordSet) {
      security.setPassword(password);
      security.setUserName(userName);
    }
    port.setSecurity(security);
    return port;
  }

  private static boolean isEmpty(String str) {
    return str == null || str.trim().length() == 0;
  }

  public static byte[] GetBytes(String filePath) {
    FileInputStream fileInputStream = null;
    try {
      File file = new File(filePath);
      fileInputStream = new FileInputStream(filePath);
      int count = (int) file.length();
      byte[] bytes = new byte[count];

      fileInputStream.read(bytes);

      return bytes;
    } catch (Exception ex) {
      Assert.fail(ex.getMessage());
      return new byte[0];
    } finally {
      if (fileInputStream != null) {
        try {
          fileInputStream.close();
        } catch (Exception exe) {
        }
      }
    }
  }
}
