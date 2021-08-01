import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeTest {

    @Test
    public void testSayHello() {
        Code code = new Code();
        assertEquals("Hello world!", code.sayHello());
    }
}