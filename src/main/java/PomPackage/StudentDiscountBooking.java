package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentDiscountBooking {

	@FindBy (xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]")
	private WebElement StudentsBookungPopup;
	
	@FindBy (xpath = "((//div[text()='Continue'])[2]")
	private WebElement Continue;
	
	  public StudentDiscountBooking (WebDriver driver)
	  {
	  	PageFactory.initElements(driver,this);
	  }
	
	
	
	public void StudentPopu()
	{
		StudentsBookungPopup.click();
		
	}
	
	public void ContinueButton()
	{
		Continue.click();
	}
	
	
}
