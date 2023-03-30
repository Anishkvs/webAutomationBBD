package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        
    	System.out.println("Navigate login");
    }

      
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
      
    
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	
    	System.out.println("HomePage");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    System.out.println(strArg1);
    }

    @When("^user signup with following details$")
    public void user_signup_with_following_details(DataTable data) throws Throwable {
       List<List<String>> obj = data.asLists();
       System.out.println(obj.get(0).get(0));
       System.out.println(obj.get(0).get(1));
       System.out.println(obj.get(0).get(2));
       System.out.println(obj.get(0).get(3));
       System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login in to application with (.+) and (.+) \"([^\"]*)\"$")
    public void user_login_into_application_with_and_something(String username, String password, String strArg1) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
}







