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
}
