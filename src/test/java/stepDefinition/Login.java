package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login {

	WebDriver driver;

	@Given("^Open the browser and URL$")
	public void Open_the_browser_and_URL() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
	}

	@When("^Enter the Username$")
	public void Enter_the_Username() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

	}

	@Then("^Enter the Password$")
	public void Enter_the_Password() {
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
	}

	@Then("^Clcik on Login button$")
	public void Clcik_on_Login_button() throws Exception {
		driver.findElement(By.name("login-button")).click();

		Thread.sleep(3000);
	}

	@Then("^Close the Browser$")
	public void Close_the_Browser() throws Exception {
		driver.close();
	}

	@When("Enter the invalid Username")
	public void enter_the_invalid_username() {

		driver.findElement(By.name("user-name")).sendKeys("problem_user");

	}
	
	
	@Then("Enter the invalid Password")
	public void enter_the_invalid_password() {
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
	}
	
	
	
	@Given("Launch the browser and open URL")
	public void launch_the_browser_and_open_url() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
	
	}
	
	
	@Then("^Enter (.*) and (.*)$")
	public void enter_and(String username, String password) {
	  
		LoginPage lp = new LoginPage(driver);
		
		lp.usernameEnter(username);
		lp.passwordEnter(password);

		
		System.out.println(username+"   :"+password);
		
	}
	
	
	@Then("print something")
	public void print_something() {
	   System.out.println("******************************************************************************");
	}
}
