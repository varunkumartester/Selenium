package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.Baseclass;
import com.reusablities.Selenium_utilis;

public class Flipkart_pages extends Baseclass {
	
	Selenium_utilis su;
	
	public Flipkart_pages(WebDriver driver) {
		
		this.driver= driver;
		
	
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name= "q")
	
	WebElement PRODUCT;
	
@FindBy(xpath= "//button[@type='submit']")
	
	WebElement SEARCH;

@FindBy(xpath= "//div[text()='APPLE 2022 MacBook AIR M2 - (8 GB/256 GB SSD/Mac OS Monterey) MLY33HN/A']")

WebElement apple;

@FindBy(xpath= "//span[text()='✕']")

WebElement popup;

public void logindetails() throws InterruptedException {
	
	su= new Selenium_utilis(driver);
	
	su.doclick(popup);
	Thread.sleep(5000);
	
	
	su.addtext(PRODUCT, "Apple Macbook Air M2");
	Thread.sleep(3000);
	
	su.doclick(SEARCH);
	Thread.sleep(3000);
	
	su.doclick(apple);
	Thread.sleep(3000);
	
	su.windowhandle(apple);
	Thread.sleep(3000);
	
    su.doclick(popup);
	
	
	
	

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
