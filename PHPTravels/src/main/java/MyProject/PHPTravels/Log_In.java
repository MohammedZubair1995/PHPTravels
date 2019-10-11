package MyProject.PHPTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Log_In extends LaunchBrowser {

	static By email= By.xpath("//input[@placeholder='Email']");
	static By password= By.xpath("//input[@placeholder='Password']");
	static By login= By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	WebElement email() {
		return driver.findElement(email);
	}
	
	WebElement password() {
		return driver.findElement(password);
	}
	
	WebElement logIn() {
		return driver.findElement(login);
	}
}
