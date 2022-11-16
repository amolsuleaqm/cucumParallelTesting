package cucumberlearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login2 
{
	WebDriver driver;
	@Given("I have URL for swag website")
	public void i_have_URL_for_swag_website() 
	{
System.setProperty("webdriver.chrome.driver","D:\\Amol\\chromedriver.exe");
	    
	    driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	   
	    
	}

	@When("I enter user as {string} and pass as {string}")
	public void i_enter_user_as_and_pass_as(String string, String string2) throws InterruptedException
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='user-name']"));
	    username.sendKeys("standard_user");
	    
	    WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("secret_sauce");
	    
	   
	   Thread.sleep(5000);
	}

	@When("I click on logged in")
	public void i_click_on_logged_in() throws InterruptedException 
	{
		WebElement loginButton=driver.findElement(By.xpath("//input[@name='login-button']"));
		 loginButton.click();
		 
		 Thread.sleep(5000);
		 driver.close();
	}

	@Then("User will get loggin")
	public void user_will_get_loggin() 
	{
		System.out.println("Then user get logged in");
	}



	
}
