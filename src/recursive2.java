/**
 * Created by surya on 10/10/17.
 */
public class recursive2 {
    public static void main(String [] args){
        for (int i=1; i<=10; i++){
        System.out.println(fractionRecursive(i));}
    }

    private static double fractionRecursive(int i) {
        if(i == 1) {
            return 1.0/3.0;
        }else {
            double num = i/(2.0 * i + 1.0);
            return num + fractionRecursive(i-1);
        }

    }
}
