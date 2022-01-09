package org.first;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		String url = "http://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement sell = driver.findElement(By.xpath("//select"));
		
		//dropdown
		Select s = new Select(sell);
		s.selectByIndex(0);
		s.selectByValue("ALGERIA");
		s.selectByVisibleText("ANTARCTICA");
		boolean multiple = s.isMultiple();
		//to check single or multiple dropdown
		System.out.println(multiple);
		s.selectByVisibleText("ANTARCTICA");
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement WebElement = options.get(i);
			String text = WebElement.getText();
			System.out.println(text);
			
			
		}
		
	}

}
