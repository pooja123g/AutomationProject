package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	@Test

	public void DragDrop() throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver(); //rtp
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);//Internal chain of method or way say Nested concept
		
		WebElement sp = driver.findElement(By.id("draggable"));
		
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sp, target).perform();
		
		
		
	WebElement copytextbutton = 	driver.findElement(By.xpath("//button[text()='Copy Text']"));
	
	act.doubleClick(copytextbutton).perform();
	
	driver.quit();
	
	
	
	
//	act.contextClick()
	
		
		
		

	}

}
