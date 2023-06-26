package Practicecoding;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException  {
            
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("http://omayo.blogspot.com/");
            
            WebElement requiredFrame = driver.findElement(By.id("iframe2"));
            
             driver.switchTo().frame(requiredFrame);
            
             driver.findElement(By.linkText("Chapter3")).click();
            
     }


	}
}
