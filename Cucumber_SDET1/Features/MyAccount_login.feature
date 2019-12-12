Feature: MyAccount Login Feature
Description: this Feature will test a login functionality
 
Scenario Outline: Successful Login with Valid Credentials
Given Open Browser
When Enter the URL
And Click on MyAccount menu
And Enter registred username and password
And Enter registred "<username>" and "<password>"
And Enter User Details "<FirstName>" and "<LastName>"  and "<Email>" and "<Password>" and "<DOB>" and "<Fname>" and "<Lname>" and "<Company>" and "<Address>" and "<Address2>" and "<City>" and "<State>" and"<Zip>" and "<Country>" and "<AddInfo>" and "<Mno>" and "<MyAdd>"
And Click on login button
Then Message displayed Login Successfully
Then member able to click
 
 Examples:
		|username               |password|
		|07rahulgehlot@gmail.com|Rahul123|