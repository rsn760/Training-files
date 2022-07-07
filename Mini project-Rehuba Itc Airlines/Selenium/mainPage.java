package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainPage {

	public static void main(String[] args) throws Exception {
		
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\mainpage.html");
		drive.manage().window().maximize(); 	
		System.out.println("Test started");
		drive.findElement(By.linkText("ABOUT US")).click();
		drive.findElement(By.tagName("a")).click();
		drive.findElement(By.linkText("BOOKING")).click();
		drive.findElement(By.id("click2")).click();
		drive.findElement(By.linkText("CONTACT")).click();
		drive.findElement(By.id("click")).click();
		drive.findElement(By.linkText("LOGOUT")).click();
		Thread.sleep(1000);
		drive.close();

	}

}
