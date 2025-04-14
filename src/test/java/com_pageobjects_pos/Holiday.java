package com_pageobjects_pos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Holiday {
	public WebDriver driver;
	public Holiday(WebDriver driver) {
		this.driver=driver;		
		PageFactory.initElements(driver, this);	
		}
	@FindBy(xpath = "//a[text()='Holiday']")
	WebElement  ClickHoliday;
	@FindBy(xpath = "//button[@class='btn btn-info']")
	WebElement  ClickADD;
	@FindBy(xpath = "(//button[@aria-label='Close'])[9]")
	WebElement  closebtn;
	@FindBy(xpath = "//div[@class='btn-group bootstrap-select form-control form-control-sm']//select//option[3]")
	WebElement  No;
	@FindBy(xpath = "//div[@class='dt-buttons btn-group']//button[5]")
	WebElement  eye;
	@FindBy(xpath = "(//table[@id='holiday-table']//div[@class='checkbox'])[3]")
	WebElement  Chechbox;
	
	@FindBy(xpath="//div[@class='dt-buttons btn-group']//button[4]")
	WebElement ClickDeletepop;
	@FindBy(xpath = "//div[@class='dt-buttons btn-group']//button[2]")
	WebElement  DownloadAccessibility;
	
	@FindBy(xpath = "(//button[@title='Edit'])[2]")
	WebElement  ClickEdit;
	@FindBy(xpath = "//input[@type='search']")
	WebElement  TextSearch;
	
	public void ClickHoliday() {
		ClickHoliday.click();
	}
	public void ClickADD() {
		ClickADD.click();
	}
	public void closebtn() {
		driver.findElement(By.xpath("(//input[@name='to_date'])[1]")).click();
	    WebElement e2=driver.findElement(By.xpath("(//table[@class='table-condensed']//tr//td)[25]"));
	    e2.click();
		closebtn.click();
	}
    public void No() {
    	
    	No.click();
	}
    public void eye() {
		eye.click();
		driver.findElement(By.xpath("//div[@role='menu']//a[4]")).click();

	}
	public void Chechbox() {
		Chechbox.click();
	} 
	
	public void ClickDeletepop() throws InterruptedException {
		WebElement e3= driver.findElement(By.xpath("(//div[@class='checkbox'])[2]"));
		e3.click();
		Thread.sleep(2097);
		ClickDeletepop.click();	
		Alert m=driver.switchTo().alert();
		Thread.sleep(2097);
		m.dismiss();
	}
    
	public void DownloadAccessibility() {
		DownloadAccessibility.click();
	}
	
	public void ClickEdit() throws InterruptedException {
		ClickEdit.click();
		Thread.sleep(2097);
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[10]")).click();

	}
	public void TextSearch() {
	    TextSearch.sendKeys("ravi");   
	 }
}

