package yandex.boyko;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork2 {

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
    $("[data-filterable-for=wiki-pages-filter]").shouldHave(text("SoftAssertions")).click();
    //check text junit5
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class")).shouldBe(visible);
  }
}
