/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class ActionClass extends TestNGNGTest {

    @Test
    public void TestAction() throws InterruptedException {

        driver.get("https://www.google.com/");

        // specify the locator of the search box
        WebElement element = driver.findElement(
                By.xpath("//textarea[@id=\"APjFqb\"]"));

        // create an object for the Actions class and pass the driver argument
        Actions action = new Actions(driver);

        // pass the product name that has to be searched in the website
        action.sendKeys(element, "Anh Tester").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        WebElement anhtester = driver.findElement(By.xpath("//h3[normalize-space()=\"Anh Tester Automation Testing\"]"));
        anhtester.click();
        Thread.sleep(1000);
        
//        WebElement header = driver.findElement(By.xpath("(//h2[@class='section__title'][contains(text(),'Anh Tester')])[1]"));
//        action.doubleClick(header).build().perform();
          //move
          WebElement move = driver.findElement(By.xpath("//a[@class=\"theme-btn theme-btn-hover-light\"]"));
          action.moveToElement(move).build().perform();
          action.contextClick(move).build().perform();
          
    }
    
    @Test
    public void DragAnddrop() throws InterruptedException{
        driver.get("http://demo.guru99.com/test/drag_drop.html");

		// Element which needs to drag.
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		// Element on which need to drop.
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions action = new Actions(driver);
		Thread.sleep(1000);
		// Dragged and dropped.
		action.dragAndDrop(From, To).build().perform();
    }

}
