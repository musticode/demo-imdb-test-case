package com.imdb.demoimdbtestcase.page.imdb.jazzsinger;

import com.imdb.demoimdbtestcase.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TheJazzSingerFilmDetailsPage extends BasePage {


    @FindBy(xpath = "(//button[text()='Director']//following-sibling::div//child::a)[1]")
    private WebElement directorTextElement;

    @FindBy(xpath = "(//button[text()='Writers']//following-sibling::div//child::a)[1]")
    private WebElement writersTextElement1;

    @FindBy(xpath = "(//button[text()='Writers']//following-sibling::div//child::a)[2]")
    private WebElement writersTextElement2;

    @FindBy(xpath = "(//button[text()='Writers']//following-sibling::div//child::a)[3]")
    private WebElement writersTextElement3;

    @FindBy(xpath = "(//a[text()='Stars']//following-sibling::div//child::li//a)[1]")
    private WebElement starsTextElement1;
    @FindBy(xpath = "(//a[text()='Stars']//following-sibling::div//child::li//a)[2]")
    private WebElement starsTextElement2;
    @FindBy(xpath = "(//a[text()='Stars']//following-sibling::div//child::li//a)[3]")
    private WebElement starsTextElement3;



    @FindBy(xpath = "//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[2]/div[1]/div/a")
    private WebElement photoGalleryButtonElement;

    @FindBy(css = "html > body > div:nth-of-type(2) > main > div > section:nth-of-type(1) > div > section > div > div:nth-of-type(1) > section:nth-of-type(2) > div:nth-of-type(1) > div > a > h3")
    public WebElement h3Photos;

    @FindBy(xpath = "//a[contains(@title, 'Neely')]")
    public WebElement linkNeelyEdwardsJolsonMay;

    @FindBy(xpath = "//a[contains(.,'Photos')]")
    public WebElement h3Photos2;

    @FindBy(xpath = "//a[contains(.,'Top cast')]")
    public WebElement topCastsElement;

    public TheJazzSingerFilmDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToPhotoGallery() throws InterruptedException {

        scrollDownByValue(500);


        //thread sleep before clicking photos
        Thread.sleep(2000);

        click(h3Photos2);
    }

    public String getDirector() {
        return getText(directorTextElement);
    }

    public String getWriters1() {
        return getText(writersTextElement1);
    }

    public String getWriters2() {
        return getText(writersTextElement2);
    }

    public String getWriters3() {
        return getText(writersTextElement3);
    }

    public String getStars1() {
        return getText(starsTextElement1);
    }

    public String getStars2(){
        return getText(starsTextElement2);
    }

    public String getStars3(){
        return getText(starsTextElement3);
    }
}
