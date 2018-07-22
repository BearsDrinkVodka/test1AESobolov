package LondonTEST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Zero {
    public static WebDriver driver;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "E:\\driver.chrome\\chromedriver.exe");
        driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
    }
    @Test
    public void Geolocal(){

        WebElement geoloc = driver.findElement(By.cssSelector("a[data-statlog=\"head.region.setup\"]"));
        geoloc.click();
        WebElement text = driver.findElement(By.id("city__front-input"));
        text.click();
        text.clear();
        text.sendKeys("Лондон");


    }

}
