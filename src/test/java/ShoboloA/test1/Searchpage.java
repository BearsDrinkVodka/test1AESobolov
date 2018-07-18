package ShoboloA.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class Searchpage {

    public Searchpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id="text")
    private WebElement searchField;

    @FindBy(css =".search2__button button")
    private  WebElement searchButton;


    public void inputSearch(String Погода_в_Пензе){
        searchField.sendKeys(Погода_в_Пензе);
    }

    public void SearchButton() {
        searchButton.click();
    }
}