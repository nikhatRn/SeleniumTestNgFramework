package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public static String emailAddress = generateRandoEmailID();
	
	public void initalizeDriver() throws IOException {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 prop= new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		else {
			System.out.println("choose the correct browser");
		}
	}
     public static String generateRandoEmailID() {
		
		return "test"+System.currentTimeMillis()+"@gmail.com";
		
	}
     @BeforeMethod
     public void browserLaunch() throws IOException {
    	 initalizeDriver();
    	 String URLname=prop.getProperty("URL");
 		driver.get(URLname);
     }
     @AfterMethod
     public void browserClose() {
    	 driver.quit();
    	 
     }

}
