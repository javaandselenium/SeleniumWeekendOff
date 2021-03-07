package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		s.selectByIndex(2);
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		ArrayList a=new ArrayList<>();
		
		for(WebElement op:allOptions) {
			String text = op.getText();
			System.out.println(text);
			a.add(text);
		}
		
		Collections.sort(a);
		System.out.println("********after sorting*********");
		for(Object ele1:a) {
			System.out.println(ele1);
		}
		driver.close();

	}

}
