/* Brute Force Approach (Own)                           13/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1464 {
    public static void main(String[] args) {
        int nums[]={1,5,4,5};
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j){
                    max=Math.max((nums[i]-1)*(nums[j]-1),max);
                }
                
            }
        }
        System.out.println(max);

    }
}
