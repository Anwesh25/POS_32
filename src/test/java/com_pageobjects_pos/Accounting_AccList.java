package com_pageobjects_pos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Accounting_AccList {
	
public WebDriver driver;
	
	public Accounting_AccList(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href='#account']")
	WebElement CAcc;
	
	@FindBy(xpath="//li[@id='account-list-menu']")
	WebElement CAL;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	WebElement CAddAcc;
	
	@FindBy(xpath="(//input[@name='account_no'])[1]")
	WebElement EAcc;
	
	@FindBy(xpath="(//input[@name='name'])[1]")
	WebElement EName;
	
	@FindBy(xpath="(//input[@name='initial_balance'])[1]")
	WebElement EIB;
	
	@FindBy(xpath="(//textarea[@name='note'])[2]")
	WebElement ENote;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	WebElement CSmt;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement ESrh;
	
	@FindBy(xpath="//div[@class='btn-group bootstrap-select form-control form-control-sm']")
	WebElement SRrds;
	
	@FindBy(xpath="(//button[@type='button'])[23]")
	WebElement Cview;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/money-transfers']")
	WebElement CMT;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	WebElement CAMT;
	
	@FindBy(xpath="//*[@id=\"create-money-transfer-modal\"]/div/div/div[2]/form/div[1]/div[1]/div/button/span[1]")
	WebElement CDrpAcc;
	
	@FindBy(xpath="//*[@id=\"create-money-transfer-modal\"]/div/div/div[2]/form/div[1]/div[2]/div/button/span[1]")
	WebElement CTAcc;
	
	@FindBy(xpath="//*[@id=\"create-money-transfer-modal\"]/div/div/div[2]/form/div[1]/div[3]/input")
	WebElement EA;
	
	@FindBy(xpath="//*[@id=\"create-money-transfer-modal\"]/div/div/div[2]/form/div[2]/button")
	WebElement CS;
	
	@FindBy(xpath="//*[@id=\"money-transfer-table\"]/tbody/tr[3]/td[1]/div")
	WebElement CB;
	
	@FindBy(xpath="//*[@id=\"money-transfer-table_wrapper\"]/div[1]/div[3]/button[4]/span/i")
	WebElement CD;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement ES;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/accounts/balancesheet']")
	WebElement CBS;
	
	@FindBy(xpath="//*[@id=\"account-table_length\"]/label/div/button")
	WebElement CPR;
	
	@FindBy(xpath="//*[@id=\"account-table_wrapper\"]/div[1]/div[3]/button[4]")
	WebElement CV;
	
	@FindBy(xpath="//*[@id=\"account-statement-menu\"]")
	WebElement CAS;
	
	@FindBy(xpath="//*[@id=\"account-statement-modal\"]/div/div/div[2]/form/div[1]/div[1]/div")
	WebElement CA;
	
	@FindBy(xpath="//*[@id=\"account-statement-modal\"]/div/div/div[2]/form/div[1]/div[3]/div/input[1]")
	WebElement SD;
	
	public void ClickAccounting() {
		CAcc.click();;
	}
	public void ClickAccList() {
		CAL.click();
	}
	public void AddAccount() {
		CAddAcc.click();
	}
	public void EnterAcc() {
		EAcc.sendKeys("78451254756324");
	}
	public void EnterName() {
		EName.sendKeys("Bahul");
	}
	public void EnterIBal() {
		EIB.sendKeys("0");
	}
	public void EnterNote() {
		ENote.sendKeys("");
	}
	public void ClickSubmit() {
		CSmt.click();
	}
	public void EnterSearch() throws InterruptedException {
		ESrh.sendKeys("ashraf");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void SelectRecords() {
		SRrds.click();
		driver.findElement(By.xpath("//*[@id=\"account-table_length\"]/label/div/div/div/a[2]/span/span[1]")).click();
		System.out.println("25 selected");
	}
	public void ClickView() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",Cview );
		System.out.println("view clicked");
		driver.findElement(By.xpath("(//a[@class='dt-button dropdown-item buttons-columnVisibility active'])[2]")).click();
		Thread.sleep(2000);
	}
	public void CMoneyT() {
		CMT.click();
	}
	public void CAddMoneyT() {
		CAMT.click();
	}
	public void SAccount() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",CDrpAcc );
		System.out.println("account selected");
		WebElement b = driver.findElement(By.xpath("//*[@id=\"create-money-transfer-modal\"]/div/div/div[2]/form/div[1]/div[1]/div/div/div[2]/a[2]/span/span[1]"));
		jse.executeScript("arguments[0].click();",b );
	}
	public void CToAcc() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",CTAcc );
		WebElement c = driver.findElement(By.xpath("//*[@id=\"create-money-transfer-modal\"]/div/div/div[2]/form/div[1]/div[2]/div/div/div[2]/a[10]/span/span[1]"));
		jse.executeScript("arguments[0].click();",c);
	}
	public void EAmount() {
		EA.sendKeys("4000");
	}
	public void CSub() {
		CS.click();
		System.out.println("aMOUNT SEND");
	}
	public void CheckBox() {
		CB.click();
	}
	public void CDel() throws InterruptedException {
		CD.click();
		Alert a = driver.switchTo().alert();
	    Thread.sleep(2500);	
	    a.accept();
	}
	public void ESearch() {
		ES.sendKeys("Azeem");
	}
	public void CBSheet() {
		CBS.click();
	}
	public void CPRecords() {
		CPR.click();
		driver.findElement(By.xpath("//*[@id=\"account-table_length\"]/label/div/div/div/a[4]/span")).click();
		System.out.println("All selected");
	}
	public void CBSView() throws InterruptedException {
		CV.click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("//*[@id=\"account-table_wrapper\"]/div[1]/div[3]/div/a[1]")).click();
		Thread.sleep(3500);
		driver.findElement(By.xpath("//*[@id=\"account-table_wrapper\"]/div[1]/div[3]/div/a[1]")).click();
	}
	public void CAStmt() {
		CAS.click();
	}
	public void CAcct() {
		CA.click();
		driver.findElement(By.xpath("//*[@id=\"account-statement-modal\"]/div/div/div[2]/form/div[1]/div[1]/div/div/div/a[2]/span")).click();
	}
	public void SDate() {
		SD.click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/ul[2]/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/form/div[2]/button[1]")).click();
		WebElement d = driver.findElement(By.xpath("//*[@id=\"account-statement-modal\"]/div/div/div[2]/form/div[2]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", d);
	}
	

}
