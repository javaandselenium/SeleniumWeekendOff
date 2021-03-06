package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement dd = driver.findElement(By.id("cars"));
		
		Select s=new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("199");
		//s.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
		System.out.println(s.isMultiple());
		if(s.isMultiple()) {
//			s.deselectByIndex(0);
//			Thread.sleep(3000);
//			s.deselectByValue("199");
//			//s.deselectByVisibleText("INR 50 - INR 99 ( 1 ) ");
			s.deselectAll();
		}
		Thread.sleep(3000);
		driver.close();
		
	}

}
