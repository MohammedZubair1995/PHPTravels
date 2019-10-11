package mainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends LaunchBrowser {

	 By my_account= By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	 By sign_up= By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
	 By login= By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
	 By hotels= By.xpath("//a[@title='Hotels']");
	 By flights= By.xpath("//span[contains(text(),'Flights')]");
	 By tours= By.xpath("//div[@id='body-section']//li[3]//a[1]");
	 By cars= By.xpath("//div[@id='body-section']//li[4]//a[1]");
	 
	  public void signUp() {
		driver.findElement(my_account).click();
		driver.findElement(sign_up).click();
	}
	
	 public void logIn() {
		driver.findElement(my_account).click();
		driver.findElement(login).click();
	}
	
	 public WebElement hotel() {
		return driver.findElement(hotels);
	}
	
	 public WebElement flights(){
		return driver.findElement(flights);
	}
	 
	 public WebElement tours() {
		 return driver.findElement(tours);
	 }
	 
	 WebElement cars() {
		 return driver.findElement(cars);
	 }
}
