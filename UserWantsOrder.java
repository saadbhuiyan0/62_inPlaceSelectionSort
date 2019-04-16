/**
  Exercise constructing  an OrderedList
  from unordered data.
 */
import java.util.ArrayList;  // shortcut

public class UserWantsOrder {
    
    public static void main(String[] commandLine) {
        System.out.println();
        
        // create the data to be sorted into OL_iAS
        ArrayList<Integer> sortMe =
           new ArrayList<Integer>();
        sortMe.add( 113);
        sortMe.add( 115);
        sortMe.add( 111);
        sortMe.add( 116);
        sortMe.add( 114);
        sortMe.add( 112);
        System.out.println(
            "unordered data: " + sortMe
          + System.lineSeparator());
          
        System.out.println(
            "constructed:  "
          + new OrderedList_inArraySlots( sortMe)
          + System.lineSeparator()
          + "input sorted? " + sortMe
          + System.lineSeparator());
    }
}
