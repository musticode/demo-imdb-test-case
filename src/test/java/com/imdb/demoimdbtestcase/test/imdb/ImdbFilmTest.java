package com.imdb.demoimdbtestcase.test.imdb;

import com.imdb.demoimdbtestcase.listener.TestListener;
import com.imdb.demoimdbtestcase.page.imdb.*;
import com.imdb.demoimdbtestcase.page.imdb.circus.CircusPhotoGalleryPage;
import com.imdb.demoimdbtestcase.page.imdb.circus.TheCircusFilmDetailsPage;
import com.imdb.demoimdbtestcase.page.imdb.jazzsinger.JazzSingerPhotoGalleryPage;
import com.imdb.demoimdbtestcase.page.imdb.jazzsinger.TheJazzSingerFilmDetailsPage;
import com.imdb.demoimdbtestcase.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({TestListener.class})
public class ImdbFilmTest extends BaseTest {


    HomePage homePage;
    OscarsListPage oscarsListPage;

    AwardsPage awardsPage;
    TheCircusFilmDetailsPage theCircusFilmDetailsPage;
    CircusPhotoGalleryPage circusPhotoGalleryPage;
    TheJazzSingerFilmDetailsPage theJazzSingerFilmDetailsPage;

    JazzSingerPhotoGalleryPage jazzSingerPhotoGalleryPage;


    @Test(priority = 0)
    public void menuAndSearchMatchingTest_TheCircus() throws InterruptedException {

        homePage = new HomePage(driver);
        oscarsListPage = new OscarsListPage(driver);
        awardsPage = new AwardsPage(driver);
        theCircusFilmDetailsPage = new TheCircusFilmDetailsPage(driver);
        circusPhotoGalleryPage = new CircusPhotoGalleryPage(driver);


        homePage.getMainPage();
        homePage.navigateToOscars();

        oscarsListPage.scrollToEventHistory();
        awardsPage.navigateToTheCircusPage();

        String circusDirector = theCircusFilmDetailsPage.getDirector();
        String circusWriter = theCircusFilmDetailsPage.getWriter();
        String circusStar1 = theCircusFilmDetailsPage.getStars1();
        String circusStar2 = theCircusFilmDetailsPage.getStars2();
        String circusStar3 = theCircusFilmDetailsPage.getStars3();


        //navigate to main page
        homePage.returnToMainPage();

        //search film on imdb search field
        homePage.search("The Circus");


        // assertions for every element
        Assert.assertEquals(
                circusDirector,
                theCircusFilmDetailsPage.getDirector(),
                "Directors are not matching"
        );

        Assert.assertEquals(
                circusWriter,
                theCircusFilmDetailsPage.getWriter(),
                "Writers are not matching"
        );

        Assert.assertEquals(
                circusStar1,
                theCircusFilmDetailsPage.getStars1(),
                "Stars are not matching"
        );

        Assert.assertEquals(
                circusStar2,
                theCircusFilmDetailsPage.getStars2(),
                "Stars are not matching"
        );

        Assert.assertEquals(
                circusStar3,
                theCircusFilmDetailsPage.getStars3(),
                "Stars are not matching"
        );


        // navigate to photo gallery page
        theCircusFilmDetailsPage.navigateToPhotoGallery();
        Thread.sleep(2000);

        // send request to all links
        circusPhotoGalleryPage.findBrokenLinks();

    }

    @Test(priority = 1)
    public void menuAndSearchMatchingTest_TheJazzSinger() throws InterruptedException {

        homePage = new HomePage(driver);
        oscarsListPage = new OscarsListPage(driver);
        awardsPage = new AwardsPage(driver);
        theJazzSingerFilmDetailsPage = new TheJazzSingerFilmDetailsPage(driver);
        jazzSingerPhotoGalleryPage = new JazzSingerPhotoGalleryPage(driver);


        homePage.getMainPage();
        homePage.navigateToOscars();

        oscarsListPage.scrollToEventHistory();
        awardsPage.navigateToTheJazzSingerPage();

        String jazzSingerDirector = theJazzSingerFilmDetailsPage.getDirector();
        String jazzSingerWriter1 = theJazzSingerFilmDetailsPage.getWriters1();
        String jazzSingerWriter2 = theJazzSingerFilmDetailsPage.getWriters2();
        String jazzSingerWriter3 = theJazzSingerFilmDetailsPage.getWriters3();
        String jazzSingerStar1 = theJazzSingerFilmDetailsPage.getStars1();
        String jazzSingerStar2 = theJazzSingerFilmDetailsPage.getStars2();
        String jazzSingerStar3 = theJazzSingerFilmDetailsPage.getStars3();

        System.out.println(jazzSingerDirector);
        System.out.println(jazzSingerWriter1);
        System.out.println(jazzSingerWriter2);
        System.out.println(jazzSingerWriter3);
        System.out.println(jazzSingerStar1);
        System.out.println(jazzSingerStar2);
        System.out.println(jazzSingerStar3);


        //navigate to main page
        homePage.returnToMainPage();

        //search film on imdb search field
        homePage.search("The Jazz Singer");

        Assert.assertEquals(
                jazzSingerDirector,
                theJazzSingerFilmDetailsPage.getDirector(),
                "Directors are not matching"
        );

        Assert.assertEquals(
                jazzSingerWriter1,
                theJazzSingerFilmDetailsPage.getWriters1(),
                "Writers are not matching"
        );

        Assert.assertEquals(
                jazzSingerWriter2,
                theJazzSingerFilmDetailsPage.getWriters2(),
                "Writers are not matching"
        );

        Assert.assertEquals(
                jazzSingerWriter3,
                theJazzSingerFilmDetailsPage.getWriters3(),
                "Writers are not matching"
        );

        Assert.assertEquals(
                jazzSingerStar1,
                theJazzSingerFilmDetailsPage.getStars1(),
                "Stars are not matching"
        );

        Assert.assertEquals(
                jazzSingerStar2,
                theJazzSingerFilmDetailsPage.getStars2(),
                "Stars are not matching"
        );

        Assert.assertEquals(
                jazzSingerStar3,
                theJazzSingerFilmDetailsPage.getStars3(),
                "Stars are not matching"
        );

        //navigate to photo gallery
        theJazzSingerFilmDetailsPage.navigateToPhotoGallery();
        Thread.sleep(2000);

        // send request to all links
        jazzSingerPhotoGalleryPage.findBrokenLinks();





    }

}
