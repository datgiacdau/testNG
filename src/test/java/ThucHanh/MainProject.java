/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class MainProject extends Init {
    //Khoi tao cac doi tg
    ObjectRepo Object = new ObjectRepo();
    
    @Test
    public void Login(){
        driver.get(Object.URL);
        Sp.delay(1);
        driver.findElement(Object.username).sendKeys("admin@example.com");
        driver.findElement(Object.pass).sendKeys("123456");
        driver.findElement(Object.btnLogin).click();
        Sp.delay(1);
        
        Sp.clickElement(Object.menuLeads);
        Sp.clickElement(Object.btnNewLead);
        Sp.delay(2);
        
        Sp.clickElement(Object.cboStatus);
        Sp.setText(Object.inputStatus, "Customer");
        driver.findElement(Object.inputStatus).sendKeys(Keys.ENTER);
        Sp.delay(2);
        Sp.clickElement(Object.cboSource);
        Sp.setText(Object.inputSource, "Facebook");
        driver.findElement(Object.inputSource).sendKeys(Keys.ENTER);
        Sp.setText(Object.inputName, "Test02");
        Sp.clickElement(Object.btnSaveLead);
        Sp.delay(2);

        
    }
}
