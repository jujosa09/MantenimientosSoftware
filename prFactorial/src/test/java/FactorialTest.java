import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    public void shouldComputeReturnOneIfTheNumberIsZero(){
        int expectedValue=1;
        int obtainedValue= factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        int expectedValue=1;
        int obtainedValue= factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturn2IfTheNumberIsTwo(){
        int expectedValue=2;
        int obtainedValue= factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturn6IfTheNumberIsThree(){
        int expectedValue=6;
        int obtainedValue= factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturn720IfTheNumberIs6(){
        int expectedValue=720;
        int obtainedValue= factorial.compute(6);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturnErrorIfTheNumberIsNegative(){
        assertThrows(RuntimeException.class, () -> factorial.compute(-1 ));
    }

}
