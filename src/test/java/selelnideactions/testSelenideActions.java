package selelnideactions;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
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

    @Test
    void testDragDrop (){
        

    }

}
