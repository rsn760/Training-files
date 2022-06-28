package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearch {
  @Test
  public void AdactinHotelTestValid() {
	  String cdpath="D:\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", cdpath);
	  WebDriver d= new ChromeDriver();
	  d.get("https://www.adactinhotelapp.com/");
	  d.findElement(By.id("username")).sendKeys("Rajasekhar1234");
	  d.findElement(By.id("password")).sendKeys("Raja@123");
	  d.findElement(By.id("login")).click();
	  
	  String curl= d.getCurrentUrl();
	  String ctitle=d.getTitle();
	   System.out.println(curl);
	   System.out.println(ctitle);
	  
	  }
  
  @Test
  public void AdactinHotelTestInvalid() {
	  String cdpath="D:\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", cdpath);
	  WebDriver d= new ChromeDriver();
	  d.get("https://www.adactinhotelapp.com/");
	  d.findElement(By.id("username")).sendKeys("rajasekhar1234");
	  d.findElement(By.id("password")).sendKeys("Raja");
	  d.findElement(By.id("login")).click();
	  
	  String curl= d.getCurrentUrl();
	  String ctitle=d.getTitle();
	   System.out.println(curl);
	   System.out.println(ctitle);
	  
	  }
  @BeforeMethod 
  public void beforeMethod() {
	  System.out.println("Test Begins");
  }
  
}
