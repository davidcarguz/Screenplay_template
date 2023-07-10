package step_definitions;

import interactions.AddToCart;
import interactions.Login;
import interactions.NavigateFromHomePage;
import interactions.Navigates;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import questions.Cart;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Sauce Demo Shop")
@ExtendWith(SerenityJUnit5Extension.class)
public class searchSteps {
    @CastMember(name = "Buyer")
    Actor user;
    @Test
    void addItemToCard() {
        user.attemptsTo(
                Login.as("standard_user", "secret_sauce"),
                AddToCart.item("backpack"),
                NavigateFromHomePage.toCartPage(),
                Ensure.that(Cart.numberOfItemsAdded()).isEqualTo(1)
        );
    }

    @Test
    void addSeveralItemsToCard() {
        user.attemptsTo(
                Login.as("standard_user", "secret_sauce"),
                AddToCart.item("backpack"),
                AddToCart.item("jacket"),
                AddToCart.item("bolt"),
                NavigateFromHomePage.toCartPage(),
                Ensure.that(Cart.numberOfItemsAdded()).isEqualTo(3)
        );
    }

    @Test
    void addProductFromProductPage() {
        user.attemptsTo(
                Login.as("standard_user", "secret_sauce"),
                NavigateFromHomePage.toProductPage("Backpack"),
                AddToCart.fromProductPage(),
                Navigates.backToMainPageFromProductPage(),
                NavigateFromHomePage.toCartPage(),
                Ensure.that(Cart.numberOfItemsAdded()).isEqualTo(1)



        );
    }
}
