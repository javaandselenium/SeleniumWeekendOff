package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		//typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//access the method
		File src  =ts.getScreenshotAs(OutputType.FILE);
		//specify required location
		File dest=new File("./photo/ebay.png");
		//copy from src to dest
		FileUtils.copyFile(src, dest);
		driver.close();
		
	}

}
