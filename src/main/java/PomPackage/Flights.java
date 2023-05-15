package PomPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Flights {
	
	
@FindBy (xpath = "(//div[contains(@class,'r-5njf8e')])[1]")
private WebElement FlightTime;

	
@FindBy (xpath = "html/body[1]/div[2]/div/div/div[1]/div[5]/div/div/div[3]/div[2]")
private WebElement ContinueButton;



public Flights (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}



public void FlightsTime()
{

	
	FlightTime.click();
	System.out.println("Flight page is pass");
	
	
}

public void Continue()
{
	
	
	ContinueButton.click();
}




}
