package Scripts;




import java.io.IOException;


import org.testng.annotations.Test;

import GenricLib.Baseclass;
import PomPackage.Addon;
import PomPackage.Flights;
import PomPackage.Homepage;
import PomPackage.PassangeDetails;


public class TextCase extends Baseclass
{
	@Test
public void Tc1() throws InterruptedException, IOException
{
	 test = extent.createTest("Tc1");
	Homepage Home = new Homepage(driver);
	  Home.frombuton();
	  Home.Delhielement();
	  Home.ChennaiElements();
      Home.Datebutton();
      Home.SearchFlight();
	 
	Flights f1 = new Flights(driver);
	  f1.Continue();
	
	PassangeDetails pass = new PassangeDetails(driver);
	
      pass.FirstName();
	  pass.LastName();
	  pass.PhoneNumber();
	  pass.Email();
	  pass.PassagerName();
	  pass.PassagerLast();
	  pass.PassPhoneNum();
	  pass.Cointune();
	  
	  
	Addon Add = new Addon(driver);
	  
	   Add.Continue();
	   Add.Close(driver);
	   Add.Continue();
	   Add.SkipThis();
	   
	}

}
