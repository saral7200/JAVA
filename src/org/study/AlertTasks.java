package org.study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTasks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SARAL VASANTH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		WebElement btnAlert1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		btnAlert1.click();
		Thread.sleep(3000);
		WebElement btnAlert2 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		//btnAlert2.click();
		jse.executeScript("arguments[0].click()", btnAlert2);
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);		
		WebElement btnAlert3 = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		btnAlert3.click();
		Thread.sleep(3000);
		WebElement btnAlert4 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnAlert4.click();

		alt.sendKeys("hi JAVA");
		String text = alt.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alt.accept();
	}
}
