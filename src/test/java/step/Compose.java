package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Compose {
    WebDriver driver = null;
    
    @Given("Open the Chrome and launch the application")
    public void open_the_chrome_and_launch_the_application() {		
       WebDriverManager.chromedriver().setup();	
       driver= new ChromeDriver()  ;					
       driver.manage().window().maximize();			
       driver.get("https://www.gmail.com/");					
    }
	
    
	
    @When("Enter the UserName <Username> as {string}")
    public void enter_the_user_name_username_as(String string) {	
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys(string);	
    }
    
    @Then("click on Next Button")
    public void click_on_next_button() {
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    }
    
    @When("Enter the UserName <Password> as {string}")
    public void enter_the_user_name_password_as(String string) {
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys(string);					
    }	
    @When("second time click on Next Button")
    public void second_time_click_on_next_button()  {
    	driver.findElement(By.xpath("//span[text()='Next']")).click();
    }
}		
	
	



