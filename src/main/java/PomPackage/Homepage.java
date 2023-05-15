package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.Libaries;

/**
 * @author sudharsan
 *
 */
public class Homepage extends Libaries {
public Libaries lib= new Libaries();
	
	@FindBy (xpath = "//div[text()='One Way']")
	private WebElement oneway;
	
	@FindBy (xpath = "//div[text()='From']")
	private WebElement from;
	
	@FindBy (xpath = "(//div[@class='css-1dbjc4n'])[66]")
	private WebElement Delhi;
	
	
	@FindBy (xpath = "//div[text()='To']")
	private WebElement To;
	
	
	@FindBy (xpath = "//div[text()='Chennai International Airport']")
	private WebElement Chennai;
	
	
	@FindBy (xpath = "(//div[text()='31'])[4]")
	private WebElement Date;   
	
	
	@FindBy (xpath = "//div[text()='Students']")
	private WebElement Students ;
	
	
	@FindBy (xpath = "(//div[contains(@style,'background')])[3]")
	private WebElement SearchFlightButton;
	
	
	 public Homepage (WebDriver driver)
	  {
	  	PageFactory.initElements(driver,this);
	  }
	public void onewaybutton()
	{
		oneway.click();

	}
        public void frombuton() throws InterruptedException
      {
	       from.click();
	     
	      
     }         
	
        public void To()
        {
        	To.sendKeys("MAA");
        }
	public void Delhielement() throws InterruptedException 
	{
		Delhi.click();
		
	}
	
	public void ChennaiElements() throws InterruptedException
	{
		
		Chennai.click();
	}
	
	public void StudentsButton()
	{
		Students.click();
	}
	
	
	public void Datebutton()
	{
		Date.click();
		
	}
	public void SearchFlight()
	{
		SearchFlightButton.click();
		System.out.println("Homepage is pass");
	}

}
