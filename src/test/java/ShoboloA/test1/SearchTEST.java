package ShoboloA.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class SearchTEST {
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

    @Test
    public void starttest(){
        searchPage.inputSearch("Погода в Пензе");
        searchPage.SearchButton();
        searchResult.ResultButton();
    }
}
