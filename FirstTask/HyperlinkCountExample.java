package FirstTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkCountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // Set the path to the chromedriver executable
	       System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver_win32\\chromedriver.exe");

	       // Launch the web browser
	       WebDriver driver = new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	       // Open the webpage
	       driver.get("https://deliveryexcellencest.cognizant.com/apps/DElite");

	       // Find all hyperlink elements
	       java.util.List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

	       // Get the count of hyperlinks
	       int count = hyperlinks.size();
	       System.out.println("Number of hyperlinks: " + count);

	       // Close the web browser
	       driver.quit();
	   }
	}

	

