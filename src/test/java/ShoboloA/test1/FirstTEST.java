package ShoboloA.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTEST{
    @Test
    public void firsttest() {
        System.setProperty("webdriver.chrome.driver", "E:\\driver.chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru");
        WebElement searchfield = driver.findElement(By.id("text"));
        searchfield.sendKeys("Погода Пенза");
        WebElement searchbutton = driver.findElement(By.cssSelector(".search2__button button"));
        searchbutton.click();
        WebElement firststring = driver.findElement(By.cssSelector("a[accesskey='1']"));
        String gismeteo = firststring.getText();
        Assert.assertEquals("Погода в Пензе", gismeteo);
        driver.quit();

    }

}


