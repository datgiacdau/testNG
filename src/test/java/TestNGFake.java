/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class TestNGFake extends TestNGFake2 {

    @Test
    public void Update() throws InterruptedException {
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        driver.findElement(By.xpath("//span[normalize-space()=\"Customers\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
        WebElement phone = driver.findElement(By.xpath("//input[@id=\"phonenumber\"]"));
        phone.clear();
        phone.sendKeys("0123456701");
        WebElement save = driver.findElement(By.xpath("//button[@class=\"btn btn-primary only-save customer-form-submiter\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", save);
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary only-save customer-form-submiter\"]")).click();
        Thread.sleep(3000);
        WebElement company = driver.findElement(By.xpath("//label[@for=\"company\"]"));
        String x = company.getText();
        assertEquals(x, "* Company");
    }

        @Test
        public void RunTest() {

        driver.get("https://anhtester.com");

            String expectedTitle = "Anh Tester Automation Testing";
            String originalTitle = driver.getTitle();

            System.out.println("*** Checking For The Title ***");

            assertEquals(originalTitle, expectedTitle);
        }
}
