public class Prob1929 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 1 };
        int ans[] = new int[nums.length * 2];
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+",");
       }
    }
}
