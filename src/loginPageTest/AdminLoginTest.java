package loginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminLoginTest {
	private WebDriver driver;
	public AdminLoginTest() {
		System.setProperty("webdriver.chrome.driver","/Users/shantosiddiq/Desktop/driver/chromedriver");
		driver = new ChromeDriver();
		
	}
	@Test
	void AdminLoginTest101() throws InterruptedException {
		driver.get("http://localhost/test/hostel/admin/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("adminUserName"));
		WebElement password = driver.findElement(By.id("adminPassword"));
		username.sendKeys("admin");
		password.sendKeys("Test@1234");
		WebElement login = driver.findElement(By.id("adminLogin"));
		login.click();
		Thread.sleep(2000);
		WebElement StudentFullDetails = driver.findElement(By.id("StudentFullDetails"));
		assertNotEquals(null, StudentFullDetails);
		driver.close();
	}
	@Test
	void AdminLoginTest102() throws InterruptedException {
		driver.get("http://localhost/test/hostel/admin/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("adminUserName"));
		WebElement password = driver.findElement(By.id("adminPassword"));
		username.sendKeys("");
		password.sendKeys("Test@1234");
		WebElement login = driver.findElement(By.id("adminLogin"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
	@Test
	void AdminLoginTest103() throws InterruptedException {
		driver.get("http://localhost/test/hostel/admin/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("adminUserName"));
		WebElement password = driver.findElement(By.id("adminPassword"));
		username.sendKeys("admin");
		password.sendKeys("");
		WebElement login = driver.findElement(By.id("adminLogin"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
	@Test
	void AdminLoginTest104() throws InterruptedException {
		driver.get("http://localhost/test/hostel/admin/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("adminUserName"));
		WebElement password = driver.findElement(By.id("adminPassword"));
		username.sendKeys("");
		password.sendKeys("");
		WebElement login = driver.findElement(By.id("adminLogin"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
	@Test
	void AdminLoginTest105() throws InterruptedException {
		driver.get("http://localhost/test/hostel/admin/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("adminUserName"));
		WebElement password = driver.findElement(By.id("adminPassword"));
		username.sendKeys("Admin");
		password.sendKeys("Teasdsd");
		WebElement login = driver.findElement(By.id("adminLogin"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
	@Test
	void AdminLoginTest106() throws InterruptedException {
		driver.get("http://localhost/test/hostel/admin/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("adminUserName"));
		WebElement password = driver.findElement(By.id("adminPassword"));
		username.sendKeys("asdasd");
		password.sendKeys("Test@1234");
		WebElement login = driver.findElement(By.id("adminLogin"));
		login.click();
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Invalid Username/Email or password";
		
		driver.switchTo().alert().accept();
		driver.close();
		assertEquals(ExpectMessage, actualMessage);
	}
}
