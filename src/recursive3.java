/**
 * Created by surya on 10/10/17.
 */
public class recursive3 {
    public static  void main(String [] args){
        for(int i = 1; i<=10; i++){
            System.out.println(recursive(i));

        }
    }

    private static double recursive(int i) {
        if(i==1){
            return 1.0/2.0;
        }else{
            return recursive(i-1) + i/ (i + 1.0);
        }
    }

}
