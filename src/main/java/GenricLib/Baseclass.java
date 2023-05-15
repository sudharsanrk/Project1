package GenricLib;


import java.io.IOException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
public WebDriver driver;
public ExtentHtmlReporter htmlreport;
public ExtentHtmlReporter htmlReporter;
public ExtentReports extent;
public ExtentTest test;

 Libaries li    =   new Libaries();

        @BeforeSuite
       public void bs()
       {
        htmlReporter = new ExtentHtmlReporter("./reports/testReport.html");
        htmlReporter.config().setDocumentTitle("Make My Trip");
	    htmlReporter.config().setTheme(Theme.DARK);
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
       }
 
		@BeforeMethod
		public void openapp() throws IOException
		
		{ 

				
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
	       options.addArguments("--disable-notifications");
			
		    driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(li.PropertiesFile("Url"));
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS );
			
			
		}
		  
		
		@AfterMethod
		public void closeapp(ITestResult res) throws IOException
		{
			int result = res.getStatus();
						
		if (result==ITestResult.SUCCESS)
			{
			   test.log(Status.PASS, "Test Case is Pass");
			   test.log(Status.PASS,res.getThrowable()+  "Test Case is Pass");
				
			}
			
			else if (result==ITestResult.FAILURE)
			{
		        test.log(Status.FAIL,"Test Case is Fail");
		        
           test.log(Status.FAIL,res.getThrowable()+  "Test Case is fail");
          
			}
			
			driver.quit();
		
		}
		
	@AfterSuite
	public void as()
	{
		 extent.flush();
	}
		
       
		}


