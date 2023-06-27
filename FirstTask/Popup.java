package FirstTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Development_Avecto\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage () .window() .maximize ();
		//driver.get ("https://the-internet.herokuapp.com/basic_auth");
		driver.get ("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String papeMessage=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(papeMessage);
	}

}
