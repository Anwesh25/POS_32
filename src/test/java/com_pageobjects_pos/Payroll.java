package com_pageobjects_pos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payroll {
	
	public WebDriver driver;
	
	public Payroll(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/payroll']")
	WebElement CP;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	WebElement CAP;
	
	@FindBy(xpath="(//span[text()='Select Employee...'])[1]")
	WebElement DrpDwn;
	
	public void Cpayroll() {
		CP.click();
	}
	public void CAddPay() {
		CAP.click();
	}
	public void SEmploy() throws AWTException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",DrpDwn);
		driver.findElement(By.xpath("(//input[@type='text'])[11]")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
