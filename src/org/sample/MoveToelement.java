package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/#");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebElement txtAll = driver.findElement(By.xpath("//a[text()='Allow']"));
		txtAll.click(); 
//	
//		Actions actions = new Actions(driver);
//		actions.moveToElement(txtAll).perform();
	}

}
