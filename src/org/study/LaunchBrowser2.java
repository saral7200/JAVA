package org.study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	WebElement btnSignIn = driver.findElement(By.xpath("//input[@class='signinbtn']"));
	btnSignIn.click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	Thread.sleep(1000 );
	al.accept();
	
	}
}
