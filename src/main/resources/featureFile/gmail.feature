Feature: Reset functionality on login page of Application				


Scenario Outline: Verification of reset button with numbers of credential


Given Open the Chrome and launch the application				
When Enter the UserName <Username> as "testasdtest2@gmail.com"      		
Then click on Next Button
When Enter the UserName <Password> as "Tester@123"
And second time click on Next Button