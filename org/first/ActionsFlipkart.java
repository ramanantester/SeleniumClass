package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsFlipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		String url = "http://flipkart.com/";
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.findElement(By.xpath("(//button)[2]")).click();
		WebElement mobile = driver.findElement(By.xpath("(//div)[44]"));
		//mobile.click();
		//WebElement ele = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[1]"));
		
		Actions acc = new Actions(driver);
		//acc.moveToElement(ele).perform();
		acc.moveToElement(mobile).perform();
		
	}

}
