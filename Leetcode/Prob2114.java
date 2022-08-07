//Related Topics:  Array , String


public class Prob2114 {
   public static void main(String[] args) {
    String sentences[]={"please wait", "continue to fight", "continue to win"};
    int max=0;
    for(String s:sentences){
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        max=Math.max(max, count);
    }
    System.out.println(max);

   }
    
}