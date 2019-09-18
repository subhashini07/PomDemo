package com.objectrepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibraries;

public class AddCustomerSteps extends FunctionalLibraries {
	public AddCustomerSteps()
	{
		PageFactory.initElements(driver, this);
	}
 @FindAll({
	 @FindBy(xpath="//label[@for='done']"),
		@FindBy(id="done")
         })
 private WebElement donebutton;
 
 
 @FindBy(id="fname")
 private WebElement Fname;
 @FindBy(id="lname")
 private WebElement Lname;
 @FindBy(id="email")
	private WebElement Email;
	
	public WebElement getDonebutton() {
	return donebutton;
}

public void setDonebutton(WebElement donebutton) {
	this.donebutton = donebutton;
}

public WebElement getFname() {
	return Fname;
}

public void setFname(WebElement fname) {
	Fname = fname;
}

public WebElement getLname() {
	return Lname;
}

public void setLname(WebElement lname) {
	Lname = lname;
}

public WebElement getEmail() {
	return Email;
}

public void setEmail(WebElement email) {
	Email = email;
}

public WebElement getAddress() {
	return Address;
}

public void setAddress(WebElement address) {
	Address = address;
}

public WebElement getMobileNo() {
	return MobileNo;
}

public void setMobileNo(WebElement mobileNo) {
	MobileNo = mobileNo;
}

public WebElement getSubmitButton() {
	return submitButton;
}

public void setSubmitButton(WebElement submitButton) {
	this.submitButton = submitButton;
}
	@FindBy(name="addr")
	private WebElement Address;
	
	@FindBy(id="telephoneno")
	private WebElement MobileNo;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
 
}
