package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {

    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is last day of December", () -> {
            this.today = MonthDay.of(12, 31);
        });

        Given("today is first day of August", () -> {
            this.today = MonthDay.of(9, 1);
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
