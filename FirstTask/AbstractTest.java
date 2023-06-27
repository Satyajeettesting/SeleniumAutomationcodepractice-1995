package FirstTask;


	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;


	abstract class AbstractTest {

	    protected WebDriver driver;


	    public AbstractTest() {

	        // Step 1: Set the path to the chromedriver executable

	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");


	        // Step 2: Initialize the WebDriver

	        driver = new ChromeDriver();

	    }


	    public abstract void performActions(); // Step 4: Abstract method for specific actions


	    public void navigateToURL(String url) {

	        // Step 3: Navigate to the specified URL

	        driver.get(url);

	    }


	    public void closeBrowser() {

	        // Step 5: Close the browser

	        driver.quit();

	    }

	}


	class SeleniumTest extends AbstractTest {

	    public void performActions() {

	        // Step 6: Perform various actions on the web page using the driver

	        // ...

	    }

	}


	public class AbstractionExample {

	    public static void main(String[] args) {

	        SeleniumTest seleniumTest = new SeleniumTest();

	        seleniumTest.navigateToURL("https://example.com"); // Step 7: Navigate to URL

	        seleniumTest.performActions(); // Step 8: Perform actions on the web page

	        seleniumTest.closeBrowser(); // Step 9: Close the browser

	    }

	}


