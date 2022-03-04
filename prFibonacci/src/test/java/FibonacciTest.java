import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Clase creada para probar la clase Fibonacci
 *
 * Valores de entradas que se van a probar:
 *  Entrada:    Valor:
 *      1   ->  0
 *      2   ->  1
 *      3   ->  1
 *      4   ->  2
 *      5   ->  3
 *      6   ->  5
 *      7   ->  8
 */

public class FibonacciTest {
    private Fibonacci fibonacci;
    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }
    @Test
    public void SiLaEntradaEs1LaSalidaEs0(){
        int valorEsperado = 0;
        int valorObtenido = fibonacci.compute(1);

        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEs2LaSalidaEs1(){
        int valorEsperado = 1;
        int valorObtenido = fibonacci.compute(2);
        assertEquals(valorEsperado,valorObtenido);
    }
}
