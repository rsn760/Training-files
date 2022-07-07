package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class regPage {
	WebDriver driver;
  @Test
  public void validReg() throws Exception {
	  driver.findElement(By.id("fname")).sendKeys("Vamsi");
		driver.findElement(By.id("lname")).sendKeys("Krishna");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("mob")).sendKeys("9876543210");
		driver.findElement(By.id("email")).sendKeys("Vamsi@gmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("987654321012");
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(1);
		driver.findElement(By.id("username")).sendKeys("Vamsi123");
		driver.findElement(By.id("password")).sendKeys("Vamsi123");
		driver.findElement(By.id("confirm-password")).sendKeys("Vamsi123");
		WebElement tcCheck = driver.findElement(By.id("checkbox"));
		Boolean selnot = tcCheck.isSelected();
		Thread.sleep(2000);
		if (selnot == false) {
			tcCheck.click();
		}
		driver.findElement(By.id("register")).click();
		Alert reg1 = driver.switchTo().alert();
		Thread.sleep(1000);
		reg1.accept();
		Thread.sleep(1000);
		reg1.accept();
		Thread.sleep(1000);
		
  }
  @Test
  public void invalidReg() throws Exception {
	  driver.findElement(By.id("fname")).sendKeys("1234");
		driver.findElement(By.id("lname")).sendKeys("krishna");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("mob")).sendKeys("Vamsi krishna");
		driver.findElement(By.id("email")).sendKeys("Vamsigmailcom");
		driver.findElement(By.id("aadhar")).sendKeys("98765432101");
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(0);
		driver.findElement(By.id("username")).sendKeys("vamsi123");
		driver.findElement(By.id("password")).sendKeys("Vamsi");
		driver.findElement(By.id("confirm-password")).sendKeys("vamsi123");
		WebElement tcCheck = driver.findElement(By.id("checkbox"));
		Boolean selnot = tcCheck.isSelected();
		Thread.sleep(2000);
		if (selnot == true) {
			tcCheck.click();
		}
		driver.findElement(By.id("register")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test completed!");
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
