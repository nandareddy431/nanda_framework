package nanda_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
	
     public WebDriver driver;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Crossbrowser obj= new Crossbrowser();
WebDriver driver= obj.initdriver("firefox");
driver.get("http:/www.google.com");

	}
	
	public WebDriver initdriver(String browser){
	{
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		}
		else if(browser.equals("firefox"))
			{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("browser" + browser +  "is not found");}
		}
	
	    return driver;
	}
	
	
	}
