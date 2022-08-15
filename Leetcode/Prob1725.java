/* Brute Force Approach (Own)                           13/08/2022
 --> Time Complexity : 
 -->  Space complexity : 
*/
public class Prob1725 {
    public static void main(String[] args) {
        int rectangles[][] = {{5,8},{3,9},{5,12},{16,5}};
        int res[]=new int[rectangles.length];
        int max=0;
        int count=0;
        for(int i=0;i<rectangles.length;i++){
            for(int j=0;j<rectangles[i].length-1;j++){
                if(rectangles[i][j]<rectangles[i][j+1]){
                    res[i]=rectangles[i][j];
                }
                else{
                    res[i]=rectangles[i][j+1];
                }
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>max){
                max=res[i];
            }
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>=max){count++;}
        }
        System.out.println(count);
    }
}
