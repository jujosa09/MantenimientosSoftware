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
 *      13  ->  144
 *
 * @author Juan José Dols Lola
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
    @Test
    public void SiLaEntradaEs3LaSalidaEs1(){
        int valorEsperado = 1;
        int valorObtenido = fibonacci.compute(3);
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEs4LaSalidaEs2(){
        int valorEsperado = 2;
        int valorObtenido = fibonacci.compute(4);
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEs5LaSalidaEs3(){
        int valorEsperado = 3;
        int valorObtenido = fibonacci.compute(5);
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEs6LaSalidaEs5(){
        int valorEsperado = 5;
        int valorObtenido = fibonacci.compute(6);
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEs7LaSalidaEs8(){
        int valorEsperado = 8;
        int valorObtenido = fibonacci.compute(7);
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEs13LaSalidaEs144(){
        int valorEsperado = 144;
        int valorObtenido = fibonacci.compute(13);
        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void SiLaEntradaEsMenorQue1DaError(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(0 ));
    }
}
