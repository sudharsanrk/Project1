package PomPackage;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricLib.Libaries;

public class PassangeDetails {


	public Libaries li=new Libaries();

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[1]")
	private WebElement FirstNameButton;
	
	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[2]")
	private WebElement LastNameButton;
	
	@FindBy (xpath = "(//input[@autocapitalize='sentences'])[3]")
	private WebElement PhoneNumberButton;
	
	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[4]")
	private WebElement EmailButton;
	
	
	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[5]")
	private WebElement TownOrCityButton;
	
	
	@FindBy (xpath = "(//input[@autocapitalize='sentences'])[6]")
	private WebElement PassengerFirstName;
	
	@FindBy (xpath = "(//input[@autocapitalize='sentences'])[7]")
	private WebElement PassengerLastName;
	
	@FindBy (xpath = "(//input[@autocapitalize='sentences'])[8]")
	private WebElement PassengerPhoneNum;
	
	@FindBy (xpath = "(//input[@autocapitalize='sentences'])[9]")
	private WebElement StudentsIdCadd;
	
	@FindBy (xpath = "html/body[1]/div[2]/div/div/div[5]/div/div[2]/div/div/div[2]")
	private WebElement ContinueButton;
	
	
	public void url(WebDriver driver)
	{
		String St = "https://www.spicejet.com/booking";
		
		driver.get(St);
	}
	
	
	
	public PassangeDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void FirstName() throws IOException
	{
		FirstNameButton.sendKeys(li.PropertiesFile("FirstName"));
	}
	
	public void LastName() throws IOException
	{
		LastNameButton.sendKeys(li.PropertiesFile("LastName"));
	}
	
	public void PhoneNumber() throws IOException
	{
		PhoneNumberButton.sendKeys(li.PropertiesFile("PhoneNumber"));
	}
	
	public  void Email() throws IOException
	{
		EmailButton.sendKeys(li.PropertiesFile("Email"));
	}
	
	public void Town() throws IOException
	{
		TownOrCityButton.sendKeys(li.PropertiesFile("City"));
	}
	
	public void PassagerName() throws IOException
	{
		PassengerFirstName.sendKeys(li.PropertiesFile("PassName"));
	}
	
	public void PassagerLast() throws IOException
	{
		PassengerLastName.sendKeys(li.PropertiesFile("PassLast"));
	}
	
	public void PassPhoneNum() throws IOException
	{
		PassengerPhoneNum.sendKeys(li.PropertiesFile("PassPhone"));
	}
	
	public void StudentIdCadd() throws IOException
	{
		StudentsIdCadd.sendKeys(li.PropertiesFile("StudentIdNum"));
		
	}
	
	public void Cointune() throws InterruptedException
	{
		ContinueButton.click();
		Thread.sleep(7000);
		System.out.println("PassangeDetails page is pass");
		
	}
	
	
}
