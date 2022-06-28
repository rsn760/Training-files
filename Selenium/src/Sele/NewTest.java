package Sele;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewTest {
	WebDriver driver;
 @Test
 public void AdactinHotelValid() {
	 String path1="D:\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path1);
	 driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
//	 String org="Browser Launches The Adactin Hotel App! ";
//		String actual=driver.getTitle();	 
//	 Assert.assertEquals(org,actual);
	 driver.findElement(By.id("username")).sendKeys("Rajasekhar1234");
	 driver.findElement(By.id("password")).sendKeys("Raja@1234");
	 driver.findElement(By.id("login")).click();
 }
 @Test
 public void AdactinHotelInvalid() {
	 String path1="D:\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", path1);
	 driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
//	 String org="Browser Launches The Adactin Hotel App! ";
//		String actual=driver.getTitle();	 
//	 Assert.assertEquals(org,actual);
	 driver.findElement(By.id("username")).sendKeys("Raja1234");
	 driver.findElement(By.id("password")).sendKeys("Raja1234");
	 driver.findElement(By.id("login")).click();
 }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test case is started");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Test case executed");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Adactin Hotel login class started");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Adactin Hotel login class executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Adactin Hotel login test start");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Adactin Hotel login test end");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Begin");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("End");
  }

}