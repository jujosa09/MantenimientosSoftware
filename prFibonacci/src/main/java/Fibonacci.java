public class Fibonacci {
    public int compute(int valor){
        int resultado;
        if(valor == 1){
            resultado = 0;
        }else if(valor == 2 || valor == 3){
            resultado = 1;
        }else{
            throw new RuntimeException("El valor que has introducido es erroneo: " + valor);
        }
        return resultado;
    }
}
