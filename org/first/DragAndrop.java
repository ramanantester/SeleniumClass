package org.first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndrop {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		String url = "http://demo.guru99.com/test/drag_drop.html";
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//bank
		WebElement bank = driver.findElement(By.xpath("(//a)[42]"));
		//5000
		WebElement tobank = driver.findElement(By.xpath("(//a)[41]"));
		WebElement account1 = driver.findElement(By.xpath("(//li)[44]"));
		WebElement amount1 = driver.findElement(By.xpath("(//li)[45]"));
		WebElement sales = driver.findElement(By.xpath("(//a)[43]"));
		WebElement account2 = driver.findElement(By.xpath("(//li)[46]"));
		WebElement amount2 = driver.findElement(By.xpath("(//li)[47]"));
		
		
		Actions s = new Actions(driver);
		s.dragAndDrop(bank, account1).perform();
		s.dragAndDrop(tobank, amount1).perform();
		s.dragAndDrop(sales, account2).perform();
		s.dragAndDrop(tobank, amount2).perform();
		driver.manage().window().maximize();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\DragAndrop");
		FileUtils.copyFile(src, desc);
		
		
		
		
		
		
		
		
		
		
		
	}

}
