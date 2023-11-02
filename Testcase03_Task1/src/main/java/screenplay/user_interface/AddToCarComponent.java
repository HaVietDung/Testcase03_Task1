package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCarComponent {
    public static final Target PRODUCT_ID = Target.the("Product_ID_Input").locatedBy("//input[@name='product_id']");
    public static final Target ADD_TO_CART = Target.the("Add_To_Cart_Btn").locatedBy("//input[@value='Add To Cart']");
    public static final Target GO_TO_CART = Target.the("Go_To_Cart_Btn").locatedBy("//input[@value='Go To Cart']");
}
