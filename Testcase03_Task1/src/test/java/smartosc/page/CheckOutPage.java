package smartosc.page;

import com.beust.ah.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import screenplay.actions.ActionCommon;
import screenplay.common.DataTest;
import screenplay.user_interface.CheckOutComponent;

public class CheckOutPage {
    @Steps
    ActionCommon action;
    @When("Enter Information In Check Out Page")
    public void enterInformation(){
        action.typeText(CheckOutComponent.EMAII_INPUT, DataTest.EMAIL);
        action.typeText(CheckOutComponent.FIRST_NAME_INPUT, DataTest.FIRST_NAME);
        action.typeText(CheckOutComponent.LAST_NAME_INPUT, DataTest.LAST_NAME);
        action.typeText(CheckOutComponent.ADDRESS_INPUT, DataTest.ADDRESS);
        ActionCommon.pause(5000);
        action.selectDropdown(CheckOutComponent.PROVINCE_INPUT, DataTest.PROVINCE);
        action.selectDropdown(CheckOutComponent.DISTRICT_INPUT, DataTest.DISTRICT);
        action.typeText(CheckOutComponent.PHONE_INPUT, DataTest.PHONE);
        ActionCommon.pause(5000);
        action.clickElement(CheckOutComponent.CONTINUE_BUTTON);
    }
    @When("Get Infomation In CheckOut")
    public void getInfomationCheckOut(){
        String priceCheckOut = action.getText(CheckOutComponent.PRICE_IN_CHECK_OUT);
        Serenity.setSessionVariable("priceCheckOut").to(priceCheckOut);
        String qtyCheckOut = action.getText(CheckOutComponent.QTY_IN_CHECK_OUT);
        Serenity.setSessionVariable("qtyCheckOut").to(qtyCheckOut);
    }
    @Then("Compare Price And Qty")
    public void comaprePriceAndQty(){
        String qtyCart = Serenity.sessionVariableCalled("qtyCart");
        String priceCart = Serenity.sessionVariableCalled("priceCart");
        String qtyCheckOut = Serenity.sessionVariableCalled("qtyCheckOut");
        String priceCheckOut = Serenity.sessionVariableCalled("priceCheckOut");
        System.out.println("qty1"+qtyCart);
        System.out.println("p1"+priceCart);
        System.out.println("q2"+qtyCheckOut);
        System.out.println("p2"+priceCheckOut);
//        check price
        if(priceCheckOut.equals(priceCart)){
            System.out.println("Price is true");
        } else {
            System.out.println("Price is false");
        }

//        check qty
        if(qtyCheckOut.equals(qtyCart)){
            System.out.println("Qty is true");
        } else {
            System.out.println("Qty is false");
        }
    }
}
