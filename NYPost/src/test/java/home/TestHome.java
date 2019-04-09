package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHome extends CommonAPI {

    @Test
    public void TestBrgBtn(){
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getMenu ();
    }
    @Test
    public void TestTopStories(){
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getTopStories ();
    }
    @Test
    public void TestNews() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getNews ();
    }
    @Test
    public void TestAbout() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getAbout ();

    }
    @Test
    public void TestMedia() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getMedia ();
    }
    @Test
    public void TestBusiness() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getBusiness ();
        mainPage.getNews ();
    }
    @Test
    public void TestMetro() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getMetro ();
    }
    @Test
    public void TestEntertainment() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getEntertainment ();
    }
    @Test
    public void TestFashion() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getFashion ();
    }
    @Test
    public void TestLiving() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getLiving ();
    }
    @Test
    public void TestOpinion() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getOpinion ();
    }
    @Test
    public void TestPageSix() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getPageSix ();
    }
    @Test
    public void TestPhotos() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getPhotots ();
    }
    @Test
    public void TestRealEstate() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getRealEstate ();
    }
    @Test
    public void TestSports() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getSports ();
    }
    @Test
    public void TestTech() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getTech ();
    }
    @Test
    public void TestVideot() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getVideo ();
    }
    @Test
    public void TestSavedArticles() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.getSavedArticles ();
    }
    @Test
    public void TestAlert() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.setAlertTendingNews ("yes");
    }
    @Test
    public void TestArticles() {
        HomeMenu mainPage = PageFactory.initElements (ad, HomeMenu.class);
        mainPage.goToArticles ();
    }
}

