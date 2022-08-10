//Related Topics:  Array , String
/* Brute Force Approach (Own)
 --> Time Complexity : O(n * n) = O(n square)
 -->  Space complexity : O(1)
*/

public class Prob2114 {
    public static void main(String[] args) {
        String sentences[] = { "please wait", "continue to fight", "continue to win" };
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int spaceCount = 1;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    spaceCount++;
                }
            }
            if (spaceCount > max) {
                max = spaceCount;
            }
        }
        System.out.println(max);
    }  
}