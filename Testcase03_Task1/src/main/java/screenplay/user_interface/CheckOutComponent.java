package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class CheckOutComponent {
    public static final Target EMAII_INPUT = Target.the("EmailInput").locatedBy("//input[@id='customer-email']");
    public static final Target FIRST_NAME_INPUT = Target.the("FirstInput").locatedBy("//div[@name='shippingAddress.firstname']//input");
    public static final Target LAST_NAME_INPUT =  Target.the("LastName").locatedBy("//div[@name='shippingAddress.lastname']//input");
    public static final Target ADDRESS_INPUT = Target.the("AddressInput").locatedBy("//div[@name='shippingAddress.street.0']//input");
    public static final Target PROVINCE_INPUT = Target.the("ProvinceInput").locatedBy("//div[@name='shippingAddress.region_id']//select");
    public static final Target DISTRICT_INPUT = Target.the("DistrictInput").locatedBy("//div[@name='shippingAddress.custom_attributes.district_id']//select");
    public static final Target PHONE_INPUT = Target.the("PhoneNumberInput").locatedBy("//div[@name='shippingAddress.telephone']//input");
    public static final Target QTY_IN_CHECK_OUT = Target.the("QtyInCheckOutPage").locatedBy("//div[@class='details-qty']//span[@class='value']");
    public static final Target PRICE_IN_CHECK_OUT = Target.the("PriceInCheckOutPage").locatedBy("//tr[@class='grand totals']//span[@class='price']");
    public static final Target CONTINUE_BUTTON = Target.the("ContinueButton").locatedBy("//button[@id='custom-continue-to-payment-trigger']");
}
