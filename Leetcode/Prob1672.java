import java.util.Arrays;

/* Brute Force Approach (Own)
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1672 {
    public static void main(String[] args) {
        int accounts[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth + accounts[i][j];
            }

            if (wealth > max) {
                max = wealth;
            }

        }
        System.out.println(max);

    }

}
