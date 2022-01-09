package org.first;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.ArrayListMultimap;

public class FlipkartWindowshandling1 {
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
		
		String parent = driver.getWindowHandle();
		Thread.sleep(3000);
		WebElement first = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		first.click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		Thread.sleep(4000);
		driver.switchTo().window(parent);
		//windowhandles
		Set<String> child = driver.getWindowHandles();
		List<String> child2 = new ArrayList<String>(child);
		driver.switchTo().window(child2.get(2));
		WebElement mobilename = driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		String text = mobilename.getText();
		System.out.println(text);
		

}}
