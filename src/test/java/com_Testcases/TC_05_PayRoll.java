package com_Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_pageobjects_pos.Login_Page;
import com_pageobjects_pos.Payroll;



public class TC_05_PayRoll extends Baseclass{

	public Login_Page lp;

	public Payroll Pospayroll;
	
	@Test
	public void PayRollFun() throws InterruptedException {

		lp=new Login_Page(driver);
		
		lp.TextUserName();
		lp.textPassword();
		Thread.sleep(2000);
		lp.Submit();
		
		Pospayroll=new Payroll(driver);
		
		Pospayroll.clickButtonPayroll();
		Thread.sleep(2000);
		Pospayroll.clickLanguage();
		Pospayroll.SelectEnglish();
		Pospayroll.clickFullScreen();
		Pospayroll.SelectProfile();
		Pospayroll.clickADDbtn();
		Thread.sleep(2080);
		Pospayroll.textName();
		
		Pospayroll.Amountext();
		Thread.sleep(3040);
		Pospayroll.close();
		Pospayroll.clickButtonDorpMen();
		Pospayroll.textSearch();
		Thread.sleep(2000);
		Pospayroll.Clickpdf();
		Pospayroll.ClickDeleteA();
		Pospayroll.ClickEye();
		Pospayroll.SelectCheck();
		Thread.sleep(2000);
		Pospayroll.drpActions();
		Thread.sleep(2000);
		Pospayroll.Clicknext();
}
}