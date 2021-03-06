package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement dd = driver.findElement(By.id("cars"));
		
	
		
		Select s=new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("199");
		
		List<WebElement> allseloption = s.getAllSelectedOptions();
		System.out.println(allseloption.size());
		
		WebElement firstselectedop = s.getFirstSelectedOption();
System.out.println(firstselectedop.getText());
	}

}
