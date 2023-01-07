package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinations {
	
	public WebDriver driver;
	@Given("^Initialise web driver$")
	public void initialise_web_driver() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");

	}

	@When("^user navigates to websites$")
	public void user_navigates_to_websites() throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']"));
		driver.findElement(By.xpath("//input[@id='password']"));
		driver.findElement(By.xpath("//input[@id='Login']"));

	}

	@And("^enter username and password and click on login button$")
	public void enter_username_and_password_and_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hello123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("hii");

	}
}



