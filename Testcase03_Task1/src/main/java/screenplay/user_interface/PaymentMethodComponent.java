package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentMethodComponent {
    public static final Target PAY_METHOD = Target.the("PaymanetMethod").locatedBy("//span[text()='Cash On Delivery (for testing only)']");
    public static final Target CONFIRM_1 = Target.the("Confirm1").locatedBy("//label[@for='agreement_cashondelivery_51']");
    public static final Target CONFIRM_2 = Target.the("Confirm2").locatedBy("//label[@for='agreement_cashondelivery_308']");
    public static final Target CONTINUE_BUTTON = Target.the("ButtonContinue2").locatedBy("//button[@id='custom-continue-to-payment-trigger']");
}
