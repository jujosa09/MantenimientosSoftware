import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FactorialTest {
    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero(){
        Factorial factorial = new Factorial();
        int expectedValue=1;
        int obtainedValue= factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne(){
        Factorial factorial = new Factorial();
        int expectedValue=1;
        int obtainedValue= factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }
    @Test
    public void shouldComputeReturnOneIfTheNumberIsTwo(){
        Factorial factorial = new Factorial();
        int expectedValue=2;
        int obtainedValue= factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

}
