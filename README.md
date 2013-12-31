<strong>AvaTaxCalc-BatchSvcSOAP-Java</strong> is sample code that makes use of the AvaTax BatchSvc - java SOAP API. The sample demonstrates how a tax document can be imported in the Avalara Transaction Import format using a BatchSave method.

Contents: 
avatax4j.properties    sample credentials file.
batchservicetest.csv   sample import transaction csv file for use in testing batch services save.
avatax4j-batchsvc.jar  required jar file 
/lib      All required jar files
/samples  Sample APIs 
/src      Full source code

Dependencies:
All dependent jar files are included for build and running.
JDK 5.0 or later 
avatax4j should be compatible with J2SDK 1.4.2 , but we no longer provide support for this version. 
You will need to use the cacert file from JDK 5.0.   http://www.oracle.com/technetwork/java/javasebusiness/downloads/
Apache Ant 1.6.x or later   http://ant.apache.org/bindownload.cgi

Requirements:
Authentication using the BatchSvc requires the use of Account Admin level username and password vs account number and license key combination. Configure these settings in the avatax4j.properties file included in the sample.

CompanyId CompanyId can be obtained from the Admin Console, Organization tab by selecting the Company Name, then copying the digits at the end of the URL string. 
For example:  https://admin-development.avalara.net/AvaTax/Company/CompanyEdit.aspx?id=12345    12345 would be the CompanyID.

There is a .csv import transaction file batchservicetest.csv in the root directory of the sample that will be used for the import test. You can modify this file in any way that suites you.
