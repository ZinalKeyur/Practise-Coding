#Vrealize management servers Healthcheck Automation (SAAS,IAAS,Agents,Repos,SQLDB, VC -> SQLDBDISK)
#Powershell
 
Import-Module powervra -RequiredVersion 3.6.0
# Enter your pass and stores it securely:
$SecureString = Read-Host -AsSecureString 'Please enter the NUIDa password' | ConvertFrom-SecureString | ConvertTo-SecureString
# Users you password securly
$user_name = Read-Host 'Enter the user name Ex. NUIDa@cs.msds.zinal.org'
$MySecureCreds = New-Object -TypeName System.Management.Automation.PSCredential -ArgumentList $user_name,$SecureString
# Sets yous credentials to be used
 
$cred = $MySecureCreds
 
[System.Net.ServicePointManager]::SecurityProtocol = [System.Net.SecurityProtocolType]::Tls12;
$vra = Connect-vRAServer -Server c2c.cloud.zinal.org -Credential (Get-Credential $MySecureCreds) -Tenant  KPPC -IgnoreCertRequirements -ErrorAction:SilentlyContinue
$version_details = Get-vRAVersion -ErrorAction:SilentlyContinue
if($version_details)
{
Write-Host "The VRA portal is working fine" -ForegroundColor Green
}
else
{
 
}
$reservation = Get-vRAReservation -ErrorAction:SilentlyContinue
if($reservation)
{
Write-Host "The VRA infrastructure portal is working fine." -ForegroundColor Green
}
else
{
Write-Host "VRA infrastructure portal is not accessable." -ForegroundColor Red
}
$Saasserver1 = (Invoke-WebRequest -Uri 'https://Saasserver1.cloud.zinal.org/SAAS/API/1.0/REST/system/health' -ErrorAction:SilentlyContinue)
$Saasserver2 = (Invoke-WebRequest -Uri 'https://Saasserver2.cloud.zinal.org/SAAS/API/1.0/REST/system/health' -ErrorAction:SilentlyContinue)
$Saasserver3 = (Invoke-WebRequest -Uri 'https://Saasserver3.cloud.zinal.org/SAAS/API/1.0/REST/system/health' -ErrorAction:SilentlyContinue)
 
if($Saasserver1.content -and $Saasserver1.StatusCode -eq 200)
{
Write-Host "Saasserver1 health is good" -ForegroundColor Green
}
else
{
Write-Host "Saasserver1 problem accessing" -ForegroundColor Red
}
 
if($Saasserver2.content -and $Saasserver2.StatusCode -eq 200)
{
Write-Host "Saasserver2 health is good" -ForegroundColor Green
}
else
{
Write-Host "Saasserver2 problem accessing" -ForegroundColor Red
}
 
if($Saasserver3.content -and $Saasserver3.StatusCode -eq 200)
{
Write-Host "Saasserver3 health is good" -ForegroundColor Green
}
else
{
Write-Host "Saasserver3 problem accessing" -ForegroundColor Red
}
 
$Repository = (Invoke-WebRequest -Uri 'https://Reposerver1.cloud.zinal.org/Repository/Data/MetaModel.svc/' -Credential $cred -ErrorAction:SilentlyContinue)
if($Repository.content -and $Repository.StatusCode -eq 200)
{
Write-Host 'Repository is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repository is not working' -ForegroundColor Red
}
 
function checklink($link)
{
$html = Invoke-WebRequest -Uri $link -ErrorAction:SilentlyContinue
return $html
}
 
function checklinkPass($link1)
{
$html = Invoke-WebRequest -Uri $link1 -Credential $cred -ErrorAction:SilentlyContinue
return $html
}
 
 
$IaaSStatus = checklink('https://IaaSserver1.cloud.zinal.org/VMPSprovision')
if($IaaSStatus.content -and $IaaSStatus.StatusCode -eq 200)
{
Write-Host 'IaaS  on IaaSserver1 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'IaaS  on IaaSserver1 is not working' -ForegroundColor Red
}
 
$IaaSStatus = checklink('https://IaaSserver2.cloud.zinal.org/VMPSprovision')
if($IaaSStatus.content -and $IaaSStatus.StatusCode -eq 200)
{
Write-Host 'IaaS  on IaaSserver2 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'IaaS  on IaaSserver2 is not working' -ForegroundColor Red
}
 
$vRoStatus = checklink('https://Saasserver1.cloud.zinal.org/vco/api/healthstatus')
if($vRoStatus.content -and $vRoStatus.StatusCode -eq 200)
{
Write-Host 'vRo  on Saasserver1 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'vRo  on Saasserver1 is not working' -ForegroundColor Red
}
 
