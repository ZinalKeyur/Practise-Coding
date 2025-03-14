#***************** Check if IP is reserved in VDMDB(*********************
 
SELECT *FROM [VRA8].[dbo].[StaticIPv4Address] where IPv4Address = '{Mention the IP address here}'
 
 
#*********************************************************************************************
 
try
{
var customModule = null,
dbConfig = null,
dbConnection = null,
preparedStatement = null,
resultSet = null;
 
customModule = System.getModule("com.vce.customdevelopment");
dbConfig = customModule.getDbConfig();
dbConnection = customModule.getDbConnection(dbConfig.get("host"),
dbConfig.get("port"),
dbConfig.get("instance"),
dbConfig.get("user"),
dbConfig.get("password"),
dbConfig.get("database"),
dbConfig.get("domain"));
 
preparedStatement = dbConnection.prepareStatement("UPDATE [VRA8].[dbo].[StaticIPv4Address] SET StaticIPv4AddressState = 0 WHERE IPv4Address = '162.*.*.*'"); 
 
resultSet = preparedStatement.executeUpdate();
}
finally
{
if(dbConnection)
{
dbConnection.close();
}
}

#*************************************************************************************************
 
UPDATE [VRA8].[dbo].[StaticIPv4Address] 
SET StaticIPv4AddressState = 0 
WHERE IPv4Address IN ('162.119.248.*', '162.119.249.*',  '162.119.249.*', '162.119.248.*', '162.119.248.*', '162.119.249.*', '162.119.249.*', '162.119.248.*')   // Check your IPs. This is just an example.
 
#*********************************************************************************
