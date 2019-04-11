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

    public WebElement getBrgrbtn(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return brgrbtn;
    }

    public WebElement getSearchBox(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return getSearchBox();

    }

    public void BRGRMenu(){
        getBrgrbtn().click();
    }

    public void Search(){
        getSearchBox().sendKeys("toys");
    }

}
