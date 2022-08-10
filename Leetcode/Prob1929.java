/* Brute Force Approach (Own)
 --> Time Complexity : O(n*n) = O(2n) --> O(n)
 -->  Space complexity : O(n)
*/
//Most of the solutions available online are the same as below answer
public class Prob1929 {
    public static void main(String[] args) {
        int nums[]={1,3,2,1};
        int n=nums.length;
        int ans[]=new int[2*n]; 
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        for(int i:ans){
            System.out.print(i+",");
        }
    }
}
