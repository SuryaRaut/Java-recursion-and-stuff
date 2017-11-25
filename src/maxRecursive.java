import java.util.Scanner;

/**
 * Created by surya on 10/10/17.
 */
public class maxRecursive {
    public static void main(String [] args){
        int [] a = new int [8] ;
        //int max = maxArrValue(a, a.length);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 8 integers\n ");

        for(int i = 0; i<a.length; i++){
            a[i]= input.nextInt();
        }
        System.out.println("The largest Number in Array is " + maxArrValue(a));
    }

    private static int maxArrValue(int[] a) {

        return maxArrValue(a, 0, a[0]);

    }
    private static int maxArrValue(int [] a, int i, int high){
        if(i == a.length)
            return high;
        if(high < a[i])
            high = a[i];
        return maxArrValue(a, i+1, high);
    }

}
