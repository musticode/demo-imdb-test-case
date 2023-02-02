package com.imdb.demoimdbtestcase.page.imdb;

import com.imdb.demoimdbtestcase.page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AwardsPage extends BasePage {

    // Honorary Award list
    @FindBy(linkText ="The Circus")
    private WebElement theCircusElement;

    @FindBy(linkText ="The Jazz Singer")
    private WebElement theJazzSinger;


    public AwardsPage(WebDriver driver) {
        super(driver);
    }


    @Step("Navigate to The Circus film details")
    public void navigateToTheCircusPage(){
        scrollDownToFilms();
        click(theCircusElement);
    }

    @Step("Navigate to The Jazz Singer film details")
    public void navigateToTheJazzSingerPage(){
        scrollDownToFilms();
        click(theJazzSinger);
    }

    private void scrollDownToFilms(){
        scrollDownByValue(1260);
    }
}
