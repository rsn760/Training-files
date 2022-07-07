package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class loginPage {
	WebDriver drive;
  @Test
  public void validLogin() {
	  System.out.println("Automating for Valid Login");
	  drive.findElement(By.name("username")).sendKeys("Vamsi123");
		drive.findElement(By.id("password")).sendKeys("Vamsi123");
		drive.findElement(By.id("login")).click();
		Alert la = drive.switchTo().alert();
		la.accept();
  }
  @Test
  public void invalidUser() {
	  System.out.println("Automating for invalid user Login");
	  drive.findElement(By.name("username")).sendKeys("vamsi");
		drive.findElement(By.id("password")).sendKeys("Vamsi123");
		drive.findElement(By.id("login")).click();
	
  }
  @Test
  public void invalidPass() {
	  System.out.println("Automating for invalid password Login");
	  drive.findElement(By.name("username")).sendKeys("Vamsi123");
		drive.findElement(By.id("password")).sendKeys("vamsi");
		drive.findElement(By.id("login")).click();
		
  }
  @Test
  public void invalidLogin() {
	  System.out.println("Automating for invalid Login");
	  drive.findElement(By.name("username")).sendKeys("12341234");
		drive.findElement(By.id("password")).sendKeys("12341234");
		drive.findElement(By.id("login")).click();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\loginpage.html");
		drive.manage().window().maximize(); 	
		
  }

  @AfterMethod
  public void afterMethod() {
	  drive.close();
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
