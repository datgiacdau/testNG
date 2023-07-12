
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class jsExecutorCheckbox extends TestNGFake2 {

    @Test
    public void jsCheckbox() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
        Thread.sleep(1000);

        js.executeScript("document.getElementById('isAgeSelected').checked=true");
        WebElement button = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        js.executeScript("arguments[0].click();", button);

        String titleText = js.executeScript("return document.title;").toString();
        System.out.println(titleText);

        String domain = js.executeScript("return document.domain;").toString();
        System.out.println(domain);

        WebElement webElement = driver.findElement(By.xpath("//a[normalize-space()=\"Maven Tutorial\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", webElement);
    }
}
