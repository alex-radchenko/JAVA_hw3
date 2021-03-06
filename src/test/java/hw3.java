import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import org.junit.jupiter.api.Test;


public class hw3 {
    @Test
    void gitHub() {
        open("https://github.com/");
        $("input[placeholder='Search GitHub']").val("Selenide").pressEnter();
        $x("//a[@href='/selenide/selenide']").click();
        $x("//span[@data-content='Wiki']").click();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("JUnit5"), text("@ExtendWith({SoftAssertsExtension.class})"));
    }

    @Test
    void dragAndDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
