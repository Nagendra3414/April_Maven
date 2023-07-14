package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInfoPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Checkout: Your Information']")
	public WebElement Your_Information;

	@FindBy(xpath = "//*[@id ='first-name']")
	public WebElement firstName;

	@FindBy(xpath = "//*[@id ='last-name']")
	public WebElement lastName;

	@FindBy(xpath = "//*[@id ='postal-code']")
	public WebElement zipCode;

	// Constructor Method
	public YourInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Operational Methods

	public void InfoPageDisplay() {
		Your_Information.isDisplayed();
	}

	public void firstNameEnter(String fname) {
		firstName.sendKeys(fname);
	}

	public void lastNameEnter(String lname) {
		lastName.sendKeys(lname);
	}

	public void zipCodeEnter(String code) {
		zipCode.sendKeys(code);
	}
}
