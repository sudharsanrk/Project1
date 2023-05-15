package GenricLib;




import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Libaries {
	
	public WebDriver driver;

	public void Scrollbar(WebElement ele) throws InterruptedException
	{
		
		Point loc=ele.getLocation();
		int X = loc.getX();
		int Y = loc.getY();
			
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy("+X+","+Y+")");
		Thread.sleep(10000);
		}
	
	public String PropertiesFile (String ele) throws IOException
	{
		Properties pro = new Properties();
        FileInputStream file = new FileInputStream(Address.propertiesfile);
        pro.load(file);
        return    pro.getProperty(ele);

	}
	
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions Actions = new Actions(driver);
		Actions.moveToElement(ele);
		Actions.click();
	}
	

	public void ScreenShort(WebDriver driver) throws IOException
	{
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
        File fs = new File(Address.Photopath);
        FileUtils.copyFile(file, fs);
        

		
	}
	
}
