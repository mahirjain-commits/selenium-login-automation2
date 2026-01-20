package com.kiwiqalogin.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;

public class NevigationDemo {
     public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Navigation navigation =driver.navigate();
		navigation.to("https://demoapps.qspiders.com/");
		Thread.sleep(5000);
		navigation.to(new URL("https://www.facebook.com/"));
		Thread.sleep(5000);
		navigation.back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		navigation.refresh();
		Thread.sleep(5000);
		driver.quit();
		}
}
