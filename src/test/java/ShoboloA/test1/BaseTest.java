package ShoboloA.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public static WebDriver driver;
    public static Searchpage searchPage;
    public static SearchResult searchResult;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "E:\\driver.chrome\\chromedriver.exe");
        driver = new ChromeDriver() ;
        searchPage = new Searchpage(driver);
        searchResult =new SearchResult(driver);
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");

    }
    @AfterClass
    public static void tearDown(){driver.quit();}
}
