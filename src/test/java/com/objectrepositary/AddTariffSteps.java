package com.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibraries;

public class AddTariffSteps extends FunctionalLibraries {
	public AddTariffSteps() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="rental1")
	private WebElement Rental;
	@FindBy(id="local_minutes")
	private WebElement LocMin;
	@FindBy(id="inter_minutes")
	private WebElement InterMin;
	@FindBy(id="sms_pack")
	private WebElement SMS;
	@FindBy(id="minutes_charges")
	private WebElement LocCharg;
	@FindBy(id="inter_charges")
	private WebElement InterCharg;
	@FindBy(id="sms_charges")
	private WebElement SMSCharg;
	@FindBy(name="submit")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	public void setSubmit(WebElement submit) {
		Submit = submit;
	}
	public WebElement getRental() {
		return Rental;
	}
	public void setRental(WebElement rental) {
		Rental = rental;
	}
	public WebElement getLocMin() {
		return LocMin;
	}
	public void setLocMin(WebElement locMin) {
		LocMin = locMin;
	}
	public WebElement getInterMin() {
		return InterMin;
	}
	public void setInterMin(WebElement interMin) {
		InterMin = interMin;
	}
	public WebElement getSMS() {
		return SMS;
	}
	public void setSMS(WebElement sMS) {
		SMS = sMS;
	}
	public WebElement getLocCharg() {
		return LocCharg;
	}
	public void setLocCharg(WebElement locCharg) {
		LocCharg = locCharg;
	}
	public WebElement getInterCharg() {
		return InterCharg;
	}
	public void setInterCharg(WebElement interCharg) {
		InterCharg = interCharg;
	}
	public WebElement getSMSCharg() {
		return SMSCharg;
	}
	public void setSMSCharg(WebElement sMSCharg) {
		SMSCharg = sMSCharg;
	}
	

}
