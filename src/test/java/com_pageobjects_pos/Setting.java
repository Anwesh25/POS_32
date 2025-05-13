package com_pageobjects_pos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting {
	
public WebDriver driver;
	
	public Setting(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href='#setting']")
	WebElement CSet;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/warehouse']")
	WebElement CWH;
	
	@FindBy(xpath="//a[@data-target='#createModal']")
	WebElement CAW;
	
	@FindBy(xpath="(//input[@placeholder='Type WareHouse Name...'])[1]")
	WebElement EN;
	
	@FindBy(xpath="(//input[@name='phone'])[1]")
	WebElement EP;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement EEm;
	
	@FindBy(xpath="//*[@id=\"createModal\"]/div/div/form/div[2]/div[4]/textarea")
	WebElement EAdd;
	
	@FindBy(xpath="(//input[@value='Submit'])[1]")
	WebElement CS;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement ES;
	
	@FindBy(xpath="//*[@id=\"warehouse-table_wrapper\"]/div[1]/div[3]/button[5]")
	WebElement CCV;
	
	@FindBy(xpath="//*[@id=\"warehouse-table\"]/tbody/tr[1]/td[8]/div/button")
	WebElement CA;
	
	public void Csetting() {
		CSet.click();
	}
	public void CWHouse() {
		CWH.click();
	}
	public void CAddWHouse() {
		CAW.click();
	}
	public void EName() {
		EN.sendKeys("Cleaning Essentials");
	}
	public void EPhn() {
		EP.sendKeys("9398605043");
	}
	public void EEmail() {
		EEm.sendKeys("abdulashraf@gmail.com");
	}
	public void EAddress() {
		EAdd.sendKeys("Vikarabad");
	}
	public void CSubmit() {
		CS.click();
	}
	public void ESearch() {
		ES.sendKeys("ashraf");
		driver.navigate().refresh();
	}
	public void CColVis() throws InterruptedException {
		CCV.click();
		driver.findElement(By.xpath("//*[@id=\"warehouse-table_wrapper\"]/div[1]/div[3]/div/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"warehouse-table_wrapper\"]/div[1]/div[3]/div/a[7]")).click();
		Thread.sleep(4500);
		driver.findElement(By.xpath("//*[@id=\"warehouse-table_wrapper\"]/div[1]/div[3]/div/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"warehouse-table_wrapper\"]/div[1]/div[3]/div/a[7]")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	public void CAction() throws InterruptedException {
		CA.click();
		driver.findElement(By.xpath("(//button[@class='open-EditWarehouseDialog btn btn-link'])[1]")).click();
		System.out.println("Edit clicked");
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("ware@gmail.com");
		driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();
		Thread.sleep(2500);
	}

}
