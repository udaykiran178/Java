class SameClass {
    private int a = 20;
    public int b = 30;
    protected int c = 40;
    int d = 50;

    SameClass() {
        System.out.println("The private variable value from SameClass: " + a);
        System.out.println("The public variable value from SameClass: " + b);
        System.out.println("The protected variable value from SameClass: " + c);
        System.out.println("The Default variable value from SameClass: " + d);
    }
}

//Same Packge Sub class  (Sub class can be acheived using inheritance)
class spsc extends SameClass {
    spsc() {
       // System.out.println("The private variable value from Same Package Sub Class: " + a); // private Modifer can not be accessed from the Same Package Sub class  
        System.out.println("The public variable value from Same Package Sub Class:: " + b);
        System.out.println("The protected variable value from Same Package Sub Class:: " + c);
        System.out.println("The Default variable value from Same Package Sub Class:: " + d);

    }
}

//Same Package non sub class  (Non Sub class can be acheived using object creation)
 class spnsc{
     spnsc(){
        SameClass sn1=new SameClass();
        // private Modifer can not be accessed from the Same Package Sub class  
       // System.out.println("The private variable value from Same Package Non Sub Class: " + sn1.a);  
        System.out.println("The public variable value from Same Package Non Sub Class:: " + sn1.b);
        System.out.println("The protected variable value from Same Package Non Sub Class:: " + sn1.c);
        System.out.println("The Default variable value from Same Package Non Sub Class:: " + sn1.d);

    }
}

public class AccessSpecifierOrModifiers {
    public static void main(String[] args) {
        //SameClass s1 = new SameClass();
       // spsc sp1 = new spsc();
        spnsc spns1=new spnsc();
    }
}
