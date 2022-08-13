
/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : O(n square)
 -->  Space complexity : O(1)
*/
public class Prob2006 {
    public static void main(String[] args) {
        int nums[]={1,3};
        int k=3;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
