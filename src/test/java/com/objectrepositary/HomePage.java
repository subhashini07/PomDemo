package com.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibraries;

public class HomePage extends FunctionalLibraries{
	public HomePage()
	{
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//a[text()='Add Customer'])[2]")
	private WebElement addCustomer;
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTariff;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public void setAddCustomer(WebElement addCustomer) {
		this.addCustomer = addCustomer;
	}

	public WebElement getAddTariff() {
		return addTariff;
	}

	public void setAddTariff(WebElement addTariff) {
		this.addTariff = addTariff;
	}
	
}
