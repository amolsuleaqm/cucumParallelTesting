package cucumberlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mail2 
{

	WebDriver driver;
	@Given("I have URL of AQM mail")
	public void i_have_URL_of_AQM_mail() throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Amol\\chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    driver.get("https://mail.aqmtechnologies.com/action/login/aqmtechnologies.com");
	    
	   
	}

	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String string1, String string2) 
	{
		
	    WebElement username=driver.findElement(By.xpath("//input[@name=\"custom_input\"]"));
	    username.sendKeys(string1);
	    
	    WebElement password=driver.findElement(By.xpath("//input[@name=\"passwd\"]"));
	    password.sendKeys(string2);
	}

	@When("I Click on login button")
	public void i_Click_on_login_button()
	{
	   WebElement button=driver.findElement(By.xpath("//button[contains(text(),\"Go\")]"));
	   button.click();
	}

	@Then("I get logged in")
	public void i_get_logged_in() throws InterruptedException 
	{
	    System.out.println("User will navigate to main page");
	    Thread.sleep(5000);
	    driver.close();
	}



	
}
