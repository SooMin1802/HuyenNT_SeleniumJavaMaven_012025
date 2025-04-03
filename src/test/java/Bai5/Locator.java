package Bai5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locator {

    public static void main(String[] args) throws InterruptedException {

        //Khai bao WebDriver cua Selenium dat ten = driver
        WebDriver driver;

        //Khai bao doi tuong driver voi trinh duyet Chrome
        driver = new ChromeDriver();

        //Phong to het co man hinh
        driver.manage().window().maximize();

        //Set thoi gian toi da de tim kim element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mo 1 link web bang URL
        driver.get("https://cms.anhtester.com/login");

        //Tim kiem 1 element (ham findElement)
        //Truyen tim kiem element = id -> truyen gia tri cua id (= "email")
        //Tim kiem xong element do -> nhap gia tri vao (ham sendKeys truyen vao gia tri muon nhap)
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //Tim kiem element = name + nhap gia tri = "123456" vao element do
        driver.findElement(By.name("password")).sendKeys("123456");

        //Tim kiem element = linkText + click vao
        //driver.findElement(By.linkText("Forgot password ?")).click();

        //Tim kiem element = PartialLinkTex (mot phan textlink) + click vao
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //Tim kiem element = tagName (ten the cua element) + click vao
        //driver.findElement(By.tagName("button")).click();

        //Tim kiem element = className (ten class) + click vao
        //Luu y 1 class co the chua nhieu class:
        // VD: class ="btn btn-primary btn-lg btn-block"
        //Co 3 class con la: btn, btn-primary, btn-lg btn-block
        //Co the check bang cach click vao -> check o the Styles: moi . la 1 class
        //Chi can truyen 1 class la du
        driver.findElement(By.className("btn-primary")).click();




        //Lam xong, cho 2s nghi truoc khi tat trinh duyet
        //Don vi o day la mili giay nen = 2000
        //Day la ngoai le, nen can add exception
        Thread.sleep(2000);

        //Sau khi doi xong 2s thi tat trinh duyet
        driver.quit();

    }
}
