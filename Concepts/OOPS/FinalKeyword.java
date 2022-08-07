
class A{
    final void show(){ //if we use final key word for method it can not be override in sub classes
        System.out.println("This method is from Super class A");
    }
}

class B extends A{
    // void show(){
    //     System.out.println("this method is from sub class B");
    // }
    
}

 final class C{
    void show(){
        System.out.println("This Show method is from Super class C");
    }
}
//asjdhjaksd
// class D extends C{  //When we use final keyword before super class then it can not be inherited

// }
public class FinalKeyword {
    public static void main(String[] args) {
        final int a = 60; // if we use final key word for variable it will become constat it can be changed again
        System.out.println("The value of a is: " + a);
        B b1=new B();
        b1.show();
       
    }
}
