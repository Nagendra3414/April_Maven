package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id ='user-name']")
	public WebElement username;

	@FindBy(xpath = "//*[@id ='password']")
	public WebElement password;

	@FindBy(xpath = "//*[@id ='login-button']")
	public WebElement loginButton;

	@FindBy(xpath = "//*[text() ='Epic sadface: Username is required']")
	public WebElement uidBlank;

	@FindBy(xpath = "//*[text() ='Epic sadface: Password is required']")
	public WebElement pwdBlank;

	@FindBy(xpath = "//*[text() ='Epic sadface: Username and password do not match any user in this service']")
	public WebElement invalidDetailsError;

	// Constructor Method
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Operational Methods

	public void usernameEnter(String name) {
		username.sendKeys(name);
	}

	public void passwordEnter(String pwd) {
		password.sendKeys(pwd);
	}

	public void ClcikloginButton() {
		loginButton.click();
	}

	public void uidBlankDisplayed() {
		uidBlank.isDisplayed();
	}

	public void pwdBlankDisplayed() {
		pwdBlank.isDisplayed();
	}

	public void invalidUIDorPwdDisplayed() {
		invalidDetailsError.isDisplayed();
	}

}
