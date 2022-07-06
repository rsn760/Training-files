package Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Book{
public void booksub() throws Exception {
	String path1="D:\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path1);
	WebDriver driver=new ChromeDriver();
	driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/bookingusha.html");
	driver.manage().window().maximize();
	Select s1 = new Select(driver.findElement(By.name("depart")));
	s1.selectByIndex(1);
	Select s2 = new Select(driver.findElement(By.name("destin")));
	s2.selectByIndex(2);
	Select s3 = new Select(driver.findElement(By.name("preAir")));
	s3.selectByIndex(3);
	Select s4 = new Select(driver.findElement(By.name("preSeat")));
	s4.selectByIndex(4);
	Select s5 = new Select(driver.findElement(By.name("adult")));
	s5.selectByIndex(5);
	Select s6 = new Select(driver.findElement(By.name("children")));
	s6.selectByIndex(6);
	Select s7 = new Select(driver.findElement(By.name("infant")));
	s7.selectByIndex(2);
	WebElement frBtn=driver.findElement(By.id("radio"));
	frBtn.click();
	driver.findElement(By.id("Arrival")).sendKeys("01-02-2022");
	driver.findElement(By.id("Departure")).sendKeys("12-12-2012");
	driver.findElement(By.id("fname")).sendKeys("Vamsi");
	driver.findElement(By.id("lname")).sendKeys("Krishna");
	driver.findElement(By.id("dob")).sendKeys("27-07-2000");
	driver.findElement(By.name("email")).sendKeys("vamsi@gmail.com");
	driver.findElement(By.name("phone")).sendKeys("9876543210");
	driver.findElement(By.id("sub")).click();
	Alert reg1 = driver.switchTo().alert();
	Thread.sleep(1000);
	reg1.dismiss();
	driver.findElement(By.id("sub")).click();
	Thread.sleep(1000);
	reg1.accept();
	Thread.sleep(1000);
	reg1.accept();
	Thread.sleep(1000);
	System.out.println("Test completed!");
	driver.quit();
	}
	
	public void bookclear() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/bookingusha.html");
		driver.manage().window().maximize();
		Select s1 = new Select(driver.findElement(By.name("depart")));
		s1.selectByIndex(1);
		Select s2 = new Select(driver.findElement(By.name("destin")));
		s2.selectByIndex(2);
		Select s3 = new Select(driver.findElement(By.name("preAir")));
		s3.selectByIndex(3);
		Select s4 = new Select(driver.findElement(By.name("preSeat")));
		s4.selectByIndex(4);
		Select s5 = new Select(driver.findElement(By.name("adult")));
		s5.selectByIndex(5);
		Select s6 = new Select(driver.findElement(By.name("children")));
		s6.selectByIndex(6);
		Select s7 = new Select(driver.findElement(By.name("infant")));
		s7.selectByIndex(2);
		WebElement frBtn=driver.findElement(By.id("radio"));
		frBtn.click();
		driver.findElement(By.id("Arrival")).sendKeys("01-02-2022");
		driver.findElement(By.id("Departure")).sendKeys("12-12-2012");
		driver.findElement(By.id("fname")).sendKeys("Vamsi");
		driver.findElement(By.id("lname")).sendKeys("Krishna");
		driver.findElement(By.id("dob")).sendKeys("27-07-2000");
		driver.findElement(By.name("email")).sendKeys("vamsi@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("9876543210");
		driver.findElement(By.id("reset")).click();
		Alert reg1 = driver.switchTo().alert();
		Thread.sleep(1000);
		reg1.dismiss();
		Thread.sleep(1000);
		driver.findElement(By.id("reset")).click();
		Thread.sleep(1000);
		reg1.accept();
		Thread.sleep(1000);
		System.out.println("Test completed!");
		driver.quit();
	}
	public void invalidBook() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/bookingusha.html");
		driver.manage().window().maximize();
		Select s1 = new Select(driver.findElement(By.name("depart")));
		s1.selectByIndex(0);
		Select s2 = new Select(driver.findElement(By.name("destin")));
		s2.selectByIndex(0);
		Select s3 = new Select(driver.findElement(By.name("preAir")));
		s3.selectByIndex(0);
		Select s4 = new Select(driver.findElement(By.name("preSeat")));
		s4.selectByIndex(0);
		Select s5 = new Select(driver.findElement(By.name("adult")));
		s5.selectByIndex(0);
		Select s6 = new Select(driver.findElement(By.name("children")));
		s6.selectByIndex(0);
		Select s7 = new Select(driver.findElement(By.name("infant")));
		s7.selectByIndex(0);
		WebElement frBtn=driver.findElement(By.id("radio"));
		frBtn.click();
		driver.findElement(By.id("Arrival")).sendKeys("vamsi");
		driver.findElement(By.id("Departure")).sendKeys("krishna");
		driver.findElement(By.id("fname")).sendKeys("123456");
		driver.findElement(By.id("lname")).sendKeys("123456");
		driver.findElement(By.id("dob")).sendKeys("vamsi");
		driver.findElement(By.name("email")).sendKeys("vamsigmail.com");
		driver.findElement(By.name("phone")).sendKeys("vamsi");
		driver.findElement(By.id("sub")).click();
		Thread.sleep(1000);
		System.out.println("Test completed!");
		driver.quit();
	}
	public void nillSub() throws Exception {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/bookingusha.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("sub")).click();
		Thread.sleep(1000);
		System.out.println("Test completed!");
		driver.quit();
	}

}
public class bookPage {
	
	public static void main(String[] args) throws Exception {
		Book b1 = new Book();
		b1.booksub();
		b1.bookclear();
		b1.invalidBook();
		b1.nillSub();
	}
}
