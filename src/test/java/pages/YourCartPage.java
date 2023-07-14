package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Remove']")
	public WebElement remove;

	@FindBy(xpath = "//*[text() ='Checkout']")
	public WebElement Checkout;

	// Constructor Method
	public YourCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Operational Methods

	public void removeDisplay() {
		remove.isDisplayed();
	}

	public void ClickCheckout() {
		Checkout.click();
	}

}
