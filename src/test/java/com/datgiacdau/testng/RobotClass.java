/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class RobotClass extends TestNGNGTest{
    @Test
    public void inputData() throws AWTException, InterruptedException{
        driver.get("https://anhtester.com/");
        
        WebElement input = driver.findElement(By.xpath("//input[@placeholder=\"Tìm kiếm khóa học . . .\"]"));
        input.click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }
}
