/* Brute Force Approach (Own)                           13/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1863 {
    public static void main(String[] args) {
        int nums[]={5,1,6};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                sum=sum+nums[i]^nums[j];   
            }
        }
        System.out.println(sum);
    }
}
