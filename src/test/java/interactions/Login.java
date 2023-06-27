package interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ui.InputField;
import org.openqa.selenium.By;

public class Login {

    public static Performable as(String userName, String password) {
        return Task.where("{0} logs in as " + userName,
                Open.url("https://www.saucedemo.com/"),
                Enter.theValue(userName).into(InputField.withNameOrId("user-name")),
                Enter.theValue(password).into(InputField.withNameOrId("password")),
                Click.on(By.id("login-button"))
        );
    }
}
