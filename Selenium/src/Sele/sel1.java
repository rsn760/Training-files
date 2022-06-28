package Sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sel1 {


	
	public static void main(String[] args) throws Exception {
		
		String p1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", p1);
		WebDriver drive= new ChromeDriver();
		drive.get("C:\\Users\\itctesting16\\Downloads\\Mini project-Rehuba Itc Airlines\\Register.html");
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    drive.findElement(By.id("firstname")).sendKeys("Rajasekhar");
	    Thread.sleep(500);
	    drive.findElement(By.id("lastname")).sendKeys("N");
	    Thread.sleep(500);
//	    drive.findElement(By.id("login")).click();
		Select dD=new Select(drive.findElement(By.className("gender")));
		Thread.sleep(500);
		dD.selectByIndex(1);
//		Select dD1=new Select(drive.findElement(By.id("input-group")));
//		dD1.selectByIndex(3);
//		Select dD2=new Select(drive.findElement(By.id("input-group")));
//		dD2.selectByIndex(1);
//		Select dD3=new Select(drive.findElement(By.id("input-group")));
//		dD3.selectByIndex(2);
		//drive.close();
	    drive.findElement(By.id("mobile")).sendKeys("0000000000");
	    Thread.sleep(500);
	    drive.findElement(By.id("email")).sendKeys("n@r.com");
	    Thread.sleep(500);
	    drive.findElement(By.id("aadhar")).sendKeys("123456789012");
	    Thread.sleep(500);
	    Select dD1=new Select(drive.findElement(By.className("country")));
	    Thread.sleep(500);
		dD1.selectByIndex(1);
	    drive.findElement(By.id("username")).sendKeys("Name1234");
	    Thread.sleep(500);
	    drive.findElement(By.id("password")).sendKeys("Rajasekhar123");
	    Thread.sleep(500);
	    WebElement checkBoxSelect=drive.findElement(By.id("tc"));
	    Boolean isSelect=checkBoxSelect.isSelected();
	    if(isSelect==false)
	    {
	    	checkBoxSelect.click();
	    }
	    drive.findElement(By.id("register")).click();
	    Alert alert=drive.switchTo().alert();
	    alert.accept();
	    Thread.sleep(500);
	    Alert alert1=drive.switchTo().alert();
	    alert1.accept();
	    Thread.sleep(500);
	    Alert alert2=drive.switchTo().alert();
	    alert2.accept();
	    Thread.sleep(500);
	    String str=drive.getCurrentUrl();
	    System.out.println(str);
	    drive.quit();
	}

}
