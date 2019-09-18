package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibraries {
	public static WebDriver driver;
	public static void Launch(String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshG\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.getCurrentUrl();
	}
	
	public static void fill(WebElement elem,String value) {
		elem.sendKeys(value);
	}
	public static void clk(WebElement elem) {
		elem.click();
	}

}
