package org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		String url = "https://www.facebook.com/";
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		WebElement user = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		user.sendKeys("8608770428");
		password.sendKeys("klk");
		String attribute = password.getAttribute("value");
		System.out.println(attribute);
		WebElement text = driver.findElement(By.xpath("(//h2)[1]"));
		String textfile = text.getText();
		System.out.println(textfile);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		if(url.equals(currenturl)) {
			System.out.println("same url");
		}
		else{
			System.out.println("differnt url");
		}
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		

}}
