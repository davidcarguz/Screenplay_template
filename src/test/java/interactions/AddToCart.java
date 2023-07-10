package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;

public class AddToCart {

    private static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
            .locatedBy("button[data-test*='add-to-cart']");

    public static Performable item(String name){
        return Task.where("{0} adds " + name + " to the cart",
                Click.on(Button.located(By.cssSelector("button[id*='" + name + "']")))
                );
    }

    public static Performable fromProductPage(){
        return Task.where("{0} add the product",
                Click.on(ADD_TO_CART_BUTTON));
    }

}
