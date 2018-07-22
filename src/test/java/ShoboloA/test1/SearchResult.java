package ShoboloA.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class SearchResult {

    private By firstString = By.cssSelector("a[accesskey='1']");
    private final WebDriver driver;

    public SearchResult(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    public String getResult() {
        return driver.findElement(firstString).getText();
    }
}
