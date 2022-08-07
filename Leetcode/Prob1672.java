public class Prob1672 {
    public static void main(String[] args) {
       int accounts[][]={{1,5},{7,3},{3,5}};
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<accounts.length;i++){
        int sum=0;
        for(int j=0;j<accounts[i].length;j++){
            sum+=accounts[i][j];
        }
        maxi=Math.max(maxi, sum);
       }
       System.out.println(maxi);

       
        
    }
    
}
