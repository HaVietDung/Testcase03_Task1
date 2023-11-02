package smartosc.page;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import screenplay.actions.ActionCommon;
import screenplay.user_interface.PaymentMethodComponent;

public class PayMethodPage {
    @Steps
    ActionCommon action;
    @When("Select Payment Method")
    public void selectPaymentMethod(){
        action.clickElement(PaymentMethodComponent.PAY_METHOD);
        action.clickElement(PaymentMethodComponent.CONFIRM_1);
        action.clickElement(PaymentMethodComponent.CONFIRM_2);
        action.clickElement(PaymentMethodComponent.CONTINUE_BUTTON);
    }
}
