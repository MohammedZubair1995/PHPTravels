package MyProject.PHPTravels;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import mainPackage.HomePage;
import mainPackage.Hotel_Search;

public class Test_Case_2Test {
	
	static By month= By.xpath("//div[14]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[14]//div[1]//tr[1]//th[3]");
	static By month1= By.xpath("//div[15]//div[1]//tr[1]//th[2]");
	static By next1=By.xpath("//div[15]//div[1]//tr[1]//th[3]");

	//Hotel search
	@Test
	public static void hotelSearch() throws Exception {
	
		HomePage h1= new HomePage();
		h1.launch();
		
		h1.hotel().click();
		
		Hotel_Search h2= new Hotel_Search();
		
		//hotel or city name
		h2.searchButton().sendKeys(h1.prop.getProperty("city_hotel"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("city_hotel")+"')]")).click();
		
		
		//check in
		h2.checkIn().click();
		String str = h2.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(h1.prop.getProperty("check_in_month_year"))) {
			h2.driver.findElement(next).click();
			str= h2.driver.findElement(month).getText();
		}
		
		checkInDate(h1.prop.getProperty("check_in_date"));
		
		//check out
        String str1 = h2.driver.findElement(month1).getText();
		
		while(!str1.equalsIgnoreCase(h1.prop.getProperty("check_out_month_year"))) {
			h2.driver.findElement(next1).click();
			str1= h2.driver.findElement(month1).getText();
		}
		
		checkOutDate(h1.prop.getProperty("check_out_date"));
		
		h2.guests().click();
		h2.adults().clear();
		h2.adults().sendKeys(h1.prop.getProperty("adults"));
		h2.child().sendKeys(h1.prop.getProperty("child"));
		h2.hotelSearchButton().click();
		Thread.sleep(10000);
		h1.driver.close();
	}
	
	public static void checkInDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[14]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[14]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[14]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	
	
public static void checkOutDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[15]//tr["+i+"]//td["+j+"]")).getText();
				 
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[15]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[15]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	
}
}