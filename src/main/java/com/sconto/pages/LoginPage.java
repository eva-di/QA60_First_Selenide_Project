package com.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.sconto.utils.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static final String validEmail = PropertiesLoader.loadProperty("valid.email");
    public static final String validPassword = PropertiesLoader.loadProperty("valid.password");
    public static final String userName = PropertiesLoader.loadProperty("user.name");

    @FindBy(css = ".existingAccount__headline")
    WebElement loginTitle;
    public SelenideElement verifyLoginTitle() {
        return $(loginTitle).shouldHave(text("Anmelden"));
    }

    @FindBy(id = "loginEmail")
    WebElement emailField;
    @FindBy(id = "loginPassword")
    WebElement passwordField;
    public LoginPage enterData() {
        $(emailField).val(validEmail);
        $(passwordField).val(validPassword);
        return Selenide.page(this);
    }

    @FindBy(id = "login-submit")
    WebElement anmeldenButton;
    public HomePage clickOnAnmeldenButton() {
        $(anmeldenButton).click();
        return Selenide.page(HomePage.class);
    }

    @FindBy(css = ".titleHeadline")
    WebElement userNameTitle;
    public SelenideElement verifyName() {
        return $(userNameTitle).shouldHave(text(userName));
    }
}
