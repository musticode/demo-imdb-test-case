package com.imdb.demoimdbtestcase.page.imdb;

import com.imdb.demoimdbtestcase.page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OscarsListPage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='1929']")
    private WebElement evenHistory1929Element;


    public OscarsListPage(WebDriver driver) {
        super(driver);
    }

    @Step("Scroll down to event history and click 1929")
    public void scrollToEventHistory(){
        scrollDownByValue(600);
        click(evenHistory1929Element);
    }

}
