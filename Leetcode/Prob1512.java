// /* Brute Force Approach (Own)
//  --> Time Complexity : O(n*n = n square)
//  -->  Space complexity : O(1)
// */
// public class Prob1512 {
//     public static void main(String[] args) {
//         int nums[]={1,2,3,1,1,3};
//         int count=0;
//         for(int i=0;i<nums.length;i++){ 
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j] && i<j){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

/* Approach 2
Taking temporary array with given range 1 <= nums[i] <= 100
    --> Time Complexity : O(n)
    --> Space Complexity : O(1)
*/
public class Prob1512{
    public static void main(String[] args) {
        int nums[]={1,1,1,1};
        int temp[]=new int[101];
        int count=0;
        for(int i:nums)
            count+=temp[i]++;
        System.out.println(count);
    }
}
