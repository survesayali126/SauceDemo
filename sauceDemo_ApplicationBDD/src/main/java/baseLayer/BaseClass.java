package baseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	final String path = System.getProperty("user.dir")+"\\src\\main\\java\\ConfigLayer\\config.properties";
	
	private static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<WebDriver>();
	
	private static Properties prop;
	public static WebDriver getDriver() {
		
		return threadlocal.get();
	}
	
	public BaseClass() {
		prop= new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialisation(String browsername){
		
		WebDriver driver = null;
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		threadlocal.set(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
	}
	

}