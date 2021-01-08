package studentRegistrationTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class RegistrationTestEquivalance {

	private WebDriver driver;
	public RegistrationTestEquivalance() {
		System.setProperty("webdriver.chrome.driver","/Users/shantosiddiq/Desktop/driver/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@Test
	void StudentRegistrationTest1011() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("1111");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("aaaaaaaaaa");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("011111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("1111@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Student Succssfully register";
		
		driver.switchTo().alert().accept();
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}

	@Test
	void StudentRegistrationTest1012() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("2222");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("2222@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement field = driver.findElement(By.id("lname"));
		Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
		String actualMessage = (String)js.executeScript("return arguments[0].validationMessage;", field);
		
		String ExpectMessage = "Please fill in this field.";
		
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}
	@Test
	void StudentRegistrationTest1013() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("3333");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("aaaaaaaaaabbbbbbbbbbccccccc");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("3333@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Student register UnSuccssful";
		
		driver.switchTo().alert().accept();
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}
	@Test
	void StudentRegistrationTest1014() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("4444");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(0);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("4444@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement field = driver.findElement(By.name("gender"));
		Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
		String actualMessage = (String)js.executeScript("return arguments[0].validationMessage;", field);
		
		String ExpectMessage = "Please select an item in the list.";
		
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}
	@Test
	void StudentRegistrationTest1015() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("5555");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("5555@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Student Succssfully register";
		
		driver.switchTo().alert().accept();
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}
	@Test
	void StudentRegistrationTest1016() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("6666");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(2);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("6666@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Student Succssfully register";
		
		driver.switchTo().alert().accept();
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}
	@Test
	void StudentRegistrationTest1017() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("7777");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(3);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("7777@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Student Succssfully register";
		
		driver.switchTo().alert().accept();
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}

}
