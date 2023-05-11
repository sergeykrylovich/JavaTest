package selelnideactions;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class testSelenideActions {

    @Test
    void testHoverSolutionsGit() {
        Configuration.browser = "chrome";
        open("https://github.com/");
        $$("button.HeaderMenu-link").findBy(text("Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        $("h1.h1-mktg").shouldHave(exactText("Build like the best"));
        //sleep(5000);
    }

    @BeforeAll
    static void beforeAll () {
        baseUrl = "https://the-internet.herokuapp.com";
        browser = "chrome";
        browserSize = "1920x1080";
    }
    @Test
    void testDragDrop (){
        // Open drag and drop page
        open("/drag_and_drop");

        // Drag and drop element with text "A" to element  with text "B" by actions
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(250, 0).release().perform();

        // use dragAndDrop method to move A to B
        $("#column-a").dragAndDropTo($("#column-b"));

        // Check that elements swap
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }

}
