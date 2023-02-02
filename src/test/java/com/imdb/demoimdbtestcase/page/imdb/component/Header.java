package com.imdb.demoimdbtestcase.page.imdb.component;

import com.imdb.demoimdbtestcase.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {

    @FindBy(css = "#home_img_holder")
    private WebElement imdbHomeButtonElement;


    @FindBy(id = "imdbHeader-navDrawerOpen")
    private WebElement menuButtonElement;

    @FindBy (xpath = "//a[@role='menuitem'][contains(.,'Oscars')]")
    private WebElement oscarsElement;

    @FindBy (id = "suggestion-search")
    private WebElement suggestionSearchInputElement;

    @FindBy (id = "suggestion-search-button-search")
    private WebElement suggestionSearchButtonElement;

    @FindBy (id = "react-autowhatever-1--item-0")
    private WebElement searchSuggestionFirstElement;


    public Header(WebDriver driver) {
        super(driver);
    }


    public void clickImdbButton(){
        click(imdbHomeButtonElement);
    }

    public void clickMenuButton(){
        click(menuButtonElement);
    }

    public void clickOscarsElement(){
        click(oscarsElement);
    }

    public void setTextToSearchInput(String searchText){
        setText(suggestionSearchInputElement, searchText);
    }

    public void clickFirstSuggestionInSearchField(){
        click(searchSuggestionFirstElement);
    }


}
