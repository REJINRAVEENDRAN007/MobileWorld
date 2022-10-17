package mobile;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class order {     
	
	WebDriver driver;
    @BeforeMethod
            @Parameters("browser")
            public void browserSelection(String browser) throws Exception{
                
                 if(browser.equalsIgnoreCase("chrome")){
                    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rejin.raveendran\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
                    driver = new ChromeDriver();
                }
                        else if(browser.equalsIgnoreCase("Edge")){
                            System.setProperty("webdriver.edge.driver","C:\\Users\\rejin.raveendran\\Downloads\\edgedriver_win64\\msedgedriver.exe");
                            driver = new EdgeDriver();
                        }
                            }             
    @Test(dataProvider="order1")
    
    public void odr(String Fname, String Lname, String Email, String Pword, String Mobile, String Address1,
            String Address2, String City, String Zip, String Count, String Time) {
        // TODO Auto-generated method stub
                Landingpage11 lp = new Landingpage11(driver);
        lp.goTo();
        lp.OrderApplication(Fname,Lname,Email,Pword,Mobile,Address1,Address2,City,Zip,Count,Time);
        Assert.assertEquals(driver.getCurrentUrl(), "https://mobileworld.banyanpro.com/index.html");
        driver.quit();
    }
    
    @Test(dataProvider="order2")
    
    public void odr2(String Fname, String Lname, String Email, String Pword, String Mobile, String Address1,
            String Address2, String City, String Zip, String Count, String Time) {
        // TODO Auto-generated method stub
               Landingpage11 lp = new Landingpage11(driver);
        lp.goTo();
        lp.OrderApplication(Fname,Lname,Email,Pword,Mobile,Address1,Address2,City,Zip,Count,Time);
        Assert.assertEquals(driver.getCurrentUrl(), "https://mobileworld.banyanpro.com/order.html");
        driver.quit();
    }
    



   @DataProvider(name="order1")
    public Object[][] getdata()
    {
        Object [][] data = new Object[1][11];
      data [0][0]="Garath";
      data [0][1]="Bale";
      data [0][2]="bale007@gmail.com";
      data [0][3]="rrr000@";
      data [0][4]="7777777777";
      data [0][5]="VV HOUSE";
      data [0][6]="Vazhunoradi";
      data [0][7]="Kanhangad";
      data [0][8]="671314";
      data [0][9]="2";
      data [0][10]="5";
      
     
            return data;
        
    }
    
    @DataProvider(name="order2")
    public Object[][] getdata1()
    {
        Object [][] data = new Object[6][11];
      data [0][0]="G";
      data [0][1]="Ba";
      data [0][2]="bale00gmail.com";
      data [0][3]="rrr1234@";
      data [0][4]="9876543215464";
      data [0][5]="vv";
      data [0][6]="rr";
      data [0][7]="pp";
      data [0][8]="1989";
      data [0][9]="-3";
      data [0][10]="-5";
      
      data [1][0]="";
      data [1][1]="";
      data [1][2]="";
      data [1][3]="";
      data [1][4]="";
      data [1][5]="";
      data [1][6]="";
      data [1][7]="";
      data [1][8]="";
      data [1][9]="";
      data [1][10]="";
      
      data [2][0]="R";
      data [2][1]="Raveendran";
      data [2][2]="bale234@gmail.com";
      data [2][3]="rrr1234#";
      data [2][4]="9446698877";
      data [2][5]="VV house";
      data [2][6]="Vazhunoradi";
      data [2][7]="Kanhankad";
      data [2][8]="671314";
      data [2][9]="3";
      data [2][10]="5";
      
      data [3][0]="Garath";
      data [3][1]="Ba";
      data [3][2]="bale007@gmail.com";
      data [3][3]="rrr000@";
      data [3][4]="7777777777";
      data [3][5]="VV HOUSE";
      data [3][6]="Vazhunoradi";
      data [3][7]="Kanhangad";
      data [3][8]="671314";
      data [3][9]="2";
      data [3][10]="5";
      
      data [4][0]="Garath";
      data [4][1]="Bale";
      data [4][2]="bale007gmail.com";
      data [4][3]="rrr000@";
      data [4][4]="7777777777";
      data [4][5]="VV HOUSE";
      data [4][6]="Vazhunoradi";
      data [4][7]="Kanhangad";
      data [4][8]="671314";
      data [4][9]="2";
      data [4][10]="5";
      
      data [5][0]="Garath";
      data [5][1]="Bale";
      data [5][2]="bale007@gmail.com";
      data [5][3]="rr";
      data [5][4]="7777777777";
      data [5][5]="VV HOUSE";
      data [5][6]="Vazhunoradi";
      data [5][7]="Kanhangad";
      data [5][8]="671314";
      data [5][9]="2";
      data [5][10]="5";
      return data;
    }

}