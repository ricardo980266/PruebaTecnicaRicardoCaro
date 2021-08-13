package StepDefinitions.AddCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCart {

	WebDriver driver;

	@Given("navigate to url")
	public void navigate_to_url() {

		System.out.println("Inside Step- User is on login page");
		System.setProperty("webdriver.chorme.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("select a category")
	public void select_a_category() {

		// driver.findElement(By.xpath("//li//a[@title='Women']")).click();
		driver.findElement(By.xpath("//li//a[@title='Women']")).sendKeys("focus");
		driver.findElement(By.xpath("//li//a[@title='Blouses']")).click();

	}

	@And("add a product")
	public void add_a_product() {

		driver.findElement(By.xpath("//h5//a[@title='Blouse']")).sendKeys(Keys.CONTROL, Keys.END);
		driver.findElement(By.xpath("//h5//a[@title='Blouse']")).sendKeys(Keys.SHIFT, Keys.SPACE);
		driver.findElement(By.xpath("//h5//a[@title='Blouse']")).sendKeys(Keys.SHIFT, Keys.SPACE);
		driver.findElement(By.xpath("//body[1]/text()[1]")).sendKeys("focus");
		//driver.findElement(By.xpath("//h5//a[@title='Blouse']")).sendKeys("focus");
		driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();

	}

	@Then("verify product")
	public void verify_product() {

		driver.findElement(By.xpath("//h5//a[@title='Blouse']")).sendKeys("focus");
		driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")).click();

	}

}
