/* Brute Force Approach (Own)                           11/08/2022
 --> Time Complexity : O(n square)
 -->  Space complexity : O(n)
*/
public class Prob1365 {
    public static void main(String[] args) {
        int nums[]={6,5,4,8};
        int res[]=new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                res[i]=count;
            }
        }
        for(int i:res){
            System.out.print(i+",");
        }
    }
}
