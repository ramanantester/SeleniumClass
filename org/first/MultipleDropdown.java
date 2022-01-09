package org.first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://output.jsbin.com/osebed/2";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement sell = driver.findElement(By.xpath("//select"));
		Select s = new Select(sell);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		s.deselectByIndex(1);
		
		//deselectall 
		//s.deselectAll();
		
		//1st select 
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		
		//for checking select options
		List<WebElement> all = s.getAllSelectedOptions();
		for (int i = 0; i < all.size(); i++) {
			
			//shotcut
			System.out.println(all.get(i).getText());
			
			//or we can use
		//	WebElement get = all.get(i);
		//	String text = get.getText();
		//	System.out.println(text);
			
		}
		
		
		
	}

}
