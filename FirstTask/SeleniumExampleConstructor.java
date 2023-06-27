package FirstTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExampleConstructor {
		   private WebDriver driver;

		   public SeleniumExampleConstructor() {
		       // Set the path to the chromedriver executable
		       System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		       // Initialize the WebDriver
		       driver = new ChromeDriver();
		   }

		   public void navigateToURL(String url) {
		       // Navigate to the specified URL
		       driver.get(url);
		   }

		   public void performActions() {
		       // Perform various actions on the web page using the driver
		       // ...
		   }

		   public void closeBrowser() {
		       // Close the browser
		       driver.quit();
		   }

		   public static void main(String[] args) {
		       SeleniumExampleConstructor seleniumExample = new SeleniumExampleConstructor();
		       seleniumExample.navigateToURL("https://example.com");
		       seleniumExample.performActions();
		       seleniumExample.closeBrowser();
		   }
		
		   
}

