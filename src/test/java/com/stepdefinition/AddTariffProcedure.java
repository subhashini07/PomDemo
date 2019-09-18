package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.objectrepositary.AddTariffSteps;
import com.objectrepositary.HomePage;
import com.resources.FunctionalLibraries;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffProcedure extends FunctionalLibraries  {

	/*@Given("User should be in  Homepage")
	public void user_should_be_in_Homepage() {
	}*/

	@Given("User should click AddTariff")
	public void user_should_click_AddTariff() {
		HomePage page=new HomePage();
		clk(page.getAddTariff());
		
	}

	@When("User Enters all the details {string},{string},{string},{string},{string},{string},{string}")
	public void user_Enters_all_the_details(String Rental, String LocMin, String InterMin, String SMS, String LocCharg, String InterCharg, String SMSCharg) {
		AddTariffSteps steps=new AddTariffSteps();
		fill(steps.getRental(),"6995");
		fill(steps.getLocMin(),"120");
		fill(steps.getInterMin(),"400");
		fill(steps.getSMS(),"100");
		fill(steps.getLocCharg(),"1");
		fill(steps.getInterCharg(),"2");
		fill(steps.getSMSCharg(),"3");
		
			}

	@When("User clicks Submit")
	public void user_clicks_Submit() {
		AddTariffSteps steps=new AddTariffSteps();
		clk(steps.getSubmit());
		
	}

	@Then("User Should get displayed Congratulation message")
	public void user_Should_get_displayed_Congratulation_message() {
		WebElement msg=driver.findElement(By.xpath("//h2[contains(text(),'Congratulation you add Tariff Plan')]"));
		String text=msg.getText();
		Assert.assertTrue(text.contains("Congratulation"));
		
	}
}
