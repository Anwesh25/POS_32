package com_pageobjects_pos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RewardPointSetting {
	
	public WebDriver driver;
	
	public RewardPointSetting(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='#setting']")
	WebElement CSet;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/setting/reward-point-setting']")
	WebElement CRPS;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/setting/hrm_setting']")
	WebElement CHRMSet;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/brand']")
	WebElement CB;
	
	@FindBy(xpath="//*[@id=\"unit-menu\"]/a")
	WebElement CU;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/currency']")
	WebElement CC;
	
	
	public void CSetting() {
		driver.findElement(By.xpath("//a[@href='#hrm']")).click();
		CSet.click();
	}
	public void CRPSetting() throws InterruptedException {
		CRPS.click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[4]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[4]/div/input")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[2]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[2]/div/input")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[3]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[3]/div/input")).sendKeys("50");
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[5]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[5]/div/div/div/div/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[6]/button")).click();
	}
	public void CHRMS() throws InterruptedException {
		CHRMSet.click();
		System.out.println("HRM Setting Clicked");
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[36]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div[2]/form/div/div[3]/button")).click();
	}
	public void CBrand() throws InterruptedException {
		CB.click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[1]/input")).sendKeys("Ayyum");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[2]/input")).sendKeys("C:\\Users\\ayyum\\OneDrive\\Pictures\\Screenshots");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[3]/input")).click();
	}
	public void CUnit() throws InterruptedException {
		CU.click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[1]/input")).sendKeys("Ayo01");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[2]/input")).sendKeys("Ayum");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/input")).click();
	}
	public void CCurrency() {
		CC.click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[1]/input")).sendKeys("Nepal");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[2]/input")).sendKeys("NRS");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[3]/input")).sendKeys("0.44");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[4]/input")).click();
	}
	

}
