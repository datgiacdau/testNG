/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.testng.Alertvv;

/**
 *
 * @author DELL
 */
import com.datgiacdau.testng.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class HandleIframe extends TestNGNGTest{
    @Test
    public void Iframe() throws InterruptedException{
        driver.get("https://anhtester.com/contact");
        int total = driver.findElements(By.tagName("iframe")).size();
        System.out.println(total);
        Thread.sleep(8000);
        driver.switchTo().frame(0);
        
        WebElement element = driver.findElement(By.tagName("strong"));
        System.out.println(element.getText());
        //driver.switchTo().frame("dialog-frame");
    }
}
