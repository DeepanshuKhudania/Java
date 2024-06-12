package firstSession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver ();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(8));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
    	Set <String> windowIds= driver.getWindowHandles();
		List <String> idsWindow = new ArrayList(windowIds);
		String parent = idsWindow.get(0);
		String child = idsWindow.get(1);
		driver.switchTo().window(child);
		driver.getTitle();
	
	}

}
