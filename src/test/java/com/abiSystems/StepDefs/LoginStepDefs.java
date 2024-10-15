package com.abiSystems.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.abiSystems.BaseClass;
import org.abiSystems.Utils.PropertiesUtill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepDefs extends BaseClass {

    Properties properties = PropertiesUtill.loadApplicationProperties();

    @Given("user enters valid username in username field")
    public void userUserEntersValidUsernameInUsernameField() {

        String username= properties.get("username").toString();
        driver.findElement(By.xpath("//form/div[1]/input")).sendKeys(username);
    }

    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String passwword= properties.get("password").toString();
        driver.findElement(By.xpath("//form/div[2]/input")).sendKeys(passwword);

    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {

    }

    @Given("user enters invalid username in username field")
    public void userEntersInvalidUsernameInUsernameField() {

    }

    @And("User enters invalid password in password field")
    public void userEntersInvalidPasswordInPasswordField() {

    }

    @Then("user is not logged in to thr application")
    public void userIsNotLoggedInToThrApplication() {

    }
}
