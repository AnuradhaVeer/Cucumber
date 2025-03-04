package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwaglabsStepdeft 
{
   WebDriver driver;
	
	
	@Given("I open the SwagLab application")
	public void i_open_the_swag_lab_application() 
	{
	    driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("I enter a valid username and password")
	public void i_enter_a_valid_username_and_password(String un,String pwd) 
	{
	  driver.findElement(By.id("user-name")).sendKeys(un);
	  driver.findElement(By.id("password")).sendKeys(pwd);
		
			
	}

	@When("I click on the SwagLab login button")
	public void i_click_on_the_swag_lab_login_button() 
	{
	  driver.findElement(By.id("login-button")).click();
	}

	@Then("I should be able to log in and navigate to the inventory page")
	public void i_should_be_able_to_log_in_and_navigate_to_the_inventory_page() 
	{
		
		
	    
	}


}
