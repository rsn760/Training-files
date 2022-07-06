package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Reg{
	public void validReg() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.manage().window().maximize();
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
		System.out.println("Test completed!");
		driver.quit();
	}
	public void invalidReg() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("V123");
		driver.findElement(By.id("lname")).sendKeys("Kr123");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("mob")).sendKeys("vamsikrishna");
		driver.findElement(By.id("email")).sendKeys("Vamsigmail.com");
		driver.findElement(By.id("aadhar")).sendKeys("98765432101");
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(1);
		driver.findElement(By.id("username")).sendKeys("vamsi123");
		driver.findElement(By.id("password")).sendKeys("vamsi123");
		driver.findElement(By.id("confirm-password")).sendKeys("Vamsi123");
		WebElement tcCheck = driver.findElement(By.id("checkbox"));
		Boolean selnot = tcCheck.isSelected();
		Thread.sleep(2000);
		if (selnot == true) {
			tcCheck.click();
		}
		driver.findElement(By.id("register")).click();
		Thread.sleep(1000);
		System.out.println("Test completed!");
		driver.quit();
	}
	public void nullReg() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("register")).click();
		Thread.sleep(1000);
		System.out.println("Test completed!");
		driver.quit();
		
	}
	public void login() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		System.out.println("Test completed!");
		driver.quit();
	}
}

public class regPage {

	public static void main(String[] args) throws Exception {
		
		Reg reg = new Reg();
		reg.validReg();
		reg.invalidReg();
		reg.login();
	}

}
