package com.kiwiqalogin.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDemo {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shoppersstack.com/products_page/8414");
	String parentId = driver.getWindowHandle();
	Thread.sleep(12000);
	driver.findElement(By.id("compare")).click();
	Set<String> childSessionIds = driver.getWindowHandles();
	childSessionIds.remove(parentId);
	TargetLocator tl = driver.switchTo();
	for(String s:childSessionIds) {
		tl.window(s);
		Thread.sleep(3000);
		driver.close();
	}
	tl.window(parentId);
	Thread.sleep(3000);
	driver.close();
	driver.quit();
	}
}
