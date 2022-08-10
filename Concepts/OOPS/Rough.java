/* Brute Force Approach (Own)                           08/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Rough {
    public static void main(String[] args) {
       List<Integer> values = new ArrayList<>();
       values.add(1);
       values.add(89);
       values.add(9);
       values.add(2, 99);
       values.remove(1);
       values.add(8);
       Collections.sort(values);
       System.out.println(values);
        
    }
}
