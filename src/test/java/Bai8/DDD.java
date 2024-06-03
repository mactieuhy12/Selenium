package Bai8;

import Common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DDD extends Base {
    public static void main(String[] args) {
        createBrowser();
        driver.get("https:/techydevs.com/demos/themes/html/listhub/index.html");


        driver.findElement(By.xpath("(//button[normalize-space()='Search Now]/parent::div)/preceding-sibling::div[1]")).click();

        driver.findElement(By.xpath("(span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("Ho");

        driver.findElement(By.xpath("(span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys(Keys.ENTER);


    }
}
