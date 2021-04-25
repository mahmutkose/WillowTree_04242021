package exp.willowTree.step_definitions;

import exp.willowTree.pages.GameIntroPage;
import exp.willowTree.utilities.BrowserUtils;
import exp.willowTree.utilities.ConfigurationReader;
import exp.willowTree.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LandingPageStepDefinitions {
   GameIntroPage page=new GameIntroPage();


    @Given("User on Landing page")
    public void user_on_landing_page()  {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println("================Automation Started====================");
    }

    @When("User able to see page title : name game")
    public void user_able_to_see_page_title_name_game() {
        String expectedResult="name game";
        //String actualResult =GameIntroPage.nameGameText.getText();
        Assert.assertEquals(expectedResult,GameIntroPage.nameGameText.getText());
        BrowserUtils.wait(2);
    }

    @Then("User able to see current numbers on counters")
    public void user_able_to_see_current_numbers_on_counters() {


        String expectedResultForCounterTries="0";
        String expectedResultForCounterCorrect="0";
        String expectedResultForCounterStreak="0";

        String actualResult=GameIntroPage.counterTries.getText();
        Assert.assertEquals(expectedResultForCounterTries,actualResult);
        BrowserUtils.wait(1);
        Assert.assertEquals(expectedResultForCounterCorrect,GameIntroPage.counterCorrect.getText());
        BrowserUtils.wait(1);
        Assert.assertEquals(expectedResultForCounterStreak,GameIntroPage.counterStreak.getText());


    }
    //=============================================================================================
    @When("verify Streak Counters incrementing After four Streak")
    public void verifyStreakCountersIncrementingAfterFourStreak() {
        page.verifyCounterAfter4Streak();
        BrowserUtils.wait(2);
        Assert.assertTrue(GameIntroPage.counterStreak.getText().equals("4"));
        BrowserUtils.wait(2);
    }

    @Then("Verify that correct counter is four")
    public void verify_that_correct_counter_is_four() {
        BrowserUtils.wait(2);
        Assert.assertTrue(GameIntroPage.counterCorrect.getText().equals("4"));
        System.out.println("GameIntroPage.counterCorrect.getText() = " + GameIntroPage.counterCorrect.getText());
        BrowserUtils.wait(2);
    }
    @Then("Verify that tries counter is four")
    public void verify_that_tries_counter_is_four() {
        Assert.assertTrue(GameIntroPage.counterTries.getText().equals("4"));
        System.out.println("GameIntroPage.counterTries = " + GameIntroPage.counterTries.getText());
        BrowserUtils.wait(2);
    }

    @Then("Click on every wrong picture in one session")
    public void click_on_every_wrong_picture_in_one_session() {
        page.findIncorrectAnswer();
        BrowserUtils.wait(2);
    }
    @Then("Verify that correct counter is became four")
    public void verify_that_correct_counter_is_became_four() {
        Assert.assertTrue(GameIntroPage.counterCorrect.getText().equals("4"));
        System.out.println("GameIntroPage.counterCorrect.getText() = " + GameIntroPage.counterCorrect.getText());
        BrowserUtils.wait(2);
    }
    @Then("Verify that tries counter is became eight")
    public void verify_that_tries_counter_is_became_eight() {
        Assert.assertTrue(GameIntroPage.counterTries.getText().equals("8"));
        System.out.println("GameIntroPage.counterTries = " + GameIntroPage.counterTries.getText());
        BrowserUtils.wait(2);
    }
    @And("Verify that incorrect answers reset Streak counter")
    public void verifyThatIncorrectAnswersResetStreakCounter() {

         Assert.assertTrue(GameIntroPage.counterStreak.getText().equals("0"));
        System.out.println("GameIntroPage.counterStreak.getText() = " + GameIntroPage.counterStreak.getText());
        BrowserUtils.wait(2);

    }

    @Given("Verify names and photos not duplicated on Landing page")
    public void verifyNamesAndPhotosOnLandingPage() {
        System.out.println("============Verify Duplicated Photos============");
        BrowserUtils.wait(1);
        page.assertImages();
        BrowserUtils.wait(1);
        System.out.println("============VERIFIED!!!=================");
    }

    @Then("Verify that photos changed")
    public void verify_that_photos_changed() {
        System.out.println("============Verify no duplications between sessions============");
        page.compareImgAndNamesBetweenTwoSession();
        System.out.println("============VERIFIED!!!=================");
        BrowserUtils.wait(2);
        System.out.println("================Automation Finished====================");

        Driver.closeDriver();
    }



}



