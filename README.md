<p><strong>AvaTaxCalc-BatchSvcSOAP-Java</strong> contains sample code that calls Avalara's Batch Service using a java SOAP API. The sample demonstrates how tax records can be imported using Avalara's <a href="http://help.avalara.com/000_AvaTax_Calc/000AvaTaxCalc_User_Guide/090_Tools/090_Import_Data/9G0/" target="_blank"> Transaction Import format.
  
  </p>
<p><strong>Contents:</strong></p>
<table width="674" border="0" cellspacing="2" cellpadding="2">
  <tr>
    <td width="180"><strong>avatax4j.properties</strong></td>
    <td width="480">Sample credentials file.</td>
  </tr>
  <tr>
    <td><strong>avatax4j-batchsvc.jar</strong></td>
    <td>AvaTax BatchSvc jar file</td>
  </tr>
  <tr>
    <td><strong>batchservicetest.csv</strong></td>
    <td>Sample import transaction csv file for use in testing batch services save. </td>
  </tr>
  <tr>
    <td><strong>/lib &nbsp;</strong></td>
    <td>Other required jar files </td>
  </tr>
  <tr>
    <td><strong>/src</strong> &nbsp;</td>
    <td>Full source code</td>
  </tr>
</table>
<p><strong>Dependencies:</strong> </p>
<ul>
  <li>All dependent jar files are included for build and running.    </li>
  <li>JDK 5.0 or later    </li>
  <li>avatax4j should be compatible with J2SDK 1.4.2 , but we no longer provide support for this version.    </li>
  <li>You will need to use the cacert file from JDK 5.0.   <a href="http://www.oracle.com/technetwork/java/javasebusiness/downloads/" target="_blank">http://www.oracle.com/technetwork/java/javasebusiness/downloads/</a> </li>
  <li>Apache Ant 1.6.x or later   <a href="http://ant.apache.org/bindownload.cgi" target="_blank">http://ant.apache.org/bindownload.cgi    </a></li>
</ul>
<p><strong>Requirements:</strong>  </p>
<ul>
  <li>Authentication using the BatchSvc requires the use of <strong>Account Admin</strong> level <strong>username</strong> and <strong>password</strong> vs account number and license key combination. Configure these settings in the <strong>avatax4j.properties </strong>file included in the sample.    </li>
  <li>CompanyId can be obtained from your Admin Console's  Organization tab by selecting the Company Name hyperlink. The digits that appear at the end of the URL string is the CompanyID.    </li>
</ul>
<blockquote>
  <p><strong>For example</strong>:  <a href="https://admin-development.avalara.net">https://admin-development.avalara.net/AvaTax/Company/CompanyEdit.aspx?id=12345</a> -- <strong>12345</strong> would be the CompanyID.    </p>
</blockquote>
<ul>
  <li>There is a .csv import transaction file <strong>batchservicetest.csv</strong> in the root directory  that can be used for your import document test. You can modify this file in any way that suites your business needs. See <a href="http://help.avalara.com/000_AvaTax_Calc/000AvaTaxCalc_User_Guide/090_Tools/090_Import_Data/9G0" target="_blank">Importing Transactions</a> for more information.</li>
</ul>
