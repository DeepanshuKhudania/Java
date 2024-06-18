package youtuber;
import java.time.Duration;
import java.util.List;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class SdetAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		String imonth = "December";
		String iyear = "2026";
		String idate="16";
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select index = new Select(year);
		index.selectByVisibleText(iyear);
		while(true){
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if (month.equals(imonth)) {
				System.out.println("Month matched");
				break;
			}
			driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
		}
		List <WebElement> dates = driver.findElements(By.cssSelector("td a"));
		
		for (WebElement datas : dates) {
			
			String d = datas.getText();
			
			if (d.equals(idate)) {
				
				datas.click();
				break;
			}
		}
	}	
}
	


