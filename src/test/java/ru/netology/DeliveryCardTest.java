package ru.netology;

import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class DeliveryCardTest {

    @Test
    void shouldRegisterUser() {
        open("http://localhost:9999/");

        $x("//a[text()='Город']").click();
        $("[type=text]").setValue("Казань");
        $("[type=tel]").setValue("17.05.2023");
        $("[type=text]").setValue("Антонов Антон");
        $("[type=tel]").setValue("+79995555555");
        $("span[class=checkbox__text]").click();
        $("span[class=button__text").click();

        $x("//p[contains(text(), 'Встреча успешно забронирована на ''17.05.2023')]").should(appear, Duration.ofSeconds(8));




    }

}
