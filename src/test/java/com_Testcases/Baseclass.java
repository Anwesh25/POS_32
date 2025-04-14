package com_Testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {
	
	//Develop the common Functionality
	public static  WebDriver driver;
	//public Logger log;//object creation
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApplication(String br,String URL) {
		
		if(br.equals("chrome")) {
			
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			
			driver=new EdgeDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*/log4j	
		log=Logger.getLogger("POosApp");
		PropertyConfigurator.configure("Log4j.properties");
	*/
	
	}
	
	//screen shot
	public String captureScreen(String tname) {
		
		 String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 TakesScreenshot screenshot=((TakesScreenshot)driver);
	     File source=screenshot.getScreenshotAs(OutputType.FILE);
			
			//project home directory (./)
	     String destination=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
			try {
				FileUtils.copyFile(source, new File(destination));
			}catch(Exception e) {
				e.getMessage();
			}
			return destination;	

}
	
	/*@AfterClass
	public void closeApplication() {
		
		driver.close(); 
	} */
	

}
