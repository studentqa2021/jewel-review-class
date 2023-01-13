package com.generic.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {

public void login() {
//open browser
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//put URL
try {
Thread.sleep(3000);
} catch (InterruptedException e) {e.printStackTrace();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//put user name
driver.findElement(By.xpath("//*[@name= 'username']")).click();		
driver.findElement(By.xpath("//*[@name= 'username']")).sendKeys("Admin");		
//put password
driver.findElement(By.xpath("//*[@name= 'password']")).click();
driver.findElement(By.xpath("//*[@name= 'password']")).sendKeys("admin123");
	
//click sign in btn
driver.findElement(By.xpath("//*[@type='submit']")).click();	
	
boolean loginstatus =driver.findElement(By.xpath("//*[@class= 'oxd-topbar-header-breadcrumb']")).isDisplayed();

Assert.assertTrue(loginstatus);
}
	
}
}