package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTasks1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement mouseHoverCourse = driver.findElement(By.xpath("(//div[text()='Courses '])"));
		Thread.sleep(2000);
		WebElement mouseHoverJava = driver.findElement(By.xpath("(//span[text()='Java (4)'])"));
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mouseHoverCourse).perform();
		Thread.sleep(2000);
		ac.moveToElement(mouseHoverJava).perform();
		Thread.sleep(2000);
		
		WebElement clkJ2EE = driver.findElement(By.xpath("(//span[text()='J2EE Certification Training'])"));
		clkJ2EE.click();
	}
}

