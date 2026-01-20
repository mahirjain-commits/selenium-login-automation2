package com.kiwiqalogin.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageUsingCSSselector {
    public static void main(String[] args) throws InterruptedException{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(".input_error ")).sendKeys("performance_glitch_user"); // class name
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce"); // id 
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("input[type='submit']")).click(); // tag name 
			Thread.sleep(4000);
			System.out.println("Log in successfull");
			driver.quit();		    
		}

}
