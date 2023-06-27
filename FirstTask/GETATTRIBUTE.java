package FirstTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETATTRIBUTE {
    
	
	public static void main (String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver","");
	    WebDriver driver = new ChromeDriver();   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		String text = driver.findElement(By.id("pah")).getAttribute(null);
		System.out.println(text );
}
}
