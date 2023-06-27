package step_definitions;

import interactions.AddToCart;
import interactions.Login;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.PageElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import questions.Cart;


@DisplayName("Searching On Wikipedia and Google")
@ExtendWith(SerenityJUnit5Extension.class)
public class searchSteps {
    @CastMember(name = "David")
    Actor searchUser;

    @Test
    void loginIntoSauceDemo() {
        searchUser.attemptsTo(
                Login.as("standard_user", "secret_sauce"),
                Ensure.that(PageElement.containingText("Products")).isDisplayed()
        );
    }
    @Test
    void addItemToCard() {
        searchUser.attemptsTo(
                Login.as("standard_user", "secret_sauce"),
                AddToCart.item("backpack"),
                Ensure.that(Cart.numberOfItemsAdded()).isEqualTo(1)
        );
    }
}
