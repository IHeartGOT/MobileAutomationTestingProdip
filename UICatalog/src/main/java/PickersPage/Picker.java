package PickersPage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/15/17.
 */
public class Picker extends CommonAPI {
    public void selectPickerTwoWheels(String name, String number){
        //scrollKeys(ad, new String[]{name,number});
    }
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton")
    WebElement UIButton;

    public WebElement getUIButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return UIButton;
    }


    //    List<WebElement> segmentControl = new ArrayList<WebElement>();



//
//    public void getUIPicker(){
//        segmentControl.get(0).click();
//    }
//    public void getUIDatePicker(){
//        segmentControl.get(1).click();
//    }
//    public void getCustom(){
//        segmentControl.get(2).click();
//    }


}
