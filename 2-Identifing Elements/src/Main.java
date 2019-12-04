import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rafiqayasini\\Documents\\selenium\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
        driver.findElement(By.id("login1")).sendKeys("Mike");
        driver.findElement(By.name("passwd")).sendKeys("abc123");
        driver.findElement( By.linkText("Forgot Password?")).click();
        Thread.sleep(5000);
        
        
  
        

	}

}
