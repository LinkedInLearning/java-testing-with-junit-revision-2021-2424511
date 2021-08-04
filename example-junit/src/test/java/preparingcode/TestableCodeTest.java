package preparingcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestableCodeTest {

    private static TestableCode tc = new TestableCode();
    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Noah";
        String outcome = "I don't know you, Noah. But you are on our VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialAndKnownNameGreeting() {
        String name = "Tess";
        String outcome = "I know you, Tess.You're even on our VIP list!";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting() {
        String name = "Sascha";
        String outcome = "stranger";
        assertEquals(outcome, tc.greetUser(name));
    }

    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart() {
        LocalDateTime dateTime = LocalDateTime.of(2021, 8, 4, 13, 15);
        String outcome = "Good afternoon, ";
        assertEquals(outcome, tc.greetDay(dateTime));
    }
}
