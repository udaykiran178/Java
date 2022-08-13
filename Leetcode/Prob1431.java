// /* Brute Force Approach (Own)                           11/08/2022
//  --> Time Complexity : O(n+n)--> O(n)
//  -->  Space complexity : O(n)
// */
// public class Prob1431{
//     public static void main(String[] args) {
//         int candies[]={2,3,5,1,3};
//         int extraCandies =3;
//         int maxCandies=candies[0];
//         for(int i=0;i<candies.length;i++){
//             if(candies[i]>maxCandies){
//                 maxCandies=candies[i];
//             }
//         }
//         for(int i=0;i<candies.length;i++){
//             candies[i]=candies[i]+extraCandies;
//             if(candies[i]>=maxCandies){
//                 System.out.print(true+",");
//             }
//             else
//             System.out.print(false+",");
//         }
//     }
// }

/* Approach 2                         11/08/2022
 --> Time Complexity : O(n square)
 -->  Space complexity : O(n)
*/
public class Prob1431{
    public static void main(String[] args) {
        int candies[]={2,3,5,1,3};
        int extraCandies =3;
        boolean res[]=new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            candies[i]=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(candies[i]>=candies[j]){
                    res[i]=true;
                    break;
                }
                else {
                    res[i]=false;
                    break;
                }   
            }
        }
        for(boolean i:res){
            System.out.print(i+",");
        }
    }
}