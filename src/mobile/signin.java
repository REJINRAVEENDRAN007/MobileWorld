package mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class signin {



	WebDriver driver;
   @Test(dataProvider="signin")
    public void sign(String username,String Password) throws Exception
    {
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejin.raveendran\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
             
            Landingpage11 page =new Landingpage11(driver);
            page.goTo();
            page.sign_in(username,Password);
            Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");      
            driver.close();
        }
   
   
   @Test(dataProvider="signin1")
   public void sign1(String username,String Password) throws Exception
   {
   
       System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rejin.raveendran\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
            
       Landingpage11 page =new Landingpage11(driver);
       page.goTo();
       page.sign_in(username,Password);
           
           Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/signin.html");      
           driver.close();
       }
   
   
   
   
    @DataProvider(name="signin")
    public Object[][] getdata()
    {
        Object [][] data = new Object[1][2];
      data [0][0]="Rejin";
      data [0][1]="ppppp";
      
      return data;
    }
    @DataProvider(name="signin1")
    public Object[][] getdata1()
    {
        Object [][] data = new Object[4][2];
      
      data [0][0]="rr";
      data [0][1]="7777";
      
      data [1][0]="everybodywillwinthematchwhileplaying";
      data [1][1]="Rejin777";
      
      data [2][0]="rejin@#$";
      data [2][1]="A123456789";
      
      data [3][0]="";
      data [3][1]="";
      return data;
      
        
    }
}