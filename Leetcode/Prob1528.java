
/* Brute Force Approach (Own)                           11/08/2022
 --> Time Complexity : O(n)
 -->  Space complexity : O(n)
*/
public class Prob1528 {
    public static void main(String[] args) {
        String s="codeleet";
        int indices[]={4,5,6,7,0,2,1,3};
        char res[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            res[indices[i]]=s.charAt(i);
        }
        for(char i:res){
            System.out.print(i);
        }
        
    }
}
