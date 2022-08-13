
/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : O(n)
 -->  Space complexity : O(n)
*/
public class Prob1816 {
    public static void main(String[] args) {
        String s="What is the solution to this problem";
        int k=4;
        String res="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') {
                count++;
            }
            if(count<k)
            res=res+s.charAt(i);
            else
            break;
        }
        System.out.println(res);
        
    }
}
