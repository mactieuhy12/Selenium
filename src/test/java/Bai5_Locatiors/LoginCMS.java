package Bai5_Locatiors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) {
        // Khởi tạo Browser
        //ChromeDriver,..
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Thời gian tối đa tìm kiếm 1 Element là 10s

        //Open website
        driver.get("https://cms.anhtester.com/login");
        //admin@example.com/123456

        //Định vị các Element trên trang Login
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //2.Password
        driver.findElement(By.name("passwoed")).sendKeys("123456");

        //Đóng
        driver.close();




    }
}