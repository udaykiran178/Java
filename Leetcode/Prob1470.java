/* Brute Force Approach (Own)
 --> Time Complexity : O(n)
 -->  Space complexity : O(n)
*/
public class Prob1470 {
    public static void main(String[] args) {
        int nums[] = { 1,2,3,4,4,3,2,1 };
        int n = 4;
        int j=0;
        int res[]=new int[2*n];
        for(int i=0;i<nums.length;i=i+2){
                res[i]=nums[j];
                res[i+1]=nums[j+n];
                j++;
           
        }
       for(int i=0;i<res.length;i++){
        System.out.print(res[i]+",");
       }
    }
}
