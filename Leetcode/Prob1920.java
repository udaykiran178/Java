public class Prob1920 {
    public static void main(String[] args) {
        int nums[]={5,0,1,2,3,4};
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+",");
        }
    }
}
