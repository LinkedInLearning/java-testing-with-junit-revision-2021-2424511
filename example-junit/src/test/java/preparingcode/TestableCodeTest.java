package preparingcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestableCodeTest {

    private static TestableCode tc = new TestableCode();
    @Test
    @DisplayName("Test greeting special name")
    public void testSpecialNameGreeting() {
        String name = "Noah";
        assertTrue(tc.greetUser(name).contains("VIP"));
    }

    @Test
    @DisplayName("Test greeting special and known name")
    public void testSpecialAndKnownNameGreeting() {
        String name = "Tess";
        assertTrue(tc.greetUser(name).contains("even"));
    }

    @Test
    @DisplayName("Test greeting unknown name")
    public void testUnknownNameGreeting() {
        String name = "Sascha";
        assertTrue(tc.greetUser(name).contains("stranger"));
    }

    @Test
    @DisplayName("Test part of the day greeting")
    public void testDayPart() {
        String dayPart = "";
        LocalDateTime dateTime = LocalDateTime.now();
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            dayPart += "Good night, ";
        }
        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            dayPart += "Good morning,";

        }
        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            dayPart += "Good afternoon, ";
        }
        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            dayPart += "Good evening, ";
        }

        assertTrue(tc.greetUser("anyName").contains(dayPart));
    }
}
