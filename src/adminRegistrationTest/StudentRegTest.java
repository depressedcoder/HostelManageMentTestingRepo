package adminRegistrationTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class StudentRegTest {
	private WebDriver driver;
	public StudentRegTest() {
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
		WebElement config = driver.findElement(By.xpath("//a[contains(@href,'registration.php')]"));
		config.click();
		Thread.sleep(2000);
		
		//Room Related info
		Select RoomNo = new Select(driver.findElement(By.id("room")));
		RoomNo.selectByIndex(1);
		
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='1']"));
        radio2.click();
        
        WebElement DateFrom = driver.findElement(By.id("stayf"));
        DateFrom.sendKeys("01/01/2021");
        
        Select Duration = new Select(driver.findElement(By.id("duration")));
		Duration.selectByIndex(6);
		
		//Personal Info
		Select course = new Select(driver.findElement(By.id("course")));
		course.selectByIndex(1);
		
		WebElement regno = driver.findElement(By.name("regno"));
		regno.sendKeys("1011234");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Mobinur");
		
		WebElement mname = driver.findElement(By.id("mname"));
		mname.sendKeys("Rahman");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("Shanto");
		
		Select gender = new Select(driver.findElement(By.name("gender")));
		gender.selectByIndex(1);
		
		WebElement contact = driver.findElement(By.id("contact"));
		contact.sendKeys("01799752044");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("shanto.siddiq1@gmail.com");
		
		WebElement econtact = driver.findElement(By.id("econtact"));
		econtact.sendKeys("01711601410");
		
		WebElement gname = driver.findElement(By.id("gname"));
		gname.sendKeys("Siddiqur Rahman");
		
		WebElement grelation = driver.findElement(By.id("grelation"));
		grelation.sendKeys("Father");
		
		WebElement gcontact = driver.findElement(By.id("gcontact"));
		gcontact.sendKeys("01711601410");
		
		//Correspondense Address
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("hgfjgig");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("vhgjkglhiu");
		
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByIndex(1);
		
		WebElement pincode = driver.findElement(By.id("pincode"));
		pincode.sendKeys("14322");
		
		WebElement adcheck = driver.findElement(By.name("adcheck"));
		adcheck.click();
		
		
		WebElement RegisterStudent = driver.findElement(By.id("RegisterStudent"));
		RegisterStudent.click();
		
		Thread.sleep(2000);
		String actualMessage = driver.switchTo().alert().getText();
		String ExpectMessage = "Student Succssfully register";
		
		driver.switchTo().alert().accept();
		assertEquals(ExpectMessage, actualMessage);
	}
}
