/**
 * Clase que calcula dado un valor de entrada,
 * la correspondiente salida en la sucesión de
 * Fibonacci.
 *
 * @author Juan José Dols Lola
 */

public class Fibonacci {
    public int compute(int valor) {
        int resultado;
        if(valor < 1){
            throw new RuntimeException("El valor que has introducido es erroneo: " + valor);
        }else if (valor == 1){
            resultado = 0;
        }else if(valor == 2 || valor == 3){
            resultado = 1;
        }else{
            resultado = compute(valor-1) + compute(valor -2);
        }
        return resultado;
    }
}
