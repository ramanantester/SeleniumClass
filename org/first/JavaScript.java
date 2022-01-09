package org.first;

import java.security.spec.ECGenParameterSpec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScript {
	


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		String url = "http://Fb.com";
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement term = driver.findElement(By.linkText("Terms"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','8608770428')", user,);
		js.executeScript("arguments[0].setAttribute('value','hjhkj')", pass);
		//getAttribute
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(executeScript);
	    //click
		//js.executeScript("arguments[0].click()", login);
		//scrollintoview
		js.executeScript("arguments[0].scrollIntoView(true)", term);
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView(false)", user);
		
		
		
		
	}

}
