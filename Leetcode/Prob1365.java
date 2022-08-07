public class Prob1365 {
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        int res[]=new int[nums.length];
        int temp[]=new int[101];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        //running sum
        for(int i=1;i<101;i++){
            temp[i]+=temp[i-1];
        }
        //storing ans
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
                res[i]=temp[nums[i]-1];
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
