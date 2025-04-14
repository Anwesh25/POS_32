package com_pageobjects_pos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payroll {
	
	
	public WebDriver driver;
	
	//this page devided into 3 parts
	
	//1.constructor
	public Payroll(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);	
	}
	//2.idenrify web element
	//Payroll
	@FindBy(xpath = "//li[@id='payroll-menu']")
	WebElement clickPayroll;
	
	
	@FindBy(xpath = "(//a[@rel='nofollow'])[1]")
	WebElement SelectLanguage;
	@FindBy(xpath = "(//div[@id='mCSB_3']//li//a)[1]")
	WebElement SelectEnglish;
	
	
	@FindBy(id="btnFullscreen")
	WebElement btnFullScreen;
	
	@FindBy(xpath = "(//a[@rel='nofollow'])[2]")
	WebElement SelectProfile;
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	WebElement btnADD;
	
	@FindBy(xpath = "//button[@title='Select Employee...']")
	WebElement textName;
	/*/(//select[@name='payroll-table_length']//option)[2]
	@FindBy(xpath="//select[@name='account_id']")//"(//div[@class='modal-body']//button)[20]")
	WebElement drpAccount;
	@FindBy(xpath = "(//div[@class='modal-body']//button)[21]")
	WebElement drpCash;
	@FindBy(xpath="(//div[@class='modal-body']//button)[22]")
	WebElement btnSubmit;
	*/
	@FindBy(xpath = "(//input[@name='amount'])[2]")
	WebElement textAmoutn;
	
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[9]")
	WebElement close;
	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control form-control-sm']//select//option[2]")//"(//select[@name='payroll-table_length']//option)[2]")
	WebElement drpno;
	@FindBy(xpath = "//input[@type='search']")
	WebElement textSearch;
	@FindBy(xpath="//div[@class='dt-buttons btn-group']//button[1]")
	WebElement Clickpdf;
	@FindBy(xpath="//div[@class='dt-buttons btn-group']//button[4]")
	WebElement ClickDeleteA;
	@FindBy(xpath="//div[@class='dt-buttons btn-group']//button[5]")
	WebElement ClickEye;
	
	@FindBy(xpath = "//div[@class='checkbox']")
	WebElement SelectCheck;
	@FindBy(xpath = "(//button[@type='button'])[25]")
	WebElement drpActions;
	@FindBy(id = "payroll-table_next")
	WebElement Clicknext;
	
	//3.Create actions

	public void clickButtonPayroll() {
		
		clickPayroll.click();
	}
	public void clickLanguage() throws InterruptedException {
		SelectLanguage.click();
		Thread.sleep(2000);			
	}
	public void SelectEnglish() {	
		SelectEnglish.click();
	}
	public void clickFullScreen() {
		btnFullScreen.click();
	}
	public void SelectProfile() {	
		SelectProfile.click();;
	}
	public void clickADDbtn() {	
		btnADD.click();;
	}
	public void textName() {
		textName.click();
		WebElement ele=driver.findElement(By.xpath("(//input[@role='textbox'])[8]"));
		ele.sendKeys("shankar");
		driver.findElement(By.xpath("(//div[@class='dropdown-menu open show']//div)[2]")).click();
	}
	public void Amountext() {
		textAmoutn.click();
		textAmoutn.sendKeys("2434");
	}
	public void close() {
		close.click();
	}
	public void clickButtonDorpMen() {
	
	drpno.click();
	}
    public void textSearch() {	
    	textSearch.sendKeys("123");;
	}
    public void Clickpdf() {
		Clickpdf.click();
	}
    public void ClickDeleteA() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='checkbox'])[3]")).click();
		Thread.sleep(2097);
		ClickDeleteA.click();	
		Alert m=driver.switchTo().alert();
		Thread.sleep(2097);
		m.dismiss();
	}
	public void ClickEye() throws InterruptedException {
		ClickEye.click();
		Thread.sleep(2097);
		driver.findElement(By.xpath("//div[@role='menu']//a[2]")).click();
	}
	public void SelectCheck() throws InterruptedException {
		SelectCheck.click();
		Thread.sleep(2097);
		driver.findElement(By.xpath("(//div[@class='checkbox'])[1]")).click();
	}
	public void drpActions() throws InterruptedException {		
		drpActions.click();	
		Thread.sleep(2097);
		driver.findElement(By.xpath("(//div[@class='table-responsive']//tr//td//div//button)[2]")).click();
		Thread.sleep(2097);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[10]")).click();
	}
	public void Clicknext() {
		Clicknext.click();	
	}
	
}
