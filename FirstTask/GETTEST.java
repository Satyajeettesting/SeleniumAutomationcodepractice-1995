package FirstTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETTEST {

			// TODO Auto-generated method stub
		public static void main (String[] args) throws InterruptedException {
			//WebDriverManager.chromedriver().setup();
			 System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("WebDriver.chrome.driver","");
			ChromeDriver driver = new ChromeDriver);
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			String text = driver.findElement(By.id("pah")).getText();
			System.out.println(text );

	}

}
