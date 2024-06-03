package Bai8;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkbox extends Base {
    public static void main(String[] args){
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //Kiểm tra xem đã được chọn chưa
        boolean checkCheckbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected'")).isSelected();
        System.out.println(checkCheckbox1);

        //Click chọn Checkbox
        driver.findElement(By.xpath("//input[@id='isAgeSelected'")).click();


        //Kiểm tra đã chọn hay chưa
        boolean checkCheckbox2 = driver.findElement(By.xpath("//input[@id='isAgeSelected'")).isSelected();
        System.out.println(checkCheckbox2);

        boolean checkMessageDisplayed = driver.findElement(By.xpath("//div[@id='txtAge'")).isDisplayed();
        System.out.println(checkMessageDisplayed);

        //handle Multi checkbox
        List<WebElement> listCheckBox = driver.findElements(By.xpath("//div[normalize-space() = 'Multiple Checkbox Demo']/following-sibling::div//input[@type= 'checkbox']"));
        for (int i = 0; i < listCheckBox.size(); i++){
            System.out.println("Checkbox vị trí thứ " + (i + 1) + listCheckBox.get(i).isSelected());
        }


        //Cách 2: Dùng trực tếp index với đoạn xpath cụ thể
        for (int i = 0; i < listCheckBox.size(); i++){
            driver.findElement(By.xpath("//div[normalize-space() = 'Multiple Checkbox Demo']/following-sibling::div//input[@type= 'checkbox']"));
        }

        closeBrowser();



    }
}
