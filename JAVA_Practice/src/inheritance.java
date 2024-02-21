//class Animal{
//    public void eat(){
//        System.out.println("I can eat");
//    }
//}
//
//
//
//class Dog extends Animal{
//    public void bark(){
//        System.out.println("I can bark");
//    }
//}
//
//class Babydog extends Dog{
//    public void cry(){
//        System.out.println("I can cry");
//    }
//}
//
//class Tiger xtends Animal{
//    public void roar(){
//        System.out.println("I can roar");
//    }
//}

class A{
    public A() {
        super();
        System.out.println("from A");
    }
    public A(int n1,int n2){
        super();
        System.out.println("From A  int");
    }
}
class B extends A{
    public B() {
        super();
        System.out.println("from B");
    }
    public B(int n){
        super(2,2);
        System.out.println("From B  int");
        }

}

class inheritance {
    public static void  main(String args[]){
//        Babydog d2 = new Babydog();
//        Dog d1 = new Dog();
//        Animal a1 = new Animal();
 //       d1.eat();
       // Tiger t1 = new Tiger();
        B c1 = new B();
        c1.print();

    }
}
