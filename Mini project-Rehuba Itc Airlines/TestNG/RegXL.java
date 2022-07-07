package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RegXL {
	WebDriver driver;
	XSSFWorkbook wb;
	XSSFSheet sheet2;
	XSSFCell cell;

	@BeforeMethod
	public void beforeMethod() {
		String path1="D:\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		driver=new ChromeDriver();
		driver.get("file://D:/Mini%20project-Rehuba%20Itc%20Airlines/Register.html");

	}
	@Test
	public void Reg() throws Exception {
		File src=new File("D:\\XLdata\\RegData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		sheet2=wb.getSheetAt(0);
		cell = sheet2.getRow(1).getCell(0);
		driver.findElement(By.id("fname")).sendKeys(cell.getStringCellValue());
		cell = sheet2.getRow(1).getCell(1);
		driver.findElement(By.id("lname")).sendKeys(cell.getStringCellValue());
		WebElement radio=driver.findElement(By.id("male"));
		radio.click();
		XSSFCell cell2 = sheet2.getRow(1).getCell(2);
		driver.findElement(By.id("mob")).sendKeys(cell2.getStringCellValue());
		XSSFCell cell3 = sheet2.getRow(1).getCell(3);
		driver.findElement(By.id("email")).sendKeys(cell3.getStringCellValue());
		XSSFCell cell4 = sheet2.getRow(1).getCell(4);
		driver.findElement(By.id("aadhar")).sendKeys(cell4.getStringCellValue());
		XSSFCell cell5 = sheet2.getRow(1).getCell(5);
		Select dropDown=new Select(driver.findElement(By.id("country")));
		dropDown.selectByIndex(2);
		driver.findElement(By.id("username")).sendKeys(cell5.getStringCellValue());
		XSSFCell cell6 = sheet2.getRow(1).getCell(6);
		driver.findElement(By.id("password")).sendKeys(cell6.getStringCellValue());
		XSSFCell cell7 = sheet2.getRow(1).getCell(7);
		driver.findElement(By.id("confirm-password")).sendKeys(cell7.getStringCellValue());
		WebElement checkBoxSelect=driver.findElement(By.id("checkbox"));
		Boolean isSelect=checkBoxSelect.isSelected();
		if (isSelect==false)
		{
			checkBoxSelect.click();
		}
		driver.findElement(By.id("register")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	@AfterMethod
	public void afterMethod() {
	}
}

