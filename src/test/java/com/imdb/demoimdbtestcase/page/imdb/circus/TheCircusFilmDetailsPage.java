package com.imdb.demoimdbtestcase.page.imdb.circus;

import com.imdb.demoimdbtestcase.page.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TheCircusFilmDetailsPage extends BasePage {
    @FindBy(xpath = "//button[text()='Director']//following-sibling::div//child::a")
    private WebElement directorTextElement;

    @FindBy(xpath = "//button[text()='Writer']//following-sibling::div//child::a")
    private WebElement writerTextElement;

    @FindBy(xpath = "(//a[text()='Stars']//following-sibling::div//child::li//a)[1]")
    private WebElement starsTextElement1;
    @FindBy(xpath = "(//a[text()='Stars']//following-sibling::div//child::li//a)[2]")
    private WebElement starsTextElement2;
    @FindBy(xpath = "(//a[text()='Stars']//following-sibling::div//child::li//a)[3]")
    private WebElement starsTextElement3;

    @FindBy(xpath = "//h3[contains(.,'Photos')]")
    private WebElement photosLinkElement;




    public TheCircusFilmDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToPhotoGallery() throws InterruptedException {
        scrollDownByValue(500);

        Thread.sleep(1000);

        click(photosLinkElement);
    }



    public String getDirector(){
        return getText(directorTextElement);
    }

    public String getWriter(){
        return getText(writerTextElement);
    }

    public String getStars1(){
        return getText(starsTextElement1);
    }

    public String getStars2(){
        return getText(starsTextElement2);
    }

    public String getStars3(){
        return getText(starsTextElement3);
    }





}
