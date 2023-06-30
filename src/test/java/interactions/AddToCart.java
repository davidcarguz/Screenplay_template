package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.By;

public class AddToCart {

    public static Performable item(String name){
        return Task.where("{0} adds " + name + " to the cart",
                Click.on(Button.located(By.cssSelector("button[id*='" + name + "']")))
                );
    }

}
