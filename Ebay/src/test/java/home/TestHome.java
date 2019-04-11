package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
;

public class TestHome extends CommonAPI {

    @Test
    public void TestHomePage(){
       HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
       homeMenu.BRGRMenu();
    }

    @Test (enabled = false)
    public void TestSearchBox(){
        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
        homeMenu.Search();
    }

    @Test
    public void TestMessages(){
        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
        homeMenu.Messages();
    }

    @Test
    public void TestSellPage(){
        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
        homeMenu.SellPage();
    }

    @Test
    public void TestDealPage(){
        HomeMenu homeMenu = PageFactory.initElements(ad, HomeMenu.class);
        homeMenu.DealPage();
    }


}
