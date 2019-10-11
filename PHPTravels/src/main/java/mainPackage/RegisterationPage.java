package mainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterationPage extends LaunchBrowser {

	By submit= By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
	By gotit= By.xpath("//button[@id='cookyGotItBtn']");
	By first_name= By.xpath("//input[@placeholder='First Name']");
	By last_name= By.xpath("//input[@placeholder='Last Name']");
	By mobile_no= By.xpath("//input[@placeholder='Mobile Number']");
	By email= By.xpath("//input[@placeholder='Email']");
	By password= By.xpath("//input[@placeholder='Password']");
	By confirm_p= By.xpath("//input[@placeholder='Confirm Password']");
	
	public void submitButton() throws InterruptedException {
		
		//WebDriverWait w= new WebDriverWait(driver, 100);
		//w.until(ExpectedConditions.visibilityOfElementLocated(gotit));
		driver.findElement(gotit).click();
		driver.findElement(submit).click();
	}
	
	public WebElement firstName() {
		return driver.findElement(first_name);
	}
	
	public WebElement lastName() {
		return driver.findElement(last_name);
	}
	
	public WebElement mobileNo() {
		return driver.findElement(mobile_no);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement confirmPassword() {
		return driver.findElement(confirm_p);
	}
}
