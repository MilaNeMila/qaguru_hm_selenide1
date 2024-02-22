import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Test6hmHover extends TestBaseGit {

    @Test
    void enterpriseShoudHaveTextTest(){
        open("");
        $$(".HeaderMenu-link").filterBy(text("Solutions")).first().hover();
        $(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldBe(visible);
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered\n" +"developer platform."));
    }
}
