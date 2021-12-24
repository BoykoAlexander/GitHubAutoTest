package yandex.boyko;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {

  @Test
  void moveARectangle() {
    // open site
    open("https://the-internet.herokuapp.com/drag_and_drop");
    // swap rectangle
    $("#column-a").dragAndDropTo($("#column-b"));
    // check place rectangle
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));

  }
}
