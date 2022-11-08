package org.study;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		TakesScreenshot ts = (TakesScreenshot)driver;

		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshot);

		File file = new File("C:\\Users\\SARAL VASANTH\\OneDrive\\Pictures\\Screenshots\\Selenium Screenshots\\img1.png");

		FileUtils.copyFile(screenshot, file);
	}
}
