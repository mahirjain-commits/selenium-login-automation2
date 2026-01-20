package com.kiwiqalogin.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageUsingName {
    public static void main(String[] args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(4000);
			driver.findElement(By.name("user-name")).sendKeys("performance_glitch_user");
			Thread.sleep(4000);
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			Thread.sleep(4000);
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(4000);
			System.out.println("Log in successfull");
			driver.quit();		    
		}
}
