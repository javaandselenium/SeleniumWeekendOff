package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,5);
//		WebElement ele = driver.findElement(By.id("username"));
//			wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.id("username"))).sendKeys("admin");

		
		
		
		
			
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement ele1 = driver.findElement(By.xpath("//div[text()='Login ']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();
		
		
		wait.until(ExpectedConditions.
				elementToBeClickable(By.xpath("//div[text()='Login ']"))).click();
		
		
		wait.until(ExpectedConditions.titleContains("trtrtrtr"))
		System.out.println(driver.getTitle());
		driver.close();
	}
		

	

}
