package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeMenu extends CommonAPI {

    public HomeMenu (){
        PageFactory.initElements(ad, this);

    }
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]")
    WebElement brgrbtn;

    public WebElement getBrgrbtn(){return brgrbtn;
    }

    public void BRGRMenu(){
        getBrgrbtn().click();
    }

}
