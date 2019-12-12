package Step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyAccountLogninStepDefinitions {
	public WebDriver driver = null;

	@Given("^Open Browser$")
	public void open_Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Rahul_Gehlot\\Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^Enter the URL$")
	public void enter_the_URL() throws Exception {
		driver.get("http://www.automationpractice.com/index.php");
	}

	@When("^Click on MyAccount menu$")
	public void click_on_MyAccount_menu() throws Exception {
		driver.findElement(By.xpath("//a[@class='login']")).click();

	}

	
	/*
	 * @When("^Enter registred username and password$") public void
	 * enter_registred_username_and_password() throws Exception {
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
	 * "07rahulgehlot@gmail.com"); Thread.sleep(2000);
	 * driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Rahul123");
	 * Thread.sleep(2000); }
	 */
	 
	
	
	@When("^Enter registred \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_registred_and(String arg1, String arg2) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(arg2);
		Thread.sleep(2000);
	}
	 
	 

	@When("^Click on login button$")
	public void click_on_login_button() throws Exception {
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Exception {
    String captext= driver.findElement(By.xpath("//img[@class='logo img-responsive']")).getText();
    System.out.println("String is----->>>>>>"+captext);
    
   
	}

}
