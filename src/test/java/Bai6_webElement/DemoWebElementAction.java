package Bai6_webElement;

import Bai5_Locatiors.Bai5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class DemoWebElementAction {
    public static void main(String[] args) throws InterruptedException {
        //Khởi tạo browser
        WebDriver driver; //Khởi tạo 1 web driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        //sendKey, Click, clear
        //driver.findElement(By.xpath(Bai5.inputEmail)).sendKeys("admin@example.com");
        //driver.findElement(By.xpath(Bai5.inputEmail)).clear();
        //driver.findElement(By.xpath(Bai5.inputEmail)).sendKeys("admin@example.com");
        //driver.findElement(By.xpath(Bai5.inputPassword)).sendKeys("123456");
        //driver.findElement(By.xpath(Bai5.buttonLogin)).click();
        driver.findElement(By.xpath("//input[@id='remember']")).click();



        //WebElement tagH1 = driver.findElement(By.xpath("//h1[normalize-space()='Login']"));
        //boolean checkDisplay = tagH1.isDisplayed();
        //System.out.println(checkDisplay);

        WebElement element = driver.findElement(By.xpath("//input[@id='remember']"));
        boolean status = element.isSelected();
        if(element.isSelected() == false){
            System.out.println("True");
        }else {
            System.out.println("False");
        }


        Thread.sleep(2000); //Cho tiến trình ngừng lại
        driver.quit();


    }
}
