package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {
	WebDriver driver;
	String chromepath= "C:\\sridaran\\Selenium-java\\eclipse-workspace\\Selenium-Cucumber\\src\\test\\java\\StepDefinitions\\chromedriver.exe";
	
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver", chromepath);  
    	 driver = new ChromeDriver();
	}

	@When("Open orangehrm home page")
	public void open_orangehrm_home_page() {
	    driver.get("http://127.0.0.1/orangehrm-4.7/symfony/web/index.php/auth/login");
	}

	@Then("verify that logo is present")
	public void verify_that_logo_is_present() {
	   boolean ret = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
	   Assert.assertEquals(true, ret);
	}

	@And("close browser")
	public void close_browser() {
		driver.close();
	}
	

}
