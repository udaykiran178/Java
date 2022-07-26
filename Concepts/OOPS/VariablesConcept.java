/* 
 * We have three types of variables
    1.Local Variable 
    2.Instance Variable
    3.Static Variable
 */


public class VariablesConcept {
    static int m=100; //Static variable
    int n=790; //instance variable
    void method(){
        int n=90;//local variable
        System.out.println("The local variable value is: "+n);
    }
    public static void main(String[] args) {
        System.out.println("Static variable value: "+m);
        VariablesConcept v1=new VariablesConcept();
        System.out.println("Instance variable value: "+v1.n);
        v1.method();

        
    }
    
}

