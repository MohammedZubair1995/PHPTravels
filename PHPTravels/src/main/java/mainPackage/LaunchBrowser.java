package mainPackage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;
	public static Properties prop= new Properties();
	public void launch() throws Exception {
		
		FileInputStream fls= new FileInputStream("C:\\QualitestPractice\\PHPTravels\\PHPTravels\\src\\main\\java\\files\\base.properties");
		prop.load(fls);
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
