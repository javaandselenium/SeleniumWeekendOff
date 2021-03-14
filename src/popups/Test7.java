package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
child.remove(parent);
		
		for(String b:child) {
			Thread.sleep(5000);
			driver.switchTo().window(b);
			
			}
		
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
		
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
