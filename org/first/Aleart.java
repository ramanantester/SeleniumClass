package org.first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Aleart {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		String url = "http://demo.automationtesting.in/Alerts.html";
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement ok = driver.findElement(By.xpath("(//button)[2]"));
		ok.click();
		
		
		//alert
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("(//a)[39]")).click();
		driver.findElement(By.xpath("(//button)[3]")).click();
		a.dismiss();
		WebElement cncl = driver.findElement(By.id("demo"));
		String s = cncl.getText();
		System.out.println(s);
		driver.findElement(By.xpath("(//a)[40]")).click();
		driver.findElement(By.xpath("(//button)[4]")).click();
		a.sendKeys("Ramanan");
		a.accept();
		WebElement gt = driver.findElement(By.id("demo1"));
		String s1 = gt.getText();
		System.out.println(s1);
	
		//simple,confirm,prompt
		//accept,sendkeys,dismiss,gettext
		
	}

}
