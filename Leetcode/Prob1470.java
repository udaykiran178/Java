public class Prob1470 {
    public static void main(String[] args) {
        int n=3;
        int j=0;
       int nums[]={2,5,1,3,4,7};
       int ans[]=new int[2*n];
       for(int i=0;i<ans.length;i=i+2){
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
       }
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
       }
    }
}
