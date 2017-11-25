import java.util.Scanner;

/**
 * Created by surya on 10/16/17.
 */
public class decimalToBinary {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Decimal number:\n ");
        int value = input.nextInt();

        System.out.println("The binary value of "+ value + " is " + decToBin(value));




    }

    public static String decToBin(int value){
        String result = "";
        return decToBin(value, result);

    }
    public static String decToBin(int value, String result){
        if(value/2 ==0 ){
            return (value%2) + result;
        }else{
            return decToBin(value / 2, (value%2)+ result);
        }
    }



}
