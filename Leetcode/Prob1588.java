import java.util.Arrays;

/* Brute Force Approach (Own)                           12/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1588 {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        int subArray[]=Arrays.copyOfRange(arr, 1, 4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<subArray.length;i++){
            System.out.print(subArray[i]+" ");
        }
    }
}
