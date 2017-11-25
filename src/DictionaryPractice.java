import java.util.HashMap;
import java.util.Map;

/**
 * Created by surya on 11/25/17.
 */
public class DictionaryPractice {

    public static void main(String [] args){

        //dict
        Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
//        dictionary.put("apple", "Sweet");
//        dictionary.put("banana", "yellow");
//        dictionary.put("grapes", "wine");
//        dictionary.put("ginger", "medic");
//        dictionary.put("potato", "Carb");

        dictionary.put(5, 25);
        dictionary.put(4, 16);
        dictionary.put(6, 36);
        dictionary.put(7, 49);
        dictionary.put(3, 9);

//        System.out.println(dictionary.get("apple"));
//        System.out.println(dictionary.get("banana"));
//        System.out.println(dictionary.get("grapes"));
//        System.out.println(dictionary.get("ginger"));
//        System.out.println(dictionary.get("potato"));

        //System.out.println(dictionary.get("apple"));
        System.out.println(dictionary.get(5));
        System.out.println(dictionary.get(4));
        System.out.println(dictionary.get(6));
        System.out.println(dictionary.get(7));
        System.out.println(dictionary.get(3));

        //print out only keys
        System.out.println(dictionary.keySet());
        //print out only values
        System.out.println(dictionary.values());
        //print out size of dict
        System.out.println("Size of Our dict is " + dictionary.size());

        System.out.println("New Print out");

        System.out.println(dictionary.toString());
        //dictionary.clear();
        System.out.println(dictionary.isEmpty());
        //dictionary.remove(3);
        dictionary.put(9, 81);
        System.out.println(dictionary.toString());
        System.out.println(dictionary.isEmpty());
        dictionary.replace(9, 85);
        System.out.println(dictionary.toString());








    }


}
