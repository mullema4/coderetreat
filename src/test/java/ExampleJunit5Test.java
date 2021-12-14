import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleJunit5Test {

    @Test
    public void equalityTest() {
        assertEquals(1, 1, "1 should equal 1");
    }
}