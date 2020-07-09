package nanda_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("http://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("nandareddy@mail.com");
driver.findElement(By.id("pass")).sendKeys("banpr8986a");
driver.findElement(By.id("u_0_b")).click();


List<WebElement> textLists = driver.findElements(By.xpath("//input[@type='text']"));

System.out.println(textLists.size());


	}

}
