package stepDefinition;

import base.baseClass;
import base.method;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class login extends baseClass{

    public WebDriver driver;
    method x = new method();

    @Given("goto site")
    public void goto_site() throws Throwable{
        driver = baseClass.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etstur.com");

        x.hoverElement("//*[@id=\"header\"]/nav/div[3]/div[2]/ul/li[4]/div","xpath");
        x.clickElement("//*[@id=\"header\"]/nav/div[3]/div[2]/ul/li[4]/div/div/div[2]/div/button[1]","xpath");
    }

    @And("^enter username \"([^\"]*)\"$")
    public void enter_username(String username) {
        x.setElement("tb-contactEmailSignIn","id",username);
    }

    @And("^enter password \"([^\"]*)\"$")
    public void enter_password(String password) {
        x.setElement("showPass_2","id",password);
    }

    @When("click login button")
    public void click_login_button() {
        x.clickElement("btn-signin","id");

    }

    @Then("login is success")
    public void login_is_success() {
        System.out.print("login başarılı");
    }

}
