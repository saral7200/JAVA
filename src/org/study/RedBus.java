package org.study;


import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("coimbatore");
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.keyDown(Keys.DOWN).perform();
		ac.keyUp(Keys.DOWN).perform();
		ac.keyDown(Keys.DOWN).perform();
		ac.keyUp(Keys.DOWN).perform();
		Thread.sleep(2000);
		ac.keyDown(Keys.ENTER).perform();
		ac.keyUp(Keys.ENTER).perform();
		
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("chennai");
		Thread.sleep(2000);
		
		ac.keyDown(Keys.DOWN).perform();
		ac.keyUp(Keys.DOWN).perform();
		ac.keyDown(Keys.DOWN).perform();
		ac.keyUp(Keys.DOWN).perform();
		Thread.sleep(2000);
		ac.keyDown(Keys.ENTER).perform();
		ac.keyUp(Keys.ENTER).perform();
		
		WebElement clickDate = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		clickDate.click();
		
		Robot robo = new Robot();
		
		//ac.moveToElement(target)
	}
}


