package com_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.Accounting_AccList;
import Page_Object.PLogin;
import utilities.ExcelData;

public class TC_05_AccountList extends BaseClass {
	
	public PLogin lg;
	public Accounting_AccList ACC;
	
	@Test(dataProvider = "POS_cred")
	public void AccList(String UName, String UPwd) throws InterruptedException {
		
		lg = new PLogin(driver);
		lg.ClickL();
		lg.LoginUName(UName);
		Thread.sleep(2000);
		lg.LoginPWD(UPwd);
		Thread.sleep(2000);
		lg.Submit();
		
		ACC =new Accounting_AccList(driver);
		ACC.ClickAccounting();
		ACC.ClickAccList();
		ACC.AddAccount();
		ACC.EnterAcc();
		ACC.EnterName();
		ACC.EnterIBal();
		ACC.EnterNote();
		ACC.ClickSubmit();
		ACC.EnterSearch();
		ACC.SelectRecords();
		ACC.ClickView();
		ACC.CMoneyT();
		ACC.CAddMoneyT();
		ACC.SAccount();
		ACC.CToAcc();
		ACC.EAmount();
		ACC.CSub();
		ACC.CheckBox();
		ACC.CDel();
		ACC.ESearch();
		ACC.CBSheet();
		ACC.CPRecords();
		ACC.CBSView();
		ACC.CAStmt();
		ACC.CAcct();
		ACC.SDate();
	}
	
	@DataProvider(name = "POS_cred")

	String[][] getdata() throws IOException {

		String path = "C:\\Users\\ayyum\\OneDrive\\Desktop\\Automation\\POS\\src\\test\\java\\Test_Data\\POS_cred.xlsx";

		// identify row count
		int rownum = ExcelData.getRowCount(path, "Sheet1");

		// identify column count

		int colcount = ExcelData.getCellcount(path, "Sheet1", 1);

		// Two sets of data(username,password)
		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) { // it represents rows

			for (int j = 0; j < colcount; j++) { // It represent the colums

				logindata[i - 1][j] = ExcelData.getcelldata(path, "Sheet1", i, j);
			}
		}

		return logindata;

	}

	
	

}
