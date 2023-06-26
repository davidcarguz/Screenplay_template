package step_definitions;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.InputField;
import net.serenitybdd.screenplay.ui.PageElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DisplayName("Searching On Wikipedia and Google")
@ExtendWith(SerenityJUnit5Extension.class)
public class searchSteps {
    @CastMember
    Actor searchUser;

    @Test
    void whenSearchingByKeyword() {
        searchUser.attemptsTo(
                Open.url("https://en.wikipedia.org/wiki/Main_Page"),
                Enter.theValue("Cucumber").into(InputField.withPlaceholder("Search Wikipedia")).
                        thenHit(Keys.ENTER),
                Ensure.that(PageElement.withNameOrId("firstHeading")).text().contains("Cucumber")
        );
    }
    @Test
    void whenSearchingInGoogle() {
        searchUser.attemptsTo(
                Open.url("https://www.google.com/"),
                Enter.theValue("Colombia").into(InputField.located(By.cssSelector("textarea[class='gLFyf']"))).
                        thenHit(Keys.ENTER),
                Ensure.that(PageElement.located(By.cssSelector("div[class='SPZz6b'] h2 span"))).text().contains("Colombia")
        );
    }
}
