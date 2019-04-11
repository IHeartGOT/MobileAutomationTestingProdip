package home;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

public class HomeMenu extends CommonAPI {

    public HomeMenu (){
        PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]")
    WebElement brgrbtn;
    @FindBy(className = "_highlighter-box_6a798")
    WebElement searchBox;
    @FindBy(id = "com.ebay.mobile:id/recycler_view_main")
    WebElement messages;
    @FindBy(xpath = "/android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]")
    WebElement deals;



    public WebElement getBrgrbtn(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return brgrbtn;
    }

    public WebElement getSearchBox(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getSearchBox();
    }

    public WebElement getMessages(){
        //        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return messages;
    }

    public WebElement getSelling(){
        //        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return selling;
    }

    public WebElement getDeals(){
        //        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return deals;
    }
    

    public void BRGRMenu(){
        getBrgrbtn().click();
    }

    public void Search(){
        getSearchBox().sendKeys("toys");
    }

    public void Messages(){
        getMessages().click();
    }

    public void SellPage(){
        getSelling().click();
    }

    public void DealPage(){
        getDeals().click();
    }



}
