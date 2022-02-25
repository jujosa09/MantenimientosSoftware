import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

class FactorialTest {
    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero(){
        var factorial = new Factorial();
        int expectedValue=1;
        int obtainedValue= factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        var factorial = new Factorial();
        int expectedValue=1;
        int obtainedValue= factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturn2IfTheNumberIsTwo(){
        var factorial = new Factorial();
        int expectedValue=2;
        int obtainedValue= factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturn6IfTheNumberIsThree(){
        var factorial = new Factorial();
        int expectedValue=6;
        int obtainedValue= factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturn720IfTheNumberIs6(){
        var factorial = new Factorial();
        int expectedValue=720;
        int obtainedValue= factorial.compute(6);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturnErrorIfTheNumberIsNegative(){
        var factorial = new Factorial();
        assertThrows(RuntimeException.class, () -> factorial.compute(-1 ));
    }

}
