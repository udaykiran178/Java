public class Prob2011 {
    public static void main(String[] args) {
        int temp=0;
        String arr1[]={"X++","++X","--X","X--"};
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]=="++X" || arr1[i]=="X++"){
                temp++;
            }
            else{
                temp--;
            }
        }
        System.out.println(temp);
    }
}
