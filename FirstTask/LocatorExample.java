package FirstTask;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;


	public class LocatorExample {

	    public static void main(String[] args) {

	        // Set the path to the chromedriver executable

	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");


	        // Initialize the WebDriver

	        WebDriver driver = new ChromeDriver();


	        // Navigate to the specified URL

	        driver.get("https://example.com");


	        // Find elements using different locators

	        WebElement elementById = driver.findElement(By.id("elementId"));

	        WebElement elementByName = driver.findElement(By.name("elementName"));

	        WebElement elementByClass = driver.findElement(By.className("elementClass"));

	        WebElement elementByTag = driver.findElement(By.tagName("elementTag"));

	        WebElement elementByLinkText = driver.findElement(By.linkText("Link Text"));

	        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Partial Link Text"));

	        WebElement elementByCssSelector = driver.findElement(By.cssSelector("cssSelector"));

	        WebElement elementByXPath = driver.findElement(By.xpath("//xpathExpression"));


	        // Perform actions on the web elements

	        // ...


	        // Close the browser

	        driver.quit();

	    }

	}


