package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.objectrepositary.AddCustomerSteps;
import com.objectrepositary.HomePage;
import com.resources.FunctionalLibraries;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerProcedure  extends FunctionalLibraries{
	/*@Given("User Should be in home page")
	public void user_Should_be_in_home_page() {
		
		
	}*/
	

	@Given("User Should click Addcustomer")
	public void user_Should_click_Addcustomer() {
		HomePage page= new HomePage();
		clk(page.getAddCustomer());
	}

	@When("User Enters all the details {string},{string},{string},{string},{string}")
	public void user_Enters_all_the_details(String Fname, String Lname, String Email, String Address, String MobileNo) {
		AddCustomerSteps steps=new  AddCustomerSteps();
		clk(steps.getDonebutton());
		fill(steps.getFname(),"Subha");
		fill(steps.getLname(),"Suresh");
		fill(steps.getEmail(),"gksubhashini@gmail.com");
		fill(steps.getAddress(),"Chennai");
		fill(steps.getMobileNo(),"6789567895");	
		
	}

	@When("User clicks on submit")
	public void user_clicks_on_submit() {
		
		AddCustomerSteps steps=new AddCustomerSteps();
		clk(steps.getDonebutton());
		
	}

	@Then("User Should get Customer Id Displayed")
	public void user_Should_get_Customer_Id_Displayed() {
WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
		
		Assert.assertTrue(customerId.isDisplayed());
	}
}
