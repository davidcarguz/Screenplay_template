package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class AddToCart {

    public static Performable item(String name){
        return Task.where("{0} adds " + name + " to the cart",
                Click.on(PageElement.located(By.cssSelector("button[id$='" + name + "']"))),
                Click.on(PageElement.withNameOrId("shopping_cart_container"))
                );
    }
}
