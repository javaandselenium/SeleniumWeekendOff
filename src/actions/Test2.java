package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.linkText("Selenium Training")).click();
		WebElement plus = driver.findElement(By.id("add"));
		
		a.doubleClick(plus).perform();

	}

}
