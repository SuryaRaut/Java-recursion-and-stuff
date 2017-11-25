/**
 * Created by surya on 10/10/17.
 */
public class recursive1 {
    public static void main(String [] args){
        for (int i = 1; i<=10; i++){
        System.out.println(factionRecurse(i));}
    }

    private static double factionRecurse(int i) {
        if(i<= 0 ) return 0;
        if(i == 1) return 1;
        else
            return(factionRecurse(i-1) + 1.0/i);
    }
}
