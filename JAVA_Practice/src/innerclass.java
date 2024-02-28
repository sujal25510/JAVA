class A{
    void hello(){
        System.out.println("Hello");
    }
    class B{
        void print(){
            System.out.println("Print");
        }
    }
}

public class innerclass {
    public static void main(String args[]){
        A obj = new A();
        //obj.hello();//output: Hello
//        B obj1 = new B();
//        obj.hello//Give error
        A.B obj1 = obj.new B();
        obj1.print();//give Print
    }
}
