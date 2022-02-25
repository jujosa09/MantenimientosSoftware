/**
 * Esta clase realiza el factorial de un numero cualquiera
 *
 * @author Juan José Dols Lola
 */

public class Factorial {
    public int compute (int value){
        int result = 1;
        if(value < 0){
            throw new RuntimeException("The value is negative: " + value);
        }
        if((value == 0) || (value == 1)){
            result = 1;
        }else{
            for(int i = 1; i <= value; i++){
                result *= i;
            }
        }
        return result;
    }
}
