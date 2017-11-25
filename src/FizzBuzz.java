import java.util.Scanner;

/**
 * Created by surya on 10/22/17.
 */
public class FizzBuzz {


    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: \n");
        String input = sc.nextLine();
        String [] line = input.split(" ");
        int SIZE = line.length;
        int i;

        int [] array = new int[SIZE];
        for (i = 0; i<SIZE; i++ ){
            array[i] =  Integer.parseInt(line[i]);

            }
        System.out.println(array[i]);







   }
}
