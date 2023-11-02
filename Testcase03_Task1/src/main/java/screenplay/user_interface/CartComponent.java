package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class CartComponent {
    public static final Target NAME_PRODUCT = Target.the("NameProductInCart").locatedBy("//strong[@class='product-item-name']//a");
    public static final Target PRICE_PRODUCT = Target.the("PricePriductInCart").locatedBy("//tr[@class='grand totals']//span[@class='price']");
    public static final Target SELECT_QTY_PRODUCT = Target.the("Select_Qty_Product").locatedBy("//div[@class='field qty']//select");
    public static final Target QTY_PRODUCT = Target.the("Qty_Product_In_Cart").locatedBy("//div[@class='field qty']//select//option");
    public static final Target PAY_PRODUCT = Target.the("ThanhToanBtn").locatedBy("//ul[@class='checkout methods items checkout-methods-items']//button");

}
