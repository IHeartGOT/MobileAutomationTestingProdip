package TestPage;

import PickersPage.Picker;
import UiCatalogPage.UiCatalog;
import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PickerTest extends CommonAPI {
    String[] pickerName = {"Chris Armstrong","3"};
    String[] pickerDate = {"April","10","2019"};
    public Picker picker(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getPickers();
        return PageFactory.initElements(ad, Picker.class);
    }
    @Test
    public void testUIPicker(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getPickers();
        Picker picker = PageFactory.initElements(ad, Picker.class);
        picker().getUIPicker();//.selectPickerTwoWheels("Chris Armstrong","3");
        scrollKeys(ad, pickerName,"//UIAPicker[1]");
    }
    //@Test
    public void testDatePicker(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getPickers();
        Picker picker = PageFactory.initElements(ad, Picker.class);
        picker().getUIDatePicker();
        scrollKeys(ad, pickerDate,"//UIAPicker[2]");
    }

}
