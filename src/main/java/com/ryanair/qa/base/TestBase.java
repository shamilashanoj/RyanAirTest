package com.ryanair.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ryanair.qa.util.TestUtil;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
		prop = new Properties();
		
				FileInputStream ip = new FileInputStream(
						"C:\\Users\\SHANOJ\\eclipse-workspace\\RyanairTest\\src\\main\\java\\com\\"
						+ "ryanair\\qa\\config\\config.Properties");
				prop.load(ip);
				
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public static void initialisation() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHANOJ\\eclipse\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitlyWait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}
	
	
}
