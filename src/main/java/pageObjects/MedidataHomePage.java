package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class MedidataHomePage {
	
	
	public MedidataHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//li[@id='menu-item-160']//a[contains(text(),'Products & Services')]")
	public WebElement productsAndServicesLink;
	
	@FindBy(how=How.LINK_TEXT,using="Unified Platform")
	public WebElement unifiedPlatformLink;
	
	@FindBy(how=How.LINK_TEXT,using="Solutions")
	public WebElement solutionsLink;
	
	@FindBy(how=How.LINK_TEXT,using="Events")
	public WebElement eventsLink;
	
	@FindBy(how=How.LINK_TEXT,using="eConsent")
	public WebElement eConsentLink;
	
	
	
	public void moveToProductsAndServicesMenu() 
	{
		productsAndServicesLink.click();		
	}
	
	public void clickOnEConsentLink()
	{
		eConsentLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
