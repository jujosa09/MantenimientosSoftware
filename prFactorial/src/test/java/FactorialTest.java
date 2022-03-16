import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FactorialTest {
    private Factorial factorial;
    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }
    @AfterEach
    public void finish(){
        factorial = null;
    }
    @Test
    @Timeout(5)
    public void shouldComputeReturnOneIfTheNumberIsZero(){
        int expectedValue=1;
        int obtainedValue= factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    @Timeout(5)
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        int expectedValue=1;
        int obtainedValue= factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    @Timeout(5)
    public void shouldComputeReturn2IfTheNumberIsTwo(){
        int expectedValue=2;
        int obtainedValue= factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    @Timeout(5)
    public void shouldComputeReturn6IfTheNumberIsThree(){
        int expectedValue=6;
        int obtainedValue= factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    @Timeout(5)
    public void shouldComputeReturn720IfTheNumberIs6(){
        int expectedValue=720;
        int obtainedValue= factorial.compute(6);

        assertEquals(expectedValue,obtainedValue);
        assertNotSame(expectedValue,obtainedValue);
    }
    @Test
    @Timeout(5)
    public void shouldComputeReturnErrorIfTheNumberIsNegative(){
        assertThrows(RuntimeException.class, () -> factorial.compute(-1 ));
    }


}
