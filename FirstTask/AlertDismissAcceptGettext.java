package FirstTask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDismissAcceptGettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
	     driver.manage().window().maximize();
         driver.get("http://omayo.blogspot.com/");

         driver.findElement(By.id("alert1")).click();

         Alert alert = driver.switchTo().alert();

         String textOnAlert = alert.getText();

         System.out.println(textOnAlert);
          // Accept alert
         alert.accept();
          //Close alert
         //alert.dismiss();

   }

}

	


