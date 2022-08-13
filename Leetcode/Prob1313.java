//This has more negative likes
/* Brute Force Approach (Own)                           11/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1313 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i=i+2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                res[j]=val;
            }
        }
        for(int i:res){
            System.out.print(i+",");
        }

    }
}
