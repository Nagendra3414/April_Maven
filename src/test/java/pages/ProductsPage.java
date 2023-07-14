package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Products']")
	public WebElement products;

	@FindBy(xpath = "(//*[text() ='Add to cart'])[2]")
	public WebElement addCart;

	@FindBy(xpath = "//*[@class ='shopping_cart_link']")
	public WebElement shopCart;

	// Constructor Method
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Operational Methods

	public void productDisplay() {
		products.isDisplayed();
	}

	public void ClickAddCart() {
		addCart.click();
	}

	public void clcikShopCart() {
		shopCart.click();
	}

}
