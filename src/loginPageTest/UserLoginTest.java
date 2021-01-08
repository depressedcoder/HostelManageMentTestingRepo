package loginPageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class UserLoginTest {
	private WebDriver driver;
	public UserLoginTest() {
		System.setProperty("webdriver.chrome.driver","/Users/shantosiddiq/Desktop/driver/chromedriver");
		driver = new ChromeDriver();
		
	}
	@Test
	void UserLoginTestt101() throws InterruptedException {
		driver.get("http://localhost/test/hostel/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("emailreg"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("10806121");
		password.sendKeys("Test@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "http://localhost/test/hostel/dashboard.php";
		assertEquals(ActualUrl, ExpectedUrl);
		driver.close();
	}
	@Test
	void UserLoginTest102() throws InterruptedException {
		driver.get("http://localhost/test/hostel/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("emailreg"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("");
		password.sendKeys("Test@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "http://localhost/test/hostel/dashboard.php";
		driver.close();
		assertEquals(ActualUrl, ExpectedUrl);
	}
	@Test
	void UserLoginTest103() throws InterruptedException {
		driver.get("http://localhost/test/hostel/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("emailreg"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("10806121");
		password.sendKeys("");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "http://localhost/test/hostel/dashboard.php";
		driver.close();
		assertEquals(ActualUrl, ExpectedUrl);
	}
	@Test
	void UserLoginTest104() throws InterruptedException {
		driver.get("http://localhost/test/hostel/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("emailreg"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("");
		password.sendKeys("");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String ActualUrl = driver.getCurrentUrl();
		String ExpectedUrl = "http://localhost/test/hostel/dashboard.php";
		driver.close();
		assertEquals(ActualUrl, ExpectedUrl);
	}
	@Test
	void UserLoginTest105() throws InterruptedException {
		driver.get("http://localhost/test/hostel/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("emailreg"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("hjvkjh");
		password.sendKeys("Test@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
	@Test
	void UserLoginTest106() throws InterruptedException {
		driver.get("http://localhost/test/hostel/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("emailreg"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("10806121");
		password.sendKeys("adadas");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
}
