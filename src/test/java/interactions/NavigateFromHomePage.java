package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.PageElement;

public class NavigateFromHomePage {

    public static Performable toCartPage() {
        return Task.where("{0} navigates to cart page",
                Click.on(PageElement.withNameOrId("shopping_cart_container"))
        );
    }
}
