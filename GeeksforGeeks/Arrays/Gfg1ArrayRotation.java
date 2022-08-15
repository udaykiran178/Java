// //Left Rotation
// public class Gfg1ArrayRotation {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7};
//         System.out.print("Initial Array:  ");
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//         int rotationCount=2;
//         for(int i=0;i<rotationCount;i++){
//             int last=arr[0];
//             for(int j=0;j<arr.length-1;j++){
//                 arr[j]=arr[j+1];
//             }
//             arr[arr.length-1]=last;
//         }
//         System.out.print("\n Rotated Array: ");
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//     }
// }

//Right Rotation
public class Gfg1ArrayRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.print("Initial Array:  ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        int rotationCount=3;
        for(int i=0;i<rotationCount;i++){
            int first=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=first;
        }
        System.out.print("\nRotated Array:  ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

