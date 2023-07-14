package maven_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DataProvider {

	WebDriver driver;

	@BeforeMethod(groups = {"Smoke"})
	public void Parameter01() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

	}

	@Test(priority = 2, dataProvider = "data",  groups = {"Smoke"})
	public void enterDetails(String name, String pwd) {

		driver.findElement(By.name("user-name")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@AfterMethod(groups = {"Smoke"})
	public void close() throws Exception {
		driver.findElement(By.name("login-button")).click();

		Thread.sleep(3000);

		driver.close();
	}
	
	
	
	@org.testng.annotations.DataProvider
	public Object[][] data()
	{
		Object[][] details = new Object[3][2];
		
		details[0][0] = "standard_user";
		details[0][1] = "secret_sauce";
		
		details[1][0] = "problem_user";
		details[1][1] = "secret_sauce";
		
		details[2][0] = "performance_glitch_user";
		details[2][1] = "secret_sauce";
		
		
		return details;
	}
	

}
