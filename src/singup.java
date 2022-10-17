
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class singup {
	@Test
	public void signup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rejin.raveendran\\Downloads\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Landingpage11 lp = new Landingpage11(driver);
		lp.goTo();
		lp.SignUpApplication("Rejin", "Ravi", "bbc@gmail.com", "dhoni", "01/01/2000", "7777777777", "hala");

	}

}
