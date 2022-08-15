/* Brute Force Approach (Own)                           13/08/2022
 --> Time Complexity : O(n)
 -->  Space complexity : O(1)
*/
public class Prob1732 {
    public static void main(String[] args) {
        int gain[]={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int altitudes[]=new int[gain.length+1];
        altitudes[0]=0;
        int highest=0;
        for(int i=0;i<altitudes.length-1;i++){
            altitudes[i+1]=gain[i]+altitudes[i];
            if(altitudes[i+1]>highest){
                highest=altitudes[i+1];
            }
        }
       
        System.out.print(highest);
    }
}
