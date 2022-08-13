/* Brute Force Approach                            12/08/2022
 --> Time Complexity : O(n)
 -->  Space complexity : O(n)
*/
public class Prob1720 {
    public static void main(String[] args) {
        int encoded[]={6,2,7,3};
        int arr[]=new int[encoded.length+1];
        arr[0]=4;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        for(int i:arr){
            System.out.print(i+",");
        }

    }
}
