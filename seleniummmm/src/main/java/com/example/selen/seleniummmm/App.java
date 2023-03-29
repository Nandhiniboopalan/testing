package com.example.selen.seleniummmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        String url="https://demoqa.com/droppable/";
        driver.manage().window().maximize();
        driver.get(url);
        WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement to =driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]"));
        Thread.sleep(5000);
        Actions act =new Actions(driver);
        act.dragAndDrop(from, to).build().perform();
    }
}
