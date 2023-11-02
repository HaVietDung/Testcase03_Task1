package smartosc.page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import screenplay.actions.ActionCommon;
import screenplay.common.DataTest;
import screenplay.tasks.Start;
import screenplay.user_interface.AddToCarComponent;
import screenplay.user_interface.CartComponent;

public class SimulatorPage {
    @Steps
    ActionCommon action;

    @Given("{actor} open url {word}")
    public void autoOpenUrl(Actor actor, String url){
        actor.wasAbleTo(Start.openBrowser(url));
    }

    @When("Add product {string} To Cart And Go To Cart")
    public void addToCard(String product){
        action.typeText(AddToCarComponent.PRODUCT_ID, product);
        action.clickElement(AddToCarComponent.ADD_TO_CART);
        action.pause(3000);
        action.clickElement(AddToCarComponent.GO_TO_CART);
    }

    @When("Get Infomation In Cart")
    public void getInfomationInCart(){
        action.getText(CartComponent.NAME_PRODUCT);
        String priceInCart = action.getText(CartComponent.PRICE_PRODUCT);
        Serenity.setSessionVariable("priceCart").to(priceInCart);
        action.selectDropdown(CartComponent.SELECT_QTY_PRODUCT, DataTest.QTY);
        ActionCommon.pause(5000);
        String qtyInCart = action.getValueByAttribute(CartComponent.QTY_PRODUCT, "value");
        Serenity.setSessionVariable("qtyCart").to(qtyInCart);
        action.clickElement(CartComponent.PAY_PRODUCT);
    }
}
