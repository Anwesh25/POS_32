package com_Testcases;

import org.testng.annotations.Test;



public class TC_03_Department extends BaseClass {
	
	public com_pageobjects_pos.P_department PD;
	
	@Test
	public void dpt() throws InterruptedException {
		
		PD = new com_pageobjects_pos.P_department(driver);
		PD.CLogin();
		PD.EnterName();
		PD.EnterPWD();
		PD.CSubmit();
		PD.ClickDpt();
		PD.CADpt();
		PD.AddDept();
		PD.CAddSub();
		PD.EnterS();
		PD.ActionB();
		PD.CNP();
		PD.CDept();
		PD.Clickpdf();
		PD.CCBox();
		PD.CDeL();
		PD.Cview();
	}

}
