
/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1684 {
    public static void main(String[] args) {
        String allowed="ab";
        String words[]={"ad","bd","aaab","baa","badab"};
        int consistent=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<2;j++){
                if(words[i].contains(allowed)){
                    consistent++;
                }
            }
            
        }
        System.out.println(consistent);
    }
}
