

import Config.WebDriverProvider;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTests {

    @Test
    public void simpleTestForLess15(){
        WebDriverProvider.config();
        open("");
        $(".d-lg-flex").shouldHave(text("Product"));
    }
}
