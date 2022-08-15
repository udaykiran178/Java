import java.util.Scanner;

/* Brute Force Approach (Own)                           08/08/2022
 --> Time Complexity : O(n square)
 -->  Space complexity : 
*/
//Right Rotation
public class GfgRough {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       System.out.print("Inital Array:  ");
       for(int i:arr){
        System.out.print(i+" ");
       }
       int rotationCount=2;
       for(int i=0;i<rotationCount;i++){
             int last=arr[0];
             for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
             }
             arr[arr.length-1]=last;
       }
       System.out.print("\nFinal Array:   ");
       for(int i:arr){
        System.out.print(i+" ");
       }
    }
}

//Left Rotation
