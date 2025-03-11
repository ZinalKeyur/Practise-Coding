*********************************************************************************
 
#run the below commands to check in powershell
$h  = Get-View -ViewType VirtualMachine
$h | where {$_.guest.ipaddress -like '10.15.*.*'} | select name
 
 
************************************************************************************
 
#Take new prop, differentiatie Duplicate Pro -> get list of missing prop -> saveas "property_input.csv
#Run a script to import all this prop now -> change input file path, and output text file name
************************************************************************************
 
$data = Import-Csv C:\Users\zinal.ZQ\Desktop\Import\property_input.csv
foreach($data1 in $data)
{
$array1 += $data1.name + ',' + $data1.value + ',' + 'NOP' + ','
}
$array1 | Out-File \cskpcloudwp2693.txt
Remove-Variable -Name array1
***********************************
#You should get O/P in a text file in 1 string form. (WITHOUT COMMA), If you have prop with comma, note it and add it manually later
#Add this string in main import csv, and import again, now with all prop values
#Now you ll find each prop correctly updated in VRA. But in VC, custom attributes do not have the right values
