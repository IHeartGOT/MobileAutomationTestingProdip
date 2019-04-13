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
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Main navigation, open']")
    WebElement brgrbtn;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.ebay.mobile:id/search_box']")
    WebElement searchBox;
    @FindBy(id = "com.ebay.mobile:id/recycler_view_main")
    WebElement messages;
    @FindBy(xpath = "//android.widget.TextView[@text='SELLING']")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@text='DEALS']")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@text='CATEGORIES']")
    WebElement categories;
    @FindBy(xpath="//android.widget.TextView[@text='Baby']")
    WebElement baby;
    @FindBy(xpath = "//android.widget.TextView[@text='FEATURED']")
    WebElement featured;
//    @FindBy(xpath = "//android.widget.TextView[@text='FEATURED']")
//    WebElement deals;


    public WebElement getBrgrbtn(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return brgrbtn;
    }

    public WebElement getSearchBox(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchBox;
    }

    public WebElement getMessages(){
//                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return messages;
    }

    public WebElement getSelling(){
//                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return selling;
    }

    public WebElement getDeals(){
//                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return deals;
    }

    public WebElement getCategories(){
//                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return categories;
    }


    public WebElement getBaby() {
//                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return baby;
    }

    public WebElement getFeatured() {
//                TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return featured;
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

    public void CategoriesPage(){
        getCategories().click();
        getBaby().click();
    }

    public void FeauturedPage(){
        getDeals().click();
        getFeatured().click();
    }





}
