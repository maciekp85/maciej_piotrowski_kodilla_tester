package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItSummerSteps implements En {

    private String today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            this.today = "last day of December";
        });

        When("I ask whether it's Summer", () -> {
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}
