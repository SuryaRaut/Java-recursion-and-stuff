/**
 * Created by surya on 11/26/17.
 */
public class recursive_function {
    public static void main(String [] args){
        System.out.println(Exponent(8, 4));
        System.out.println(Summation(7));
        System.out.println(Factorial(5));


    }
    // Exponentiation recursive function
    // 8 ^4 = ?
    public static int Exponent(int n , int p){
        if(p <= 0){
            return 1;
        }else{
            return n * Exponent(n, p-1);
        }
    }
    //summation recursive function
    // 4+ 3+2 + 1 + 0
    public static  int Summation(int n){
        if(n<= 0){
            return 0;
        }else{
            return n + Summation(n-1);
        }
    }
    // factorial recursive function
    // 5! = 5 * 4* 3* 2* 1

    public static int Factorial(int n){
        if(n<= 1){
            return 1;
        }else{
            return n * Factorial(n-1);
        }
    }
}
