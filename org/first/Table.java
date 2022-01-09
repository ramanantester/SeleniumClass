package org.first;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table extends Debuging{
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\krama\\eclipse-workspace\\SeleniumClass\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		for (int i = 0; i < iTable.size(); i++) {
			WebElement Table = iTable.get(i);
			List<WebElement>iBody = Table.findElements(By.tagName("tbody"));
			for (int l = 0; l < iBody.size(); l++) {
				WebElement body = iBody.get(l);
				List<WebElement> iRow = body.findElements(By.tagName("tr"));
			
			for (int j = 0; j < iRow.size(); j++) {
				WebElement row = iRow.get(j);
				List<WebElement> iData = row.findElements(By.tagName("td"));
				for (int k = 0; k < iData.size(); k++) {
					WebElement data = iData.get(k);
					String text = data.getText();
					System.out.println(text);
					//to print for perticular value
					if(text.equals("UAE")) {
						startingPoint();
						System.out.println("row"+j);
						System.out.println("column"+k);
						System.out.println("Country name "+iData.get(2).getText());
						successMsg("successfully verified");
						
					}
					
				}
				
			}
			
		}
		
	}
		driver.quit();
	}
}
