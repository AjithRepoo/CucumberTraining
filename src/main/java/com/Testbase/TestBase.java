package com.Testbase;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.google.common.io.Files;

public class TestBase {

	public static WebDriver driver = null;
	public static Properties prop = null;

	public TestBase() {
		try {

			prop = new Properties();
			File f = new File(
					"C:\\Users\\1000066986\\eclipse-workspace\\Facebook\\src\\main\\java\\com\\facebook\\config\\config.properties");
			FileInputStream fib = new FileInputStream(f);
			BufferedInputStream buff = new BufferedInputStream(fib);

			prop.load(buff);

		} catch (IOException e) {

		}
	}

	public static void Browsersetup(String browserName) {
		// String browserName= prop.getProperty("browser");
		browserName.toUpperCase().equalsIgnoreCase("chrome");
		System.out.println(browserName);
		if (browserName.equalsIgnoreCase("CHROME")) {

			driver = new ChromeDriver();
		} else if (browserName.toUpperCase().equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		} else if (browserName.toUpperCase().equalsIgnoreCase("FireFox")) {

			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("invalid BrowserName");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.get(prop.getProperty("https://www.facebook.com/"));

	}

	public static void takesceen(String Filename) {

		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String timestamp = dateformat.format(new Date());

		File f = new File("C:\\Users\\1000066986\\eclipse-workspace\\Facebook\\Screenshot\\" + Filename + "_"
				+ timestamp + ".png");
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);

		try {
			Files.copy(screenshotAs, f);
		} catch (IOException e) {
			e.printStackTrace();

		}
		System.out.println("ScreenShot taken");
	}

	
	
}

