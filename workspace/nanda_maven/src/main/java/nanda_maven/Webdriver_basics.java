package nanda_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver.exe");*/
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();//launch chrome
		driver.get("http://www.google.com");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		
		String title=driver.getTitle();
		System.out.println("title is "+ title);
		
		//verification point
		if(title.equals("google"))
		{
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is incorrect");
		}
		
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
