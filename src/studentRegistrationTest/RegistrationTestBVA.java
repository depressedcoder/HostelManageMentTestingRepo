package studentRegistrationTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class RegistrationTestBVA {

	private WebDriver driver;
	public RegistrationTestBVA() {
		System.setProperty("webdriver.chrome.driver","/Users/shantosiddiq/Desktop/driver/chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@Test
	void StudentRegistrationTest101() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("011111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("111@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement field = driver.findElement(By.name("regno"));
		Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
		String actualMessage = (String)js.executeScript("return arguments[0].validationMessage;", field);
		
		String ExpectMessage = "Please fill in this field.";
		
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}

	@Test
	void StudentRegistrationTest102() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("b");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("222@gmail.com");
		
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
	void StudentRegistrationTest103() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("aaaaaaaaaabbbbbbbbbbccccc");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("333@gmail.com");
		
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
	void StudentRegistrationTest104() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("aaaaaaaaaabbbbbbbbbbcccc");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("444@gmail.com");
		
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
	void StudentRegistrationTest105() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("aaaaaaaaaabbb");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("555@gmail.com");
		
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
	void StudentRegistrationTest106() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("111");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("666@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123");
		
		WebElement cpassword = driver.findElement(By.id("cpassword"));
		cpassword.sendKeys("123");
		Thread.sleep(2000);
		
		WebElement RegisterStudent = driver.findElement(By.name("submit"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement field = driver.findElement(By.id("fname"));
		Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
		String actualMessage = (String)js.executeScript("return arguments[0].validationMessage;", field);
		
		String ExpectMessage = "Please fill in this field.";
		
		assertEquals(ExpectMessage, actualMessage);
		driver.close();
	}
	@Test
	void StudentRegistrationTest107() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("222");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("b");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("777@gmail.com");
		
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
	void StudentRegistrationTest108() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("333");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("aaaaaaaaaabbbbbbbbbbccccc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("888@gmail.com");
		
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
	void StudentRegistrationTest109() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("444");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("aaaaaaaaaabbbbbbbbbbcccc");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("999@gmail.com");
		
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
	void StudentRegistrationTest1010() throws InterruptedException {
		driver.get("http://localhost/test/hostel/registration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("555");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("aaaaaaaaaabbb");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("def");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("0111111111");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("123@gmail.com");
		
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
