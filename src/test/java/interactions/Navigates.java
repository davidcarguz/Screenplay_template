package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Navigates {

    private static final Target BACK_TO_PRODCUTS_BUTTON = Target.the("back to products button")
            .locatedBy("button[data-test*='back-to-products']");

    public static Performable backToMainPageFromProductPage(){
        return Task.where("{0} navigates back to main page from product page",
                Click.on(BACK_TO_PRODCUTS_BUTTON));
    }
}
