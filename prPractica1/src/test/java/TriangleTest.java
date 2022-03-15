import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TriangleTest {
    Triangle triangulo;
    @BeforeEach
    public void setup(){
        triangulo = new Triangle();
    }
    @Test
    public void SiElTrianguloEsEscalenoElTipoDebeSerEscaleno(){
        Triangle.TriangleType valorObtenido = triangulo.getType(5,2,4);
        Triangle.TriangleType valorEsperado = Triangle.TriangleType.SCALENE;

        assertEquals(valorObtenido,valorEsperado);

    }
    @Test
    public void SiElTrianguloEsEquilateroElTipoDebeSerEquilatero(){
        Triangle.TriangleType valorObtenido = triangulo.getType(5,5,5);
        Triangle.TriangleType valorEsperado = Triangle.TriangleType.EQUILATERAL;

        assertEquals(valorObtenido,valorEsperado);

    }
    @Test
    public void SiElTrianguloEsIsoscelesElTipoDebeSerIsoscelesPeroElLado1YElLado2SonIguales(){
        Triangle.TriangleType valorObtenido = triangulo.getType(5,5,4);
        Triangle.TriangleType valorEsperado = Triangle.TriangleType.ISOSCELES;

        assertEquals(valorObtenido,valorEsperado);

    }
    @Test
    public void SiElTrianguloEsIsoscelesElTipoDebeSerIsoscelesPeroElLado1YElLado3SonIguales(){
        Triangle.TriangleType valorObtenido = triangulo.getType(5,4,5);
        Triangle.TriangleType valorEsperado = Triangle.TriangleType.ISOSCELES;

        assertEquals(valorObtenido,valorEsperado);

    }
    @Test
    public void SiElTrianguloEsIsoscelesElTipoDebeSerIsoscelesPeroElLado2YElLado3SonIguales(){
        Triangle.TriangleType valorObtenido = triangulo.getType(4,5,5);
        Triangle.TriangleType valorEsperado = Triangle.TriangleType.ISOSCELES;

        assertEquals(valorObtenido,valorEsperado);

    }
    @Test
    public void SiAlgunoDeLosLadosSon0DevuelveError(){
        assertThrows(RuntimeException.class, () -> triangulo.getType(0,2,3));
        assertThrows(RuntimeException.class, () -> triangulo.getType(2,0,3));
        assertThrows(RuntimeException.class, () -> triangulo.getType(2,3,0));

    }
    @Test
    public void SiAlgunoDeLosLadosSonMenoresQue0DevuelveError(){
        assertThrows(RuntimeException.class, () -> triangulo.getType(-1,2,3));
        assertThrows(RuntimeException.class, () -> triangulo.getType(2,-1,3));
        assertThrows(RuntimeException.class, () -> triangulo.getType(2,3,-1));

    }
    @Test
    public void SiLaSumaDeDosDeSusLadosEsIgualOMenorAlTerceroDevuelveError(){
        assertThrows(RuntimeException.class, () -> triangulo.getType(1,2,3));
        assertThrows(RuntimeException.class, () -> triangulo.getType(3,1,2));
        assertThrows(RuntimeException.class, () -> triangulo.getType(2,3,1));
        assertThrows(RuntimeException.class, () -> triangulo.getType(1,2,4));
        assertThrows(RuntimeException.class, () -> triangulo.getType(4,1,2));
        assertThrows(RuntimeException.class, () -> triangulo.getType(2,4,1));

    }



}
