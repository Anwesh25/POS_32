package com_pageobjects_pos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P_department {
	
	public WebDriver driver;
	
	public P_department(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@class='signup']")
	WebElement CL;
	
	@FindBy(xpath="//input[@id='login-username']")
	WebElement UN;
	
	@FindBy(xpath="//input[@id='login-password']")
	WebElement Pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement CS;
	
	@FindBy(xpath="//li[@id='dept-menu']")
	WebElement CDep;
	
	@FindBy(xpath="//i[@class='dripicons-plus']")
	WebElement CAD;
	
	@FindBy(xpath="//input[@placeholder='Type department name...']")
	WebElement ADept;
	
	@FindBy(xpath="(//input[@value='Submit'])[1]")
	WebElement Csubmit;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement ESearch;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select form-control form-control-sm']")
	WebElement Drpdwn;
	
	@FindBy(xpath="(//button[@class='btn btn-default btn-sm dropdown-toggle'])[1]")
	WebElement Act;
	
	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control form-control-sm']//select//option[4]")
	WebElement  NoP;
	
	@FindBy(xpath="//li[@id='dept-menu']")
	WebElement CD;
	
	@FindBy(xpath="//button[@class='btn btn-secondary buttons-pdf buttons-html5']")
	WebElement CPdf;
	
	@FindBy(xpath="(//div[@class='checkbox'])[2]")
	WebElement Ccb;
	
	@FindBy(xpath="//button[@class='btn btn-secondary buttons-delete']")
	WebElement Cdel;
	
	@FindBy(xpath="//button[@class='btn btn-secondary buttons-collection dropdown-toggle buttons-colvis']")
	WebElement CV;
	
	
	public void CLogin() {
		CL.click();
	}
	
	public void EnterName() {
		UN.sendKeys("ashraf");
	}
	
	public void EnterPWD() {
		Pwd.sendKeys("013015As");
	}
	
	public void CSubmit() throws InterruptedException {
		CS.click();
		Thread.sleep(4500);
	}
	
	public void ClickDpt() {
		CDep.click();
	}
	
	public void CADpt() throws InterruptedException {
		CAD.click();
		Thread.sleep(4500);
	}
	public void AddDept() {
		ADept.sendKeys("KidsToys");
	}
	
	public void CAddSub() throws InterruptedException {
		Csubmit.click();
		Thread.sleep(4500);
	}
	
	public void EnterS() throws InterruptedException {
		ESearch.sendKeys("KidsToys");
		Thread.sleep(4500);
		ESearch.clear();
	}
	
	public void ActionB() {
		Act.click();
	}
	
	public void CNP() {
		NoP.click();
	}
	
	public void CDept() throws InterruptedException {
		
		CD.click();
		System.out.println("Department clicked");
		Thread.sleep(4500);
	}
	
	public void Clickpdf() {
		CPdf.click();
	}
	
	public void CCBox() {
		
		Ccb.click();
	}
	
	public void CDeL() {
		
		Cdel.click();
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	
	public void Cview() throws InterruptedException {
		CV.click();
		Thread.sleep(4500);
	}
}
