package StepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;

public class GoogleSteps 
{
    WebDriver driver;
    String title;

    @Given("Open Google application")
    public void open_google_application()
    {
        driver = new ChromeDriver(); // ChromeDriver initialize करा
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize(); // Browser maximize करा
        driver.get("https://www.google.com"); // Google open करा
    }

    @When("user get the current title of the application")
    public void user_get_the_current_title_of_the_application() 
    {
        title = driver.getTitle(); // Page title capture करा
        System.out.println("Page Title: " + title);
    }

    @Then("Title should match with Google")
    public void title_should_match_with_google()
    {
        Assertions.assertEquals("Google", title, "Title does not match!"); // Title चेक करा
        driver.quit(); // Browser बंद करा
    }
}
