import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestHello {

    @Test
    public void testFoo() {
        int result = 5 + 5 * 2;
        assertEquals(result, 15);
    }

}