public class Prob1480 {
    public static void main(String[] args) {
        int nums[]={3,1,2,10,1};
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j>=i;j--){ 
                temp=temp+nums[j];
            }
            System.out.print(temp+" ");
        }
    }
}
