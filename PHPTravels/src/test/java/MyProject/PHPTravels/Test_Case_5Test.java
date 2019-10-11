package MyProject.PHPTravels;

import org.testng.annotations.Test;

import mainPackage.HomePage;
import mainPackage.Log_In;

public class Test_Case_5Test {

	@Test
	public void logIn() throws Exception {
		HomePage h1= new HomePage();
		Test_Case_1Test.userRegistration();
		
		h1.launch();
		h1.driver.get(h1.prop.getProperty("url"));
		h1.logIn();
		
		Log_In l1= new Log_In();
		l1.email().sendKeys(h1.prop.getProperty("Email"));
		l1.password().sendKeys(h1.prop.getProperty("Password"));
		l1.logIn().click();
		Thread.sleep(10000);
		h1.driver.close();
	}
}
