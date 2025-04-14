package com_Testcases;

import org.testng.annotations.Test;

import com_pageobjects_pos.Login_Page;


public class TC_01_Login extends Baseclass{

	public Login_Page lp;
	
	@Test
	public void LumaRegistration() throws InterruptedException {
		
		lp=new Login_Page(driver);
	
		lp.TextUserName();
		lp.textPassword();
		Thread.sleep(2000);
		lp.Submit();
	}
}
