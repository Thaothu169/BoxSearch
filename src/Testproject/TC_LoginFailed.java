package Testproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_LoginFailed {
	WebDriver driver;

	public void f() {
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/thaosoo/Desktop/Java/eclipse-workspace/SetupSelenium1/BrownDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

	@Test
	public void Login() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("0392132305");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		Thread.sleep(200);
		driver.findElement(By.name("login")).click();
		driver.findElement(By.className("Wrong credentials\n" + "Invalid username or password"));
	}

	@Test
	public void Signin() throws Exception {
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("thaosooz@tuivietnam");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.className("Sai thông tin đăng nhập\n" + "Tên người dùng hoặc mật khẩu không hợp lệ"));
	}

	@Test
	
	

	

	@AfterTest
	public void afterTest() {
	}

}
