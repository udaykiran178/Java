// package Strivers.Arrays;
public class SetMatrixZeros {
    public static void main(String[] args) {
        
        int arr1[][]={{1,1,1},{1,0,1},{1,1,1}};
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr1[i][j]==0){
                for(int k=i;k<j;k++){
                    arr1[i][j]=0;
                }
            }
            System.out.print(arr1[i][j]+ "  ");
        }
        System.out.println();
    }
    }
    
}
