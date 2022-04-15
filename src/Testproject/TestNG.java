package Testproject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;

public class TestNG {
	  private static final String TimeSpan = null;
	private static final String ExpectedConditions = null;
	private static final String SeleniumExtras = null;
	WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/thaosoo/Desktop/Java/eclipse-workspace/SetupSelenium1/BrownDriver/chromedriver");
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	     driver.manage().window().maximize();
	    // driver.get("https://www.facebook.com/");
	     
     //1 - Maaximize browser của mình
     //driver.manage().window().maximize();

     //2 - Đi đến 1 url
     
    // driver.navigate().to("https://anhtester.com");

     //3 - Lấy Title và in ra console
     
     System.out.println(driver.getTitle());
    
//     abcd
//     vvvv
     
  }
  @Test
  public  void Search  () throws Exception {
	driver.get("https://site.qr-row.staging.hdpp-tui.com/");
	driver.findElement(By.id  ("cmCloseBanner")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//strong[contains(text(),'Origin')]//following::input[1]")).sendKeys("FRA");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"product_39aa5347-9776-43c9-815a-cc4799d3ab49\"]/div/div/form/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div[32]/div")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='product_39aa5347-9776-43c9-815a-cc4799d3ab49']/div/div/form/div/div/div[2]/div[2]/div/div[1]/input")).sendKeys("HKT");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"product_39aa5347-9776-43c9-815a-cc4799d3ab49\"]/div/div/form/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnSubmitStopoverSeparate")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(), 'Change Flight')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(), 'Change Stopover')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='line-control line-control-0']//a[@class='btn btn-sm btn-link']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	

	//driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary bt-effect']")).click();
	//Thread.sleep(5000);

//	driver.findElement(By.xpath("//div[@class='line-control']//a[@class='btn btn-sm btn-link']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary bt-effect']")).click();
	//Thread.sleep(5000);
//	driver.findElement(By.className("mtr-input section-right")).click();
//	driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary bt-effect']]")).click();
	//Thread.sleep(5000);
//	
	
	
//	driver.findElement(By.linkText("Book")).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//li/span[contains(text()='Stopover summary']"));
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[contains(test(), 'Stopover summary')]")).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(By.linkText("Stopover Photos")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("In this Stopover")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Notes")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Terms and Conditions")).click();
//	Thread.sleep(2000);
	

	
	
  }
 
  
  
  
  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
