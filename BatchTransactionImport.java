
import com.avalara.avatax.services.base.Profile;
import com.avalara.avatax.services.base.Security;
import com.avalara.avatax.services.batch.*;
import junit.framework.Assert;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Properties;

public class BatchTransactionImport {

  public static void main(String[] args) throws RemoteException, IOException, ServiceException, SOAPException {

    /* Setup Properties */
    Properties properties = new Properties();
    File file = new File("avatax4j.properties");
    properties.load(new FileInputStream(file));
    BatchSvcLocator batchSvcLocator = new BatchSvcLocator();
    String url = properties.getProperty("avatax4j.url");
    BatchSvcSoap batchSvc = batchSvcLocator.getBatchSvcSoap(new URL(url));
    Profile profile = new Profile();
    profile.setClient("BatchSvcImportTransactionSample,1.1.0.0");
    batchSvc.setProfile(profile);
    Security security = new Security();
    String account = properties.getProperty("avatax4j.account");
    security.setAccount(account);
    String license = properties.getProperty("avatax4j.license");
    security.setLicense(license);
    String username = properties.getProperty("avatax4j.username");
    security.setUserName(username);
    String password = properties.getProperty("avatax4j.password");
    security.setPassword(password);
    batchSvc.setSecurity(security);

    /* Setup Batch Request*/
    Batch batch = new Batch();
    batch.setBatchStatusId("Waiting");
    batch.setBatchTypeId("TransactionImport");
    batch.setCompanyId(12345);
    /*CompanyId can be obtained from the Avalara Admin Console | Organization Tab by
     selecting the Company Name then copying the integer immediately after the URL string.
     For example: https://admin-development.avalara.net/AvaTax/Company/CompanyEdit.aspx?id=12345
     12345 would be the CompanyID. */
    batch.setName("batchservicetest.csv");
    batch.setOptions("Add File");

    /* Set Batch Type */
    BatchFile batchFile = new BatchFile();
    batchFile.setName(batch.getName());
    batchFile.setContentType("application/vnd.csv");

    /* Set Batch Source */
    String filePath = "batchservicetest.csv";
    byte[] contents = GetBytes(filePath);
    batchFile.setFilePath(filePath);
    batchFile.setSize(contents.length);
    batchFile.setContent(contents);

    /* Read source file into an array */
    BatchFile[] batchFiles = new BatchFile[1];
    batchFiles[0] = batchFile;
    ArrayOfBatchFile arrayofBatchFile = new ArrayOfBatchFile();
    arrayofBatchFile.setBatchFile(batchFiles);
    batch.setFiles(arrayofBatchFile);
    batch.setCreatedDate(Calendar.getInstance());
    batch.setCompletedDate(Calendar.getInstance());
    batch.setModifiedDate(Calendar.getInstance());

    /* Batch Save Operation */
    System.out.println("BatchSave");
    BatchSaveResult batchSaveResult = batchSvc.batchSave(batch);
    System.out.println("Batch Save Result: " + batchSaveResult.getResultCode());
    System.out.println("Batch Id: " + batchSaveResult.getBatchId());

    /* Batch Fetch Operation */
    FetchRequest fetchRequest = new FetchRequest();
    fetchRequest.setFields("*,Files.Content");
    fetchRequest.setFilters("BatchId=" + batchSaveResult.getBatchId());
    int batchId = batchSaveResult.getBatchId();
    System.out.println("\n");
    System.out.println("BatchFetch");
    BatchFetchResult batchFetchResult = batchSvc.batchFetch(fetchRequest);
    System.out.println("Batch Fetch Result: " + batchFetchResult.getResultCode());
    System.out.println("Batch Count: " + batchFetchResult.getBatches().getBatch().length);

  }
/* Function to Read the Batch Import File */
  public static byte[] GetBytes(String filePath) {
    FileInputStream fileInputStream = null;
    try {
      File file = new File(filePath);
      fileInputStream = new FileInputStream(filePath);
      int count = (int) file.length();
      byte[] bytes = new byte[count];
      fileInputStream.read(bytes);
      return bytes;
    } catch (IOException ex) {
      Assert.fail(ex.getMessage());
      return new byte[0];
    } finally {
      if (fileInputStream != null) {
        try {
          fileInputStream.close();
        } catch (IOException exe) {
        }
      }
    }
  }
}