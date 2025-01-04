package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest {

	WebDriver driver;

	@BeforeClass
	public void Initalization() {
		driver = new ChromeDriver(); // rtp
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void SelectDropDown() throws InterruptedException {

		WebElement selectdrpdwn = driver.findElement(By.id("country"));

		Select sel = new Select(selectdrpdwn);

		sel.selectByIndex(2);

		sel.selectByValue("india");

		// selectByVisibleText("Luggage");

	}

	@Test(priority=2)
	public void DragAndDrop() throws InterruptedException {

		WebElement sp = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(sp, target).perform();

		WebElement copytextbutton = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		act.doubleClick(copytextbutton).perform();

	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}

}
