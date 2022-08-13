import java.util.Arrays;

/* Brute Force Approach (Own)                           08/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/

public class Rough {
    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808};
        //int max=arr[0];
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(arr[arr.length-1]);
        
    }
}
