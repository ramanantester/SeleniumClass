package org.first;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartWindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "http://Flipkart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Redmi mobiles");
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement first = driver.findElement(By.xpath("(//div)[316]"));
		first.click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("(//div)[319]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(parent);
		
		//windowshandling
		
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if(!parent.equals(x)) {
				driver.switchTo().window(x);
		}}
		WebElement mobliename = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		String text = mobliename.getText();
		System.out.println(text);
			
		
		
	}
	}
