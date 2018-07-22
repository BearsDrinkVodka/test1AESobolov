package ShoboloA.test1;


import org.testng.Assert;
import org.testng.annotations.Test;




public class SearchTEST extends BaseTest {

    @Test
    public void starttest(){
        searchPage = new Searchpage(driver);
        searchResult = new SearchResult(driver);
        searchPage.inputSearch("Погода в Пензе");
        String weather = searchResult.getResult();
        Assert.assertEquals("Погода в Пензе", weather);
    }
}
