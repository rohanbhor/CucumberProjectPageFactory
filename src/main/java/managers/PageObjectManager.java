package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.MedidataHomePage;

public class PageObjectManager {

	private WebDriver driver;
	private MedidataHomePage medidataHomePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public MedidataHomePage getMedidataHomePage() {
		return (medidataHomePage == null) ? medidataHomePage = new MedidataHomePage(driver) : medidataHomePage;
	}

	
	
	
}
