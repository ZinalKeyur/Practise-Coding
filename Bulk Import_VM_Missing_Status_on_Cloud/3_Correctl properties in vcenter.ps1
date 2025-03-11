****************************************************************************************
#Create a excel file1.csv, with values of old VRA VM prop, and give coulnm names as Name & Value
 
#Script for updating the attribute in vCenter
 
$array = @('cscgpk5678904')
foreach($file1 in $array)
{
$csv = Import-Csv C:\Users\zinal.ZQ\Desktop\Import\$file1.csv
$cred =  (Get-Credential)
Connect-VIServer -Server 10.15.248.28,10.15.240.28, 10.15.244.28 -Credential $cred -AllLinked
foreach($data in $csv)
{
Set-Annotation -Entity (Get-VM $file1) -Value $data.value -CustomAttribute $data.name -ErrorAction:SilentlyContinue
}
}
 
*****************************************************
 
Get-Cluster -Vm cscgpk5678904
Get-Datacenter -Cluster ashburn-compute-piaas
Get-VMHost -VM CSZINAL00000182 
 
Get-VM | Select-Object -Property Name,@{Name=’Cluster’;Expression={$_.VMHost.Parent}}
 
 
*************************************************

[System.Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12;
Connect-VIServer -Server 10.15.*.* -Credential (get-credential) -alllinked
Get-VM cscgpk5678904 | %{(Get-View $_.Id).config.uuid} 
 
 
(Get-VM 'cscgpk5678904' ).ExtensionData.config.instanceuuid
#New from VC -> 503be81f-fccc-fff2-9da7-1e40ce767ce3
#Old in VRA -> 503b8dad-cafa-b1fc-891c-41f72a65dc33
 
**************************************************
 
#Commands to fetch VRA VM property
 
 
[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
Connect-vRAServer -Server cskpcloudvm1137.cloud.kp.org -Tenant KPPC -Credential $cred -IgnoreCertRequirements
$array = @sshawei"NETWORK_LIST","__datacollected_ipaddress","ChangeLease","Component","Destroy","DISK_VOLUMES","endpointExternalReferenceId","Expire","EXTERNAL_REFERENCE_ID","ip_address","IS_COMPONENT_MACHINE","MachineBlueprintName","MachineCPU","MachineDailyCost","MachineDestructionDate","MachineExpirationDate","MachineGroupName","MachineGuestOperatingSystem","machineId","MachineInterfaceDisplayName","MachineInterfaceType","MachineMemory","MachineName","MachineReservationName","MachineStorage","MachineType","NETWORK_LIST","Reconfigure","Reprovision","SNAPSHOT_LIST","Unregister","VirtualMachine.Disk0.IsClone","VirtualMachine.Disk0.Storage.Cluster.ExternalReferenceId","VirtualMachine.Disk0.Storage.Cluster.Name","VirtualMachine.Disk1.IsClone","VirtualMachine.Disk1.Storage.Cluster.ExternalReferenceId","VirtualMachine.Disk1.Storage.Cluster.Name","VirtualMachine.Disk2.Storage.Cluster.ExternalReferenceId","VirtualMachine.Disk2.Storage.Cluster.Name","VirtualMachine.Admin.UUID","VirtualMachine.Admin.UUID","VirtualMachine.Admin.Description","VirtualMachine.Admin.Hostname","VirtualMachine.Admin.NameCompletion","VirtualMachine.Admin.ThinProvision","VirtualMachine.Admin.TotalDiskUsage","VirtualMachine.Admin.UseGuestAgent","VirtualMachine.Cafe.Blueprint.Component.Cluster.Index","VirtualMachine.Cafe.Blueprint.Component.Id","VirtualMachine.Cafe.Blueprint.Component.TypeId","VirtualMachine.Cafe.Blueprint.Id","VirtualMachine.Cafe.Blueprint.Name","VirtualMachine.CPU.Count","VirtualMachine.Customize.WaitComplete","VMware.VirtualCenter.OperatingSystem","VirtualMachine.Storage.Cluster.Automation.Behavior","VirtualMachine.Storage.Cluster.ExternalReferenceId","VirtualMachine.Storage.Cluster.Name","VirtualMachine.Network0.DnsSearchSuffixes")
$server_list = Get-Content C:\Users\s473437a\Desktop\DesktopData\list_server_01.txt
foreach($server1 in $server_list)
{
$data = (Get-vRAResource -Name $server1).data | Get-Member| where {$_.membertype -eq "noteproperty"} |select name,@{n='Value';e={$_.Definition.split('=')[1]}}
foreach($array1 in $array)
{$data = ($data ) | where {$_.name -ne $array1}}$data | Export-Csv C:\Users\s473437a\Desktop\$server1.csv
}
 
 
*************************************************************************
