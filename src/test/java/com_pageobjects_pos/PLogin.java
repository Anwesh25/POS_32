package com_pageobjects_pos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PLogin {
	
	public WebDriver driver;
	
	public PLogin(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='signup']")
	WebElement CL;
	
	@FindBy(xpath="//input[@id='login-username']")
	WebElement LUN;
	
	@FindBy(id="login-password")
	WebElement LP;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Bsub;
	
	public void ClickL() throws InterruptedException {
		CL.click();
		Thread.sleep(4500);	}
	
	public void LoginUName(String UName) {
		LUN.sendKeys(UName);
	}
	
	public void LoginPWD(String UPwd) {
		LP.sendKeys(UPwd);
	}
	
	public void Submit() {
		Bsub.click();
	}
}
