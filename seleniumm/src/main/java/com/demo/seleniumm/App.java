package com.demo.seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Selenium\\Driver.exe");
		  
	    ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		//launching url
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fname.sendKeys("Nandhini");
		
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lname.sendKeys("B");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		email.sendKeys("nan@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		pass.sendKeys("nan@123");
		
		WebElement gen=driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]"));
		gen.click();
		
		WebElement dob=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[1]/div[1]/div/span/input[1]"));
		dob.click();
		
		WebElement day=driver.findElement(By.xpath(""));
		day.click();
	}
}