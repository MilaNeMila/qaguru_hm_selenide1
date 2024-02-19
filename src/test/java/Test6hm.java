import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class Test6hm extends TestBaseGit {
    @Test
    void searchTest(){
        open("selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class}) " +
                "class Tests { " +
                "  @Test " +
                "  void test() { " +
                "    Configuration.assertionMode = SOFT; " +
                "    open(\"page.html\"); " +
                " " +
                "    $(\"#first\").should(visible).click(); " +
                "    $(\"#second\").should(visible).click(); " +
                "  } " +
                "}"));
    }


}
