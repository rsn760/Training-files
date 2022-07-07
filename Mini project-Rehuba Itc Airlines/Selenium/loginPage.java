package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Login{
	public void validLogin() {
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\loginpage.html");
		drive.manage().window().maximize(); 	
		System.out.println("Automating for Valid Login");
		drive.findElement(By.name("username")).sendKeys("Vamsi123");
		drive.findElement(By.id("password")).sendKeys("Vamsi123");
		drive.findElement(By.id("login")).click();
		Alert la = drive.switchTo().alert();
		la.accept();
		drive.close();
	}
	public void invalidUser(){
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\loginpage.html");
		drive.manage().window().maximize();
		System.out.println("Automating for invalid username Login");
		drive.findElement(By.name("username")).sendKeys("vamsi");
		drive.findElement(By.id("password")).sendKeys("Vamsi123");
		drive.findElement(By.id("login")).click();
		drive.close();
	}
	public void inavlidPass() {
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\loginpage.html");
		drive.manage().window().maximize();
		System.out.println("Automating for invalid password Login");
		drive.findElement(By.name("username")).sendKeys("Vamsi123");
		drive.findElement(By.id("password")).sendKeys("vamsi");
		drive.findElement(By.id("login")).click();
		drive.close();
	}
	public void invalidLogin() {
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\loginpage.html");
		drive.manage().window().maximize();
		System.out.println("Automating for invalid Login");
		drive.findElement(By.name("username")).sendKeys("vamsi");
		drive.findElement(By.id("password")).sendKeys("vamsi");
		drive.findElement(By.id("login")).click();
		drive.close();
	}
	public void reg() {
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("D:\\Mini project-Rehuba Itc Airlines\\loginpage.html");
		drive.manage().window().maximize();
		System.out.println("Automating for Register from login");
		drive.findElement(By.linkText("Register here")).click();
		drive.close();
	}
}

public class loginPage {

	public static void main(String[] args) {
		
		Login log = new Login();
		log.validLogin();
		log.invalidUser();
		log.inavlidPass();
		log.invalidLogin();
		log.reg();
	}

}
