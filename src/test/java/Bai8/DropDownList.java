package Bai8;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownList extends Base {
    public static void main(String[] args){
        createBrowser();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        //Handle DropDown List Tĩnh

        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
        select.selectByVisibleText("Sunday");

        //Kiểm tra xem đã chọn đun hay chưa
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(4);
        select.selectByValue("Monday");

        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        selectMultiple.selectByIndex(1);
        selectMultiple.selectByIndex(2);







        closeBrowser();


    }
}
