package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		if(ele.isDisplayed()) {
			System.out.println("Pass:element is dispalyed");
			ele.sendKeys("jhghgfh");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		
		WebElement ch = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(ch.isSelected()) {
			System.out.println("Pass:element is selected");
		}
		else
		{
			System.out.println("Fail:element is not selected");
		}
		
		WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
	if(btn.isEnabled()) {
		System.out.println("Pass:eement is enabled");
		btn.click();
	}
	else
	{
		System.out.println("Fail:element is not enabled");
	}
	driver.close();
	}

}
