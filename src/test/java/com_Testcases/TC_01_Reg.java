package com_Testcases;

import org.testng.annotations.Test;


public class TC_01_Reg extends BaseClass {
	
	public com_pageobjects_pos.Register Rg;
	
	@Test
	public void TCR() throws InterruptedException {
		
		Rg = new com_pageobjects_pos.Register(driver);
		
		Rg.UserName();
		Rg.Mailid();
		Rg.Number();
		Rg.ComName();
		Rg.DropD();
		Rg.Passwd();
		Rg.Cpwd();
		Rg.Regr();
		Thread.sleep(4500);
		
	}

}
