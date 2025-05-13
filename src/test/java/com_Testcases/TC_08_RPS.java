package com_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page_Object.PLogin;
import Page_Object.RewardPointSetting;
import utilities.ExcelData;

public class TC_08_RPS extends BaseClass {
	
	public PLogin lg;
	public RewardPointSetting RPS;
	
	@Test(dataProvider = "POS_cred")
	public void RPsetting(String UName, String UPwd) throws InterruptedException {
		
		lg = new PLogin(driver);
		
		lg.ClickL();
		lg.LoginUName(UName);
		lg.LoginPWD(UPwd);
		lg.Submit();
		
		RPS = new RewardPointSetting(driver);
		RPS.CSetting();
		RPS.CRPSetting();
		RPS.CHRMS();
		RPS.CBrand();
		RPS.CUnit();
		RPS.CCurrency();
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
