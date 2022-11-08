package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
	WebElement txtUserName = driver.findElement(By.name("username"));
	txtUserName.sendKeys("9876543210");
	WebElement txtPassword = driver.findElement(By.name("password"));
	txtPassword.sendKeys("1234567890");
	}
}
