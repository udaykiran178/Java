/* Brute Force Approach (Own)                           13/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob2176 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int k=1;
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && (i * j) % k==0){
                    res++;
                }
                else continue;
            }
        }
        System.out.println(res);
        
    }
}
