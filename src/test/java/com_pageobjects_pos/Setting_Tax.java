package com_pageobjects_pos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Setting_Tax {
	
public WebDriver driver;
	
	public Setting_Tax(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//a[@href='#setting']")
	WebElement CSet;
	
	@FindBy(xpath="//a[@href='https://qa-pos.w3testing.com/tax']")
	WebElement CT;
	
	@FindBy(xpath="//*[@id=\"content\"]/section/div[1]/a[1]")
	WebElement CAT;
	
	@FindBy(xpath="//*[@id=\"tax-table_length\"]/label/select")
	WebElement CPR;
	
	@FindBy(xpath="//*[@id=\"tax-table\"]/tbody/tr[6]/td[4]/div/button")
	WebElement CA;
	
	@FindBy(xpath="//*[@id=\"tax-table_wrapper\"]/div[1]/div[3]/button[5]")
	WebElement CCVis;
	
	public void Cseting() {
		driver.findElement(By.xpath("//a[@href='#hrm']")).click();
		CSet.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,150)");

	}
	public void CTax() {
		CT.click();
	}
	public void CAddT() throws InterruptedException {
		CAT.click();
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[1]/input")).sendKeys("GST");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/div[2]/input")).sendKeys("15");
		driver.findElement(By.xpath("//*[@id=\"createModal\"]/div/div/form/div[2]/input")).click();
		Thread.sleep(2500);
	}
	public void CPRecords() throws InterruptedException {
		CPR.click();
		Thread.sleep(2500);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"tax-table_paginate\"]/ul/li[3]/a")).click();
	}
	public void CAction() throws InterruptedException {
		CA.click();
		driver.findElement(By.xpath("//*[@id=\"tax-table\"]/tbody/tr[6]/td[4]/div/ul/li[1]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"editModal\"]/div/div/form/div[2]/div[1]/input")).clear();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"editModal\"]/div/div/form/div[2]/div[1]/input")).sendKeys("GST-Pop Corn");
		driver.findElement(By.xpath("//*[@id=\"editModal\"]/div/div/form/div[2]/input[2]")).click();
		Thread.sleep(2500);
	}
	public void CColVis() {
		CCVis.click();
		driver.findElement(By.xpath("//*[@id=\"tax-table_wrapper\"]/div[1]/div[3]/div/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"tax-table_wrapper\"]/div[1]/div[3]/button[5]")).click();
	}

}
