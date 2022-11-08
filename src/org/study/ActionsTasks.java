package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTasks {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();

	}
} 
