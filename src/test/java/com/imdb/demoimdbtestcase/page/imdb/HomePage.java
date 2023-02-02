package com.imdb.demoimdbtestcase.page.imdb;

import com.imdb.demoimdbtestcase.page.BasePage;
import com.imdb.demoimdbtestcase.page.imdb.component.Header;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private static String IMDB_MAIN_PAGE_URL = "https://www.imdb.com/";
//    @FindBy(id = "imdbHeader-navDrawerOpen")
//    private WebElement menuButtonElement;
//
//    @FindBy (xpath = "//a[@role='menuitem'][contains(.,'Oscars')]")
//    private WebElement oscarsElement;
//
//    @FindBy (id = "home_img")
//    private WebElement imdbHomeButtonElement;
//
//    @FindBy (id = "react-autowhatever-1--item-0")
//    private WebElement searchSuggestionFirstElement;







    private Header header;
    public HomePage(WebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    @Step("Return to main page via clicking IMDB button")
    public void returnToMainPage(){
        header.clickImdbButton();
    }

    @Step("Get IMDB Main Page")
    public void getMainPage(){
        getPage(IMDB_MAIN_PAGE_URL);
    }

    @Step("Navigate to Oscars Page")
    public void navigateToOscars(){
        header.clickMenuButton();
        header.clickOscarsElement();
    }

    @Step("Search fim in search field")
    public void search(String searchText){
        header.setTextToSearchInput(searchText);
        header.clickFirstSuggestionInSearchField();
    }

}
