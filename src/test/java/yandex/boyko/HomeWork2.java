package yandex.boyko;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork2 {

  /*  Задание - 1
    Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск найдёт разные элементы?

    Ответ: $("h1 div") - будет искать элемент div вложенный в h1
           $("h1").$("div") - будет искать внутри первого найденного h1 элемент div
   */

  @Test
  void checkTestFromGitHub() {
    //Open Site
    open("https://github.com/");
    //search
    $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
    //click on href
    $$("ul.repo-list li").first().$("a").click();
    // click at wiki
    $("#wiki-tab").click();
    //search SoftAssertions
    $("#wiki-pages-filter").setValue("SoftAssertions");
    //check SoftAssertions and open
    $("[data-filterable-for=wiki-pages-filter]").$(byText("SoftAssertions")).click();
    //check text junit5
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class")).shouldBe(visible);
  }
}
