import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Brute Force Approach                          12/08/2022
 --> Time Complexity : O(n)
 -->  Space complexity : O(1)
*/
public class Prob1773 {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<List<String>>();
        List<String> num1 = Arrays.asList(new String[] {"phone","blue","pixel"});
        List<String> num2 = Arrays.asList(new String[] {"computer","silver","phone"});
        List<String> num3 = Arrays.asList(new String[] {"phone","gold","iphone"});
        lists.add(num1);
        lists.add(num2);
        lists.add(num3);
        int res=0;
        String ruleKey = "type";
        String ruleValue = "phone";
        //type 
        if(ruleKey.equals("type")){
            for(int i=0;i<lists.size();i++){
                if(lists.get(i).get(0).equals(ruleValue)){
                    res++;
                }
            }
        }
        //color
        else if(ruleKey.equals("color")){
            for(int i=0;i<lists.size();i++){
                if(lists.get(i).get(1).equals(ruleValue)){
                    res++;
                }
            }
        }
        //name
        else{
            for(int i=0;i<lists.size();i++){
                if(lists.get(i).get(2).equals(ruleValue)){
                    res++;
                }
            }
        }

        System.out.println(res);
        }
        
    }
