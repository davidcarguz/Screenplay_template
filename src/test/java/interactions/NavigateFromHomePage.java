package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class NavigateFromHomePage {

    private static final Target CART_ICON = Target.the("shopping cart icon").located(By.id("shopping_cart_container"));

    public static Performable toCartPage() {
        return Task.where("{0} navigates to cart page",
                Click.on(CART_ICON)
        );
    }
}
