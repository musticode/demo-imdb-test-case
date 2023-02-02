package com.imdb.demoimdbtestcase.page.imdb.jazzsinger;

import com.imdb.demoimdbtestcase.page.BasePage;
import com.imdb.demoimdbtestcase.util.ApiRequestService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

public class JazzSingerPhotoGalleryPage extends BasePage {

    @FindBy(xpath = ".//a[contains(@href,'mediaviewer')]")
    List<WebElement> photosElementList;


    public JazzSingerPhotoGalleryPage(WebDriver driver) {
        super(driver);

    }


    public void findBrokenLinks(){

        Iterator<WebElement> it = photosElementList.iterator();


        while(it.hasNext()) {
            String photoLink = it.next().getAttribute("href");
            System.out.println(photoLink);

            if (photoLink == null || photoLink.isEmpty()) {
                System.out.println("Empty or null url");
                continue;
            }

            int responseCode = ApiRequestService.getInstance().sendRequestToElementLinks(photoLink);

            Assert.assertEquals(responseCode, 200,"Broken");


        }


    }


}
