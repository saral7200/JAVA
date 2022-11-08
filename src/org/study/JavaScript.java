package org.study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");

		//	JavascriptExecutor jse = (JavascriptExecutor) driver;
		//	
		//	WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		//	jse.executeScript("arguments[0].setAttribute('value', 'Selenium Testing')", searchBox);
		//	Thread.sleep(2000);
		//	WebElement clickSearch = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
		//	jse.executeScript("arguments[0].click()", clickSearch);

		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		searchBox.sendKeys("Naa Aalana Thamara");

		Thread.sleep(2000);
		WebElement clickSearch = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]"));
		clickSearch.click();
		
		Thread.sleep(2000);
		WebElement clickLink = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Naan Aalana Thamarai  Song')][1]"));
		clickLink.click();
	}
}
