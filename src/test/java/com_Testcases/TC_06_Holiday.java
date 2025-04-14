package com_Testcases;



import org.testng.annotations.Test;

import com_pageobjects_pos.Holiday;
import com_pageobjects_pos.Login_Page;


public class TC_06_Holiday extends Baseclass{
	public Login_Page lp;
	
	public Holiday ph;

	@Test
	
	public void PayRollFun() throws InterruptedException {

		lp=new Login_Page(driver);
		
		lp.TextUserName();
		lp.textPassword();
		Thread.sleep(2000);
		lp.Submit();
		
		ph=new Holiday(driver);
		ph.ClickHoliday();
		ph.ClickADD();
		Thread.sleep(2400);
		ph.closebtn();
		Thread.sleep(2090);
		ph.No();
		Thread.sleep(2030);
		ph.eye();
		Thread.sleep(2800);
		ph.Chechbox();
		ph.ClickDeletepop();
		Thread.sleep(2890);
		ph.DownloadAccessibility();
		ph.ClickEdit();
		Thread.sleep(2750);
		ph.TextSearch();
		
		
	}

}
