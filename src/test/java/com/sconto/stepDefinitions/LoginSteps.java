package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);
    HomePage home;
    LoginPage login;

    @And("user enters valid data")
    public void enter_valid_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("user clicks on Anmelden button")
    public void click_on_Anmelden_button() {
        login.clickOnAnmeldenButton();
    }

    @And("user clicks on User icon")
    public void click_on_status_login_icon() {
        home = Selenide.page(HomePage.class);
        home.clickOnStatusLogin();
    }

    @Then("user verifies his name")
    public void verify_name() {
        login.verifyName();
    }

    @And("user enters valid email and wrong password")
    public void enterWrongData(DataTable table) {
        login = Selenide.page(LoginPage.class);
        login.enterWrongData(table);
    }

    @Then("user verifies error message")
    public void verify_eror_message() {
        login.verifyErrorMessageIsDisplayed();
    }
}
