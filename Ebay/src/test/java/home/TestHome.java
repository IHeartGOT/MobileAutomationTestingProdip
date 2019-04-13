package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
;import java.util.concurrent.TimeUnit;

public class TestHome extends CommonAPI {

    @Test
    public void TestHomePage(){
        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
        homeMenu.BRGRMenu();
    }

    @Test
    public void TestSearchBox(){
        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
        homeMenu.Search();
    }

//    @Test
//    public void TestMessages(){
//        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
//        homeMenu.Messages();
//    }
//
//    @Test
//    public void TestSellPage(){
//        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
//        homeMenu.SellPage();
//    }
//
//    @Test
//    public void TestDealPage(){
//        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
//        homeMenu.DealPage();
//    }
//
//    @Test
//    public void TestBabyPage(){
//        ad.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
//        homeMenu.CategoriesPage();
//    }
//
//    @Test
//    public void TestFeatured(){
//        ad.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
//        homeMenu.FeauturedPage();
//    }


}