$vRoStatus = checklink('https://Saasserver2.cloud.zinal.org/vco/api/healthstatus')
if($vRoStatus.content -and $vRoStatus.StatusCode -eq 200)
{
Write-Host 'vRo  on Saasserver2 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'vRo  on Saasserver2 is not working' -ForegroundColor Red
}
 
$vRoStatus = checklink('https://Saasserver3.cloud.zinal.org/vco/api/healthstatus')
if($vRoStatus.content -and $vRoStatus.StatusCode -eq 200)
{
Write-Host 'vRo  on Saasserver3 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'vRo  on Saasserver3 is not working' -ForegroundColor Red
}
 
 
$Controlcenter = checklinkPass('https://Saasserver1.cloud.zinal.org:8283/vco-controlcenter/')
if($Controlcenter.content -and $Controlcenter.StatusCode -eq 200)
{
Write-Host 'Controlcenter  on Saasserver1 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Controlcenter  on Saasserver1 is not working' -ForegroundColor Red
}
 
$Controlcenter = checklinkPass('https://Saasserver2.cloud.zinal.org:8283/vco-controlcenter/')
if($Controlcenter.content -and $Controlcenter.StatusCode -eq 200)
{
Write-Host 'Controlcenter  on Saasserver2 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Controlcenter  on Saasserver2 is not working' -ForegroundColor Red
}
 
 
$Controlcenter = checklinkPass('https://Saasserver3.cloud.zinal.org:8283/vco-controlcenter/')
if($Controlcenter.content -and $Controlcenter.StatusCode -eq 200)
{
Write-Host 'Controlcenter  on Saasserver3 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Controlcenter  on Saasserver3 is not working' -ForegroundColor Red
}
 
$cred1 = Get-Credential -Message 'Enter the service account pasword' -UserName 'SVC-vCloudAutoAdmin@cs.msds.zinal.org'
$agents = @('Agent1','Agent2','Agent3')
foreach($agent in $agents)
{
Write-Host "Service Status on $agent" -ForegroundColor Yellow
    try
    {
    $output1 =  (Invoke-Command -ComputerName $agent -ScriptBlock {Get-Service | where {$_.name -like "*VMware*"} | select status,name} -Credential $cred1 -ErrorAction Stop )
 
    }
    catch
    {
    #Write-Host "Error : $_.Exception.Message"
    $output1 =  (Invoke-Command -ComputerName $agent -ScriptBlock {Get-Service | where {$_.name -like "*VMware*"} | select status,name} -Credential $cred -ErrorAction:SilentlyContinue )
    }
    $servicename = (($output1 | where {$_.status -like "*Stopped*"} | where {$_.name -ne 'VMwareCAFCommAmqpListener'} | where {$_.name -ne 'VMwareCAFManagementAgentHost'}| select name).name)
    if($servicename)
    {
    write-host "Service $servicename  are stopped on server $agent check if it require to start " -ForegroundColor Yellow -BackgroundColor Red
    }
    else
    {
    Write-Host "All the agent services are running fine" -ForegroundColor Green
    }
        if(!$output1)
        {
        $notWorking += @($agent)
        Write-Host "Service Status failed or server($agent) not accessable, need to check manually " -ForegroundColor Red
        }
        Remove-Variable output1 -ErrorAction:SilentlyContinue
}
 
 
$  = @('https://iaasweb.cloud.zinal.org/WAPI/api/status','https://c2c.cloud.zinal.org/advanced-designer-service/api/status','https://c2c.cloud.zinal.org/workitem-service/api/status','https://c2c.cloud.zinal.org/console-proxy-service/api/status','https://c2c.cloud.zinal.org/component-registry/api/status','https://c2c.cloud.zinal.org/software-service/api/status','https://c2c.cloud.zinal.org/identity/api/status','https://c2c.cloud.zinal.org/approval-service/api/status','https://c2c.cloud.zinal.org/container-service/api/status','https://c2c.cloud.zinal.org/network-service/api/status','https://c2c.cloud.zinal.org/vcac/services/api/status','https://c2c.cloud.zinal.org/portal-service/api/status','https://c2c.cloud.zinal.org/identity/api/status','https://c2c.cloud.zinal.org/branding-service/api/status','https://c2c.cloud.zinal.org/iaas-proxy-provider/api/status','https://c2c.cloud.zinal.org/iaas-proxy-provider/api/status','https://c2c.cloud.zinal.org/healthbroker-proxy-server/api/status','https://c2c.cloud.zinal.org/placement-service/api/status','https://c2c.cloud.zinal.org/management-service/api/status','https://c2c.cloud.zinal.org/container-service/api/status','https://c2c.cloud.zinal.org/forms-service/api/status','https://c2c.cloud.zinal.org/content-management-service/api/status','https://c2c.cloud.zinal.org:443/vco/api/status','https://c2c.cloud.zinal.org/component-registry/api/status','https://c2c.cloud.zinal.org/component-registry/api/status','https://c2c.cloud.zinal.org/identity/api/status','https://c2c.cloud.zinal.org/notification-service/api/status','https://c2c.cloud.zinal.org/event-broker-service/api/status','https://c2c.cloud.zinal.org/o11n-gateway-service/api/status','https://c2c.cloud.zinal.org/endpoint-configuration-service/api/status','https://c2c.cloud.zinal.org/config-management-service/api/status','https://c2c.cloud.zinal.org/catalog-service/api/status','https://c2c.cloud.zinal.org/ipam-service/api/status','https://c2c.cloud.zinal.org/composition-service/api/status','https://c2c.cloud.zinal.org/event-broker-service/api/status','https://c2c.cloud.zinal.org/reservation-service/api/status','https://c2c.cloud.zinal.org/properties-service/api/status')
foreach($link in $serviceLink)
{
#write-host $link
$serviceName = ((Invoke-WebRequest -Uri $link).content.split(',') | where {$_ -like '*serviceName*'}).split(':')[1]
$serviceStatus = ((Invoke-WebRequest -Uri $link).content.split(',') | where {$_ -like '*serviceInitializationStatus*'}).split(':')[1]
Write-Host "vRa service $servicename  ----- $serviceStatus"
Remove-Variable -Name servicename,serviceStatus
}
Connect-VIServer viServer1.cloud.zinal.org -Credential $cred
$root = Get-Credential -Message 'Enter the root credentials' -UserName 'root'
$vraStatus = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver1') -ScriptText 'service vcac-server status' -GuestCredential $root 
$vraCheck = ($vraStatus.split('/n') | where {$_ -like '*pid*'} ).split(' ') | where {$_ -like '*running*'}
if($vraCheck)
{
Write-Host "The vcac-server service are running fine on Saasserver1" -ForegroundColor Green
}
else
{
Write-Host "VRA vcac-server service is not running , please check" -ForegroundColor Red -BackgroundColor Yellow
}
 
