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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert extends TestNGNGTest {

    @Test
    public void Alert() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        //driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"][normalize-space()=\"Click me!\"]")).click();
        driver.findElement(By.xpath("//button[normalize-space()=\"Click for Prompt Box\"]")).click();
        Alert alert = driver.switchTo().alert();

        String alertMsg = alert.getText();

        System.out.println(alertMsg);
        Thread.sleep(1000);
        alert.sendKeys("datpro");
        Thread.sleep(1000);
        //alert.accept();
        alert.dismiss();
        Thread.sleep(1000);
        
        //Assert.assertEquals(driver.findElement(By.xpath("//p[@id=\"prompt-demo\"]")).getText(), "You have entered 'datpro' !");
        Assert.assertFalse(driver.findElement(By.xpath("//p[@id=\"prompt-demo\"]")).isDisplayed());
    }
}
