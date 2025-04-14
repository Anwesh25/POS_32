package com_pageobjects_pos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login_Page {
	
	public WebDriver driver;
	//1.constructor
	public Login_Page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	//2.idenrify web elements
	
	//Login
	
	@FindBy(id= "login-username")
	WebElement TextUserName;
	
	@FindBy(id="login-password")
	WebElement textPassword;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;
	
	
	public void TextUserName() {	
		TextUserName.sendKeys("ashraf");;
	}
	public void textPassword() {
		textPassword.sendKeys("013015As");		
	}
	
	public void Submit() {
		Submit.click();
		
	}

}
