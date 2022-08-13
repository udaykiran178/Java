
/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : O(n)
 -->  Space complexity : O(1)
*/
public class Prob1662 {
    public static void main(String[] args) {
        String word1[]={"abc", "d", "defg"};
        String word2[]={"abcddefg"};
        String test1="";
        String test2="";
        for(int i=0;i<word1.length;i++){
            test1=test1+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            test2=test2+word2[i];
        }
        if(test1.equals(test2)){
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
