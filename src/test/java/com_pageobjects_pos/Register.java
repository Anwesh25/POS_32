package com_pageobjects_pos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
public WebDriver driver;
	
	public Register(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="register-username")
	WebElement UName;
	
	@FindBy(id="register-email")
	WebElement Email;
	
	@FindBy(id="register-phone")
	WebElement mobile;
	
	@FindBy(id="register-company")
	WebElement CName;
	
	@FindBy(id="role-id")
	WebElement Drp;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="password-confirm")
	WebElement Cpwd;
	
	@FindBy(id="register")
	WebElement Reg;
	
	public void UserName() {
		
		UName.sendKeys("Aiyum");
		
	}
	
	public void Mailid() {
		Email.sendKeys("mdayyum011@gmail.com");
	}
	
	public void Number() {
		mobile.sendKeys("8374106981");
	}
	public void ComName() {
		CName.sendKeys("W2222");
	}
	public void DropD() {
		Select sc = new Select(Drp);
		sc.selectByIndex(1);
		Drp.click();
	}
	public void Passwd() {
		pwd.sendKeys("013015As@");
	}
	public void Cpwd() {
		Cpwd.sendKeys("013015As@");
	}
	public void Regr() {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("0,150", "");
		Reg.click();
	}
	

}
