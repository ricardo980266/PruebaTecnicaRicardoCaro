package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import com.thoughtworks.selenium.webdriven.commands.Click;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		System.out.println("Inside Step- User is on login page");
		System.setProperty("webdriver.chorme.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		System.out.println("user enters username and password");
		driver.findElement(By.xpath("//a[@class='login'] ")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");

		driver.findElement(By.xpath("//i[@class='icon-lock left'] ")).click();

	}

	@Then("verify user validation")
	public void verify_user_validation() {
		System.out.println("verify user validation");

		driver.quit();

	}

}
