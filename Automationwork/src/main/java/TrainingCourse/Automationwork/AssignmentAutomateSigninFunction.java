package TrainingCourse.Automationwork;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutomateSigninFunction {
static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automationwork\\src\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.facebook.com");
	Thread.sleep(6000);
	WebElement username=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.name("pass"));
	WebElement login=driver.findElement(By.name("login"));
	username.sendKeys("email address");
	password.sendKeys("pass");
	login.click();
	
	
	

	
	

	
	}
}
