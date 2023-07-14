package maven_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;
import pages.YourCartPage;
import pages.YourInfoPage;

public class Testcase {

	WebDriver driver;
	LoginPage lpage;
	ProductsPage ppage;
	YourCartPage ypage;
	YourInfoPage yipage;

	@BeforeMethod( groups = {"Regression", "Sanity"})
	public void BrowserLaunch() throws Exception {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(5000);
	}

	@Test( groups = {"Regression", "Sanity"})
	public void testcase1() {

		lpage = new LoginPage(driver);
		lpage.usernameEnter("standard_user");
		lpage.passwordEnter("secret_sauce");

		lpage.ClcikloginButton();

		ppage = new ProductsPage(driver);
		ppage.productDisplay();
		ppage.ClickAddCart();
		ppage.clcikShopCart();

		ypage = new YourCartPage(driver);
		ypage.removeDisplay();
		ypage.ClickCheckout();

		yipage = new YourInfoPage(driver);
		yipage.InfoPageDisplay();
		yipage.firstNameEnter("Gowthami");
		yipage.lastNameEnter("SaiLatha");
		yipage.zipCodeEnter("12433443");
	}

	@Test( groups = {"Sanity"})
	public void testcase2() {
		lpage = new LoginPage(driver);
		lpage.usernameEnter("standard_user");
		lpage.passwordEnter("secret_sauce");

		lpage.ClcikloginButton();
	}

	@Test( groups = {"Sanity"})
	public void testcase3() {
	
		lpage = new LoginPage(driver);
		lpage.usernameEnter("standard_user");
		lpage.passwordEnter("secret_sauce");

		lpage.ClcikloginButton();
		
		ppage = new ProductsPage(driver);
		ppage.productDisplay();
		ppage.ClickAddCart();
		ppage.clcikShopCart();


	}

	@AfterMethod( groups = {"Regression", "Sanity"})
	public void closeTheBrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}

}
