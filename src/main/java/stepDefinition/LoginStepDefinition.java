package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	  
	@Given("^user is already on login page$") 
	  public void user_already_on_login_page() {
		  System.setProperty("webdriver.chrome.driver", "C:/Project/Automation/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://www.freecrm.com");
	  
	  }
	 
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM Power Up your Entire Business Free Forever", title);
		
	}
	
	@Then("^user eners username and password$")
	public void user_eners_username_and_password() {
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
	    driver.findElement(By.name("email")).sendKeys("shreyasjathe");
	    driver.findElement(By.name("password")).sendKeys("shreyasjathe");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
	    driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}
	
	/*
	 * @Then("^user is on ome page$") public void user_is_on_ome_page(){
	 * 
	 * }
	 */

	

}
