package org.first;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;

public class Selenium {
	SELENIUM INTRODUCTION
	    1.introduction of selenium
	    2.browser lanch,swlenium method,locators,actions,robot,dopdown,webtable,windowshandling
	    screenshot,alert,frames,javascript executer,debug,waits
	SELENIUM METHODS
	   GET(),getcurrenturl,getTitle,getpageSource,findElement,FindElements,..etc
	   locators
	   id,name,classname,xpath,tagname,limktext,partiallinktext,cssselector
	   XPath
	   //tagname[@attributename="attributevalue"]
	   //button[@type="sumit"]
	   //button[text='login']
	   //tagname[text()='ghff']
	   //tagname[contains(text(),'attributevalue')]
	   
	   
	   ACTIONS
	     Actions a = new Actions(driver);
	     a.moveToElement(app).performance();
	     a.doubleClick(user).perform();
	     s.contextclick(user).perform();
	     
	     Robot
	     Robot r = new Robot();
	     r.keyPress(KeyEvent.VK_DOWN);
	     r.keyRelease(keycode);
	     
	     
	     DragandDrop

}
