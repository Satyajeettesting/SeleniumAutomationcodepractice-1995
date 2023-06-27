package FirstTask;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Inheritance {
	   protected WebDriver driver;

	   public Inheritance() {
	       // Set the path to the chromedriver executable
	       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	       // Initialize the WebDriver
	       driver = new ChromeDriver();
	   }

	   public void navigateToURL(String url) {
	       // Navigate to the specified URL
	       driver.get(url);
	   }

	   public void closeBrowser() {
	       // Close the browser
	       driver.quit();
	   }
	}

	public class SeleniumTest extends Inheritance {
	   public void performActions() {
	       // Perform various actions on the web page using the driver
	       // ...
	   }

	   public static void main(String[] args) {
	       SeleniumTest seleniumTest = new SeleniumTest();
	       seleniumTest.navigateToURL("https://example.com");
	       seleniumTest.performActions();
	       seleniumTest.closeBrowser();
	   }
	}

