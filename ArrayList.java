
package arraylistexample;
import java.util.ArrayList;



public class ArrayListexample {

    
    public static void main(String[] args) {
        arrayLists.add("1");
        arrayLists.add("2");
        arrayLists.add("3");
        arrayLists.add("4");
        
        System.out.println(arrayLists.get(0));
        System.out.println(arrayLists.get(1));
        System.out.println(arrayLists.get(2));
        System.out.println(arrayLists.get(3));
        
         arrayLists.add(2, "10");
        
        System.out.println("After updated values: ");
        System.out.println(arrayLists.get(0));
        System.out.println(arrayLists.get(1));
        System.out.println(arrayLists.get(2));
        System.out.println(arrayLists.get(3));
        
        String remove = arrayLists.remove(0);
        
         System.out.println("After deleting values: "+remove);
        System.out.println(arrayLists.get(0));
        System.out.println(arrayLists.get(1));
        System.out.println(arrayLists.get(2));
        System.out.println(arrayLists.get(3));
    }
    
}
