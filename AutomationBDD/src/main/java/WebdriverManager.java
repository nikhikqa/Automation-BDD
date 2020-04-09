import java.sql.Driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebdriverManager {
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		// Intialize the webdriver manager for picking up the latest browser from github
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); // create a driver for chrome browser	
		
		driver.get("https://google.com");
		closeBrowser();
		
	}
	
	public static void closeBrowser() {
		driver.close();
		driver.quit();
		System.out.print("TEST IS PASSED!");
		
	}
	
}
