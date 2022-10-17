package mobile;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class singup {
	@Test(dataProvider="signup1")
	public void signup1(String fname,String lname ,String email,String password,String dob,String pnumber,String sbio  ) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\rejin.raveendran\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Landingpage11 lp = new Landingpage11(driver);
		lp.goTo();
		lp.SignUpApplication(fname, lname, email, password, dob, pnumber, sbio);
		 boolean al=isAlertPresent(driver) ;
		 Assert.assertTrue(al);
		 driver.quit();
	}
	

	@Test(dataProvider="signup2")
	public void signup2(String fname,String lname ,String email,String password,String dob,String pnumber,String sbio  ) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\rejin.raveendran\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Landingpage11 lp = new Landingpage11(driver);
		lp.goTo();
		lp.SignUpApplication(fname, lname, email, password, dob, pnumber, sbio);
		 boolean al=isAlertPresent(driver) ;
		 Assert.assertFalse(al);
		 driver.quit();
	}
	
	public boolean isAlertPresent(WebDriver driver)
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
    }   // isAlertPresent
	

    @DataProvider(name="signup1")
    public Object[][] getdata()
    {
        Object [][] data = new Object[1][7];
      data [0][0]="Rejin";
      data [0][1]="Ravi";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2000";
      data [0][5]="7777777777";
      data [0][6]="hala";
    
      
     
            return data;
        
    }
    
    @DataProvider(name="signup2")
    public Object[][] getdata1()
    {
        Object [][] data = new Object[13][7];
        data [0][0]="Re";
        data [0][1]="Ri";
        data [0][2]="bbcgmail.com";
        data [0][3]="i@";
        data [0][4]="01/01/2222";
        data [0][5]="77777777773333";
        data [0][6]="ha";
      
      data [1][0]="";
      data [1][1]="";
      data [1][2]="";
      data [1][3]="";
      data [1][4]="";
      data [1][5]="";
      data [1][6]="";
     
      
      data [0][0]="Re";
      data [0][1]="Ravi";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2000";
      data [0][5]="7777777777";
      data [0][6]="hala";
      
      
      data [0][0]="Rejin";
      data [0][1]="Ra";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2000";
      data [0][5]="7777777777";
      data [0][6]="hala";
     
      
      data [0][0]="Rejin";
      data [0][1]="Ravi";
      data [0][2]="bbcgmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2000";
      data [0][5]="7777777777";
      data [0][6]="hala";
  
      data [0][0]="Rejin";
      data [0][1]="Ravi";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dh";
      data [0][4]="01/01/2000";
      data [0][5]="7777777777";
      data [0][6]="hala";
    
      
      data [0][0]="Rejin";
      data [0][1]="Ravi";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2222";
      data [0][5]="7777777777";
      data [0][6]="hala";
    
      
      data [0][0]="Rejin";
      data [0][1]="Ravi";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2222";
      data [0][5]="77777777779999";
      data [0][6]="hala";
      
      data [0][0]="Rejin";
      data [0][1]="Ravi";
      data [0][2]="bbc@gmail.com";
      data [0][3]="dhoni@";
      data [0][4]="01/01/2222";
      data [0][5]="7777777777";
      data [0][6]="ha";
      
     
      
            return data;
        
    }
	
}
