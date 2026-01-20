package com.kiwiqalogin.demo;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;

public class LoginPageUsingXpath {
        public static void main(String[] args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("performance_glitch_user");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			Thread.sleep(4000);
			System.out.println("Log in successfull");
			driver.quit();		    
		}
}
