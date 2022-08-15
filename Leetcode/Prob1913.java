
/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1913 {
    public static void main(String[] args) {
        int nums[]={5,6,2,7,4};
        int res=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                res=(nums[i]*nums[j])-(nums[i+1]*nums[j+1]);
            }
            System.out.println(res);
            if(res>max){
                max=res;
            }
            else{
                continue;
            }
        }
        System.out.println(res);
    }
}
