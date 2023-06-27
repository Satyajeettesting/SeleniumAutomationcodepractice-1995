package FirstTask;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       // WebDriverManager.chromedriver().setup(); 
		System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
        
         driver.manage().window().maximize();
         driver.get("http://omayo.blogspot.com/");

         //Write code here
        String firstWindow = driver.getWindowHandle();

         driver.findElement(By.linkText("Open a popup window")).click();

        Thread.sleep(3000);

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> itr = windows.iterator();

         while(itr.hasNext()) {

               String window = itr.next();

                driver.switchTo().window(window);

                if(driver.getTitle().equals("Basic Web Page Title")) {
                      driver.close();
               }

        }


        Thread.sleep(3000);

         driver.switchTo().window(firstWindow);

         driver.findElement(By.name("q")).sendKeys("Arun");

 }



	}


