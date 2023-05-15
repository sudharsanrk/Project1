package PomPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Addon {
	

	@FindBy(xpath = "//div[contains(@data-testid,'continue')]")
	private WebElement ContinueButton;
	
		//	html/body[1]/div[3]/div/div/div[5]/div/div/div[2]/div/div/div[4]
	
	@FindBy (xpath = "//span[text()='Skip this to skip comfort.']")
	private WebElement SkipthisButton;
	
	@FindBy (xpath = "//div[@class='at_addon_close']")
	private WebElement CloseIcon;
	
	
	
	public Addon (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Continue() throws InterruptedException
	{
		Thread.sleep(21000);
		ContinueButton.click();
		
	}
	
	public void SkipThis()
	{
		SkipthisButton.click();
		System.out.println("Addon page is pass");
	}
	
	public void Close(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(15000);
		CloseIcon.click();
		
	}
	 
	
}
