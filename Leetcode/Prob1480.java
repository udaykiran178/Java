// /* Brute Force Approach (Own)
//  --> Time Complexity : O(n)
//  -->  Space complexity : O(n)
// */
// public class Prob1480 {
//     public static void main(String[] args) {
//         int nums[]={1,1,1,1,1};
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum=nums[i]+sum;
//             System.out.print(sum+",");
//         }
//     }
// }

/*
 * Approach 2
    --> Time Complexity : O(n)
    -->  Space complexity : O(1)
 */
public class Prob1480{
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];   
        }
        for(int i:nums){
            System.out.print(i+",");
        }
    }
}
