package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.commonFunctions.CommonFunctions;
import org.example.pages.Base;
import org.example.pages.Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class StepDefinitions {
    @Given("navigate to the application")
    public void navigate_to_the_application() {
        CommonFunctions.navigateToHomePage();
    }

    @When("Handle the page cookies")
    public void handleCookies() {
        WebDriver driver = Base.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Pages.deleteCookies();
    }

    @When("select a product")
    public void select_a_product() {
        Pages.anyOneOfTheProduct();
    }

    @Then("add the product into cart")
    public void add_the_product_into_cart() {
        Pages.priceTile();
        Pages.Quantity();
        Pages.addToCart();
    }


}
