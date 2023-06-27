package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Cart {
    public static Question<Integer> numberOfItemsAdded() {
        return Question.about("The number of Items in the cart").
                answeredBy(actor -> BrowseTheWeb.as(actor).findAll(".cart_item").size());
    }
}