$vraStatus = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver2') -ScriptText 'service vcac-server status' -GuestCredential $root 
$vraCheck = ($vraStatus.split('/n') | where {$_ -like '*pid*'} ).split(' ') | where {$_ -like '*running*'}
if($vraCheck)
{
Write-Host "The vcac-server service are running fine on Saasserver2" -ForegroundColor Green
}
else
{
Write-Host "VRA vcac-server service is not running , please check" -ForegroundColor Red -BackgroundColor Yellow
}
 
$vraStatus = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver3') -ScriptText 'service vcac-server status' -GuestCredential $root 
$vraCheck = ($vraStatus.split('/n') | where {$_ -like '*pid*'} ).split(' ') | where {$_ -like '*running*'}
if($vraCheck)
{
Write-Host "The vcac-server service are running fine on Saasserver3" -ForegroundColor Green
}
else
{
Write-Host "VRA vcac-server service is not running , please check" -ForegroundColor Red -BackgroundColor Yellow
}
 
 
$vraStatus = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver3') -ScriptText 'service vco-server status' -GuestCredential $root 
$vraCheck = ($vraStatus.split('/n') | where {$_ -like '*pid*'} ).split(' ') | where {$_ -like '*running*'}
if($vraCheck)
{
Write-Host "The vco-server service are running fine on Saasserver3" -ForegroundColor Green
}
else
{
Write-Host "VRA vco-server service is not running , please check" -ForegroundColor Red -BackgroundColor Yellow
}
 
 
$vraStatus = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver2') -ScriptText 'service vco-server status' -GuestCredential $root 
$vraCheck = ($vraStatus.split('/n') | where {$_ -like '*pid*'} ).split(' ') | where {$_ -like '*running*'}
if($vraCheck)
{
Write-Host "The vco-server service are running fine on Saasserver2" -ForegroundColor Green
}
else
{
Write-Host "VRA vco-server service is not running , please check" -ForegroundColor Red -BackgroundColor Yellow
}
 
$vraStatus = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver1') -ScriptText 'service vco-server status' -GuestCredential $root 
$vraCheck = ($vraStatus.split('/n') | where {$_ -like '*pid*'} ).split(' ') | where {$_ -like '*running*'}
if($vraCheck)
{
Write-Host "The vco-server service are running fine on Saasserver1" -ForegroundColor Green
}
else
{
Write-Host "VRA vco-server service is not running , please check" -ForegroundColor Red -BackgroundColor Yellow
}
 
 
$space = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver1') -ScriptText 'df -h' -GuestCredential $root
$Check = ((($space.split('/n') | where {$_ -like '*%*'}).split(' ') | where {$_ -like "*%*"}).split('%')) | where {$_ -notlike '*use*'} | where {[int]$_ -gt 80}
if($Check)
{
Write-Host "One or multiple disk are highly utilized(more than 80%) on Saasserver1" -ForegroundColor Red
}
else
{
write-host "All disk on Saasserver1 are used less than 80%" -ForegroundColor Green
}
 
