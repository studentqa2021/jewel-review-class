package com.selenium.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	WebDriver driver;
	public  SeleniumPageFactory(WebDriver driver){
		this.driver =driver;
		//selenium dev
		PageFactory.initElements(driver,this);
	}
	
	//coding ==> @ =annotation = similar like java method
	@FindBy(xpath ="//*[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath ="//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
