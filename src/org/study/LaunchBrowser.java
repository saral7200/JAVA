package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName=driver.findElement(By.id("email"));
	txtUserName.sendKeys("Welcome Java");
	WebElement txtPassword=driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Java@123");
	WebElement btnlogin  = driver.findElement(By.name("login"));
	btnlogin.click();
	//WebElement error = driver.findElement(By.xpath("//div[@class='_9ay7']"));
	//System.out.println(error.getText());
}
}
