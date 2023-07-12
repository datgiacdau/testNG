
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Wait{
    public WebDriver driver = null;
    @BeforeTest
    public void setup(){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
    }
    @Test
    public void ExplicitWait(){
        driver.get("https://anhtester.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(text(),'Website Testing')]"))));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Website Testing')]")));
		
        driver.findElement(By.xpath("//h3[contains(text(),'Website Testing')]")).click();
    }
        @AfterTest
    public void shutdown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
}
