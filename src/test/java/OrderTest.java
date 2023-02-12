import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class OrderTest {

    @Test
    void orderTest() {
        open("http://localhost:9999");
        $("input[type='text']").setValue("Константин Дюков");
        $("input[type='tel']").setValue("+79069935042");
        $("span[class='checkbox__box']").click();
        $("button[type='button']").click();
        $x("//p[contains(text(), 'Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.')]").shouldBe(Condition.visible);
    }
}
