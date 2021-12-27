package TrainingCourse.Automationwork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Forgotpassword {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automationwork\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.facebook.com");
		WebElement Forgottenpassword=driver.findElement(By.xpath("//*[contains(text(), 'Forgotten password')]"));
		Forgottenpassword.click();
		Thread.sleep(6000);
		WebElement username=driver.findElement(By.id("identify_email"));
		username.sendKeys("email");
		Thread.sleep(6000);
		WebElement searchbutton=driver.findElement(By.name("did_submit"));
		searchbutton.click();
		Thread.sleep(6000);
		WebElement cancel=driver.findElement(By.className("_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy"));
		cancel.click();
		Thread.sleep(6000);
	}

}
