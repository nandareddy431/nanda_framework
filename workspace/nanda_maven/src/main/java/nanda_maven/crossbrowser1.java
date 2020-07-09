package nanda_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser1 {

	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//		CrossBrowser obj = new CrossBrowser();
		//		WebDriver driver = obj.initDriver("chrome");
		//		obj.launchURL("http://www.google.com");
		//		String title = obj.getPageTitle();
		//		System.out.println(title);
		//
		//		// verification point: checkpoint
		//		if (title.equals("Google")) {
		//			System.out.println("title is correct");
		//		} else {
		//			System.out.println("in correct title");
		//		}
		//
		//		obj.closeBrowser();


		crossbrowser1 obj = new crossbrowser1();
		WebDriver driver = obj.initDriver("chrome");
		obj.launchURL("https://app.hubspot.com/login");

		Thread.sleep(5000);

		//page locators: Page Objects
		By emailId = By.id("username");
		By pwd = By.id("password");
		By loginButton = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");

		obj.getElement(emailId).sendKeys("test@gmail.com");
		obj.getElement(pwd).sendKeys("test@123");
		obj.getElement(loginButton).click();
		obj.getElement(signUpLink).click();

		obj.closeBrowser();

	}

	public WebDriver initDriver(String browser) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("browser " + browser + " is not found");
			return null;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();

		return driver;

	}

	public void launchURL(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.quit();
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}

