
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
    
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rejin.raveendran\\Downloads\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
             
            SignInPackage page =new SignInPackage(driver);
            page.goTo();
            page.signinbutton().click();
            Thread.sleep(2000);
            page.uname().sendKeys(username);
            Thread.sleep(2000);
            page.pwd().sendKeys(Password);
            Thread.sleep(2000);
            page.loginbutton().click();
            driver.close();
        }
    @DataProvider(name="signin")
    public Object[][] getdata()
    {
        Object [][] data = new Object[4][2];
      data [0][0]="Rejin";
      data [0][1]="ppppp";
      
      data [1][0]="rr";
      data [1][1]="7777";
      
      data [2][0]="everybodywillwinthematchwhileplaying";
      data [2][1]="Rejin777";
      
      data [3][0]="rejin@#$";
      data [3][1]="A123456789";
      return data;
        
    }
}