package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*import cucumber.api.*;*/
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.Main;
import org.junit.Assert;
import junit.framework.*;

public class Steps {
	WebDriver d;
		@Given("user is already on Login Page")
		public void user_is_already_on_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://www.adactinhotelapp.com/");
		    System.out.println("Login page");
		}
		@When("title of login page is Adactin Hotel")
		public void title_of_login_page_is_Adactin_Hotel() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println(d.getTitle());
		}
		@When("user enters username and password")
		public void user_enters_username_and_password() {
		    // Write code here that turns the phrase above into concrete actions
			d.findElement(By.id("username")).sendKeys("Rajasekhar1234");
			d.findElement(By.id("password")).sendKeys("Raja@1234");
			System.out.println("Login credentials entered");
		}
		
		@Then("user is on the home page")
		public void user_is_on_the_home_page() {
		    System.out.println(d.getCurrentUrl());
		    d.close();
		    System.out.println("Closed"); 
		}
						
		@When("user clicks on login button")
		public void user_clicks_on_login_button() {
			d.findElement(By.id("login")).click();
			System.out.println("Login button clicked");
		}

		@Then("user is on home page")
		public void user_is_on_hopme_page(){
			
			System.out.println("safasf");
					}
	}