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
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class HandlePopup extends TestNGNGTest {
    @Test
    public void Popup() throws InterruptedException{
        driver.get("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
        driver.findElement(By.xpath("//a[@title=\"Follow @seleniumeasy on Twitter\"]")).click();
        
        String MainWindow = driver.getWindowHandle();
        System.out.println("Cua so cha"+ MainWindow);
        Set<String> windows = driver.getWindowHandles();
        
        for(String window : windows){
            System.out.println(window);
            if(!MainWindow.equalsIgnoreCase(window)){
                driver.switchTo().window(window);
                Thread.sleep(2000);
                System.out.println("da chuyen win con");
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
    }
}
