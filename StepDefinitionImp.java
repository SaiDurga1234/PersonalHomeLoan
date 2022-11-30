package Homeloan.stepDefinitions;

import io.cucumber.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;


public class StepDefinitionImp {

    @Given("^I visit \"([^\"]*)\"$")
    public void i_visit_(String strArg1) throws Throwable {
      System.out.println("Home Loan browser is opened");
    }

    @When("^I hit Start over,$")
    public void i_hit_start_over() throws Throwable {
       WebElement button=driver.findElement(By.xpath("//button[@role='button']");
      System.out.println(driver.findElement(By.xpath("//button[@role='button']")).click());
    }

    @When("^I hit \"([^\"]*)\"$")
    public void i_hit_borrow(String strArg1) throws Throwable {

      WebElement button1=driver.findElement(By.id("btnBorrowCalculator")).click();

        System.out.println(driver.findElement(By.id("btnBorrowCalculator")).isSelected());
    }

    @Then("^should \"([^\"]*)\"$")
    public void should_clearform(String strArg1) throws Throwable {
       System.out.println("Clear form");
    }

    @Then("^I should see \"([^\"]*)\",$")
    public void i_should_see_message(List<String> list1) throws Throwable {
        System.out.println("Based on the details you've entered,we're unable to give you an estimate of your borrowing power with this calculator.For questions,call us on 1800 100 641");
    }

    @And("^be redirected to a clear form\.$")
    public void be_redirected_to_a_clear_form() throws Throwable {
       System.out.println("Redirects to clear form by hitting Start over");
    }

    @And("^I select \"([^\"]*)\" on radio \"([^\"]*)\",$")
    public void i_select_something_on_radio_application(String strArg1, String strArg2) throws Throwable {
        WebElement radiobutton = driver.findElement(By.id("application_type_single");
          System.out.println(driver.findElement(with(By.tagName("Label")).below(radiobutton)).click());
    }

    @And("^I select \"([^\"]*)\" from dropdown \"([^\"]*)\",$")
    public void i_select_something_from_dropdown_something(String strArg1, String strArg2) throws Throwable {
        Select Numberdependents= driver.findElement(By.id("q1q2"));
          Numberdependents.SelectByIndex(0);
        System.out.println(driver.findElement(By.id("q1q2")).isSelected());
    }

    @And("^I select \"([^\"]*)\" on radio \"([^\"]*)\",$")
    public void i_select_something_on_radio_property(String strArg1, String strArg2) throws Throwable {
        WebElement radiobutton1 = driver.findElement(By.id("borrow_type_home");
          System.out.println(driver.findElement(with(By.tagName("Label")).below(radiobutton1)).click());
    }

    @And("^I type \"([^\"]*)\" into field \"([^\"]*)\",$")
    public void i_type_something_into_field_personalinfo(String strArg1, String strArg2) throws Throwable {

          WebElement AnnualIncome=driver.findElement("//input[@aria-labelledby='q2q1']").sendKeys("80000");
          WebElement OtherAnnualIncome=driver.findElement("//input[@aria-labelledby='q2q2']").sendKeys("10000");
          WebElement MontlyLivingExpenses=driver.findElement("//input[@class='required invalid']").sendKeys("500");
          WebElement Homeloanrepayments=driver.findElement("//input[@id='homeloans']").sendKeys("0");
          WebElement OtherHomeloanrepayments=driver.findElement("//input[@id='otherloans']").sendKeys("100");
          WebElement Othermontlycommitments=driver.findElement("//input[@aria-labelledby='q3q4']").sendKeys("0");
          WebElement Totalcreditlimits=driver.findElement("//input[@id='credit']").sendKeys("10000");
          WebElement EstimateBorrow=driver.findElement(By.id("borrowResultTextAmount")).SendKeys("479000");
         

        System.out.println("Personal loan Information is Entered & Estimated Borrow ");
    }

}
