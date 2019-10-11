package MyProject.PHPTravels;

import org.testng.annotations.Test;

import mainPackage.HomePage;
import mainPackage.RegisterationPage;

public class Test_Case_1Test {
	
	//User registration
	@Test
	public static void userRegistration() throws Exception {
	
		HomePage h1= new HomePage();
		h1.launch();
		
		h1.signUp();
		
		RegisterationPage r1= new RegisterationPage();
		r1.firstName().sendKeys(h1.prop.getProperty("First_Name"));;
		r1.lastName().sendKeys(h1.prop.getProperty("Last_Name"));;
		r1.mobileNo().sendKeys(h1.prop.getProperty("Mobile_no"));;
		r1.email().sendKeys(h1.prop.getProperty("Email"));;
		r1.password().sendKeys(h1.prop.getProperty("Password"));;
		r1.confirmPassword().sendKeys(h1.prop.getProperty("Confirm_P"));
		r1.submitButton();
		Thread.sleep(10000);
		h1.driver.close();
	}	
}