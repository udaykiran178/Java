import java.util.Arrays;

/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1588 {
    public static void main(String[] args) {
        int arr[]={10,11,12};
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum=sum+(((i+1)*(arr.length-i)+1)/2)*arr[i];
        }
        System.out.println(sum);
    }
}
