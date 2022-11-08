package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("9876543210");
	String gA = txtUserName.getAttribute("type");
	System.out.println(gA);
	Thread.sleep(2000);
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("1234567890");
	Thread.sleep(2000);
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	driver.navigate().back();
	
	}
}
