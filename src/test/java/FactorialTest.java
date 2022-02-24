import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FactorialTest {
    @Test
    public void test1(){
        Factorial factorial = new Factorial();
        int expectedValue=1;
        int obtainedValue= factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

}
