package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver.exe");
		String url = "http://fb.com";
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("8608770428");
		driver.findElement(By.id("pass")).sendKeys("Ramanan10");
	//	Actions a = new Actions(driver);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		
	}
}
