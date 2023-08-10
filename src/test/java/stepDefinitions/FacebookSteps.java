package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {

	WebDriver driver;
	
	@Before("@login")
	@Given("^Open faebook application$")
	public void openFaebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	

	@When("^Input to username and Password$")  
	public void inputToUsernameAndPassword(DataTable table) {
	  List<Map<String, String>> customer = table.asMaps(String.class, String.class);
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(customer.get(0).get("Username"));
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(customer.get(0).get("Password"));
	  
	    
	}

	@When("^Input to username textbox$")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("automationtesting@gmail.com");
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("12345678");

	}
	
	@When("^Input to username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String email)  {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}
	   
	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password)  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	   
	}
	
	@When("^Input to username textbox with ([^\"]*)$")
	public void inputToUsernameTextboxWithM(String email)  {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
	}
	   
	@When("^Input to Password textbox with ([^\"]*)$")
	public void inputToPasswordTextboxWithM(String password)  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	   
	}
	
	@When("^Input to username with \"([^\"]*)\" and Password with \"([^\"]*)\"$")
	public void inputToUsernameWithAndPasswordWith(String email, String password)  {
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	   
	}


	@When("^Click to Submit button$")
	public void clickToSubmitButton() {
		
		driver.findElement(By.name("login")).click();

	}

	@After("@login")
	public void closeApplication() {
		driver.quit();

	}

}
