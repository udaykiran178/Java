// /* Brute Force Approach (Own)
//  --> Time Complexity : O(n)
//  -->  Space complexity : O(1)
// */
public class Prob2011 {
    public static void main(String[] args) {
        int x=0;
        int res=0;
        String operations[]={"X++","++X","--X","X--"};
        for(int i=0;i<operations.length;i++){
            if(operations[i].charAt(1)=='+')  res++; //operations[i]=="++X" || operations[i]=="X++"
            
            else res--;
            
        }
        System.out.println(res);
    }
}