$space = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver2') -ScriptText 'df -h' -GuestCredential $root
$Check = ((($space.split('/n') | where {$_ -like '*%*'}).split(' ') | where {$_ -like "*%*"}).split('%')) | where {$_ -notlike '*use*'} | where {[int]$_ -gt 80}
if($Check)
{
Write-Host "One or multiple disk are highly utilized(more than 80%) on Saasserver2" -ForegroundColor Red
}
else
{
write-host "All disk on Saasserver2 are used less than 80%" -ForegroundColor Green
}
 
$space = Invoke-VMScript -VM (Get-VM '(vRA) Saasserver3') -ScriptText 'df -h' -GuestCredential $root
$Check = ((($space.split('/n') | where {$_ -like '*%*'}).split(' ') | where {$_ -like "*%*"}).split('%')) | where {$_ -notlike '*use*'} | where {[int]$_ -gt 80}
if($Check)
{
Write-Host "One or multiple disk are highly utilized(more than 80%) on Saasserver3" -ForegroundColor Red
}
else
{
write-host "All disk on Saasserver3 are used less than 80%" -ForegroundColor Green
}
 
 
 
$failover_Cluster_Status = Invoke-Command -ComputerName SQLDB2 -ScriptBlock {Get-Cluster | Get-ClusterNode} -Credential $cred | where {$_.state -notlike '*up*'}
if($failover_Cluster_Status)
{
Write-Host "One of the node in SQL cluster is not available" -ForegroundColor Red
}
else
{
Write-Host "Both the SQL cluster nodes(SQLDB1,SQLDB2) are up and running fine" -ForegroundColor Green
}
 
 
$SQLDB2 = ((Invoke-Command -ComputerName SQLDB2 -ScriptBlock {Get-Volume} -Credential $cred | where {$_.driveletter -like "*g*"} ) | select SizeRemaining).SizeRemaining
foreach($disk in $SQLDB2)
{
    if(([math]::Round((($disk/1024)/1024)/1024)) -le 150)
    {
    Write-Host 'Node(SQLDB2) having less disk(lower than 150GB on G drive) space' -ForegroundColor Red
    }
    else
    {
    Write-Host 'The Node(SQLDB2) having sufficient disk pace on g-drive' -ForegroundColor Green
    }
}
 
$SQLDB1 = ((Invoke-Command -ComputerName SQLDB1 -ScriptBlock {Get-Volume} -Credential $cred | where {$_.driveletter -like "*g*"} ) | select SizeRemaining).SizeRemaining
foreach($disk in $SQLDB1)
{
    if(([math]::Round((($disk/1024)/1024)/1024)) -le 150)
    {
    Write-Host 'Node(SQLDB2) having less disk(lower than 150GB on G drive) space' -ForegroundColor Red
    }
    else
    {
    Write-Host 'The Node(SQLDB2) having sufficient disk pace on g-drive' -ForegroundColor Green
    }
}
 
 
$r1_repo = checklink('https://r1.cloud.zinal.org/BIGIP/bigip.html')
if($r1_repo.content -like "*up*" -and $r1_repo.StatusCode -eq 200)
{
Write-Host 'Repo server r1 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repo server r1 is not working' -ForegroundColor Red
}
 
$r2_repo = checklink('https://r2.cloud.zinal.org/BIGIP/bigip.html')
if($r2_repo.content -like "*up*" -and $r2_repo.StatusCode -eq 200)
{
Write-Host 'Repo server r2 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repo server r2 is not working' -ForegroundColor Red
}
 
$r3_repo = checklink('https://r3.cloud.zinal.org/BIGIP/bigip.html')
if($r3_repo.content -like "*up*" -and $r3_repo.StatusCode -eq 200)
{
Write-Host 'Repo server r3 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repo server r3 is not working' -ForegroundColor Red
}
 
$r4 = checklink('https://r4.cloud.zinal.org/BIGIP/bigip.html')
if($r4.content -like "*up*" -and $r4.StatusCode -eq 200)
{
Write-Host 'Repo server r4 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repo server r4 is not working' -ForegroundColor Red
}
 
$r5 = checklink('https://r5.cloud.zinal.org/BIGIP/bigip.html')
if($r5.content -like "*up*" -and $r5.StatusCode -eq 200)
{
Write-Host 'Repo server r5 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repo server r5 is not working' -ForegroundColor Red
}
 
$r6 = checklink('https://r6.cloud.zinal.org/BIGIP/bigip.html')
if($r6.content -like "*up*" -and $r6.StatusCode -eq 200)
{
Write-Host 'Repo server r6 is working fine' -ForegroundColor Green
}
else
{
Write-Host 'Repo server r6 is not working' -ForegroundColor Red
}
