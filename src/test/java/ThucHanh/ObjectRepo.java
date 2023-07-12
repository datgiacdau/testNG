/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import org.openqa.selenium.By;

/**
 *
 * @author DELL
 */
public class ObjectRepo {
    public String URL="https://crm.anhtester.com/admin/authentication";
    By username = By.xpath("//input[@id=\"email\"]");
    By pass = By.xpath("//input[@id=\"password\"]");
    By btnLogin = By.xpath("//button[@type=\"submit\"]");
    By menuLeads = By.xpath("//span[@class=\"menu-text\"][normalize-space()=\"Leads\"]");
    By btnNewLead = By.xpath("//a[@class=\"btn btn-primary mright5 pull-left display-block\"]");
    By cboStatus = By.xpath("(//div[@class='filter-option'])[8]");
    By inputStatus = By.xpath("/html[1]/body[1]/div[11]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    By cboSource = By.xpath("(//div[@class='filter-option'])[9]");
    By inputSource = By.xpath("/html[1]/body[1]/div[11]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    By inputName = By.xpath("(//input[@id='name'])[2]");
    By btnSaveLead = By.xpath("//button[@id=\"lead-form-submit\"]");
    
}
