package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	WebDriver driver;

	@BeforeClass(groups = { "Regression" })
	public void max() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1, groups = { "Regression" })
	public void Parameter01() {

		driver.get("https://www.saucedemo.com/");

	}

	@Test(priority = 2, groups = { "Regression" })
	@Parameters({ "username", "password" })
	public void enterDetails(String name, String pwd) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@AfterClass(groups = { "Regression" })
	public void close() throws Exception {

		Thread.sleep(3000);
		driver.findElement(By.name("login-button")).click();

		driver.close();
	}
}
