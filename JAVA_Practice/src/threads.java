class A{
    void show(){
        for(int i=0;i<=10;i++) {
            System.out.println("From A");
        }
    }
}
class B{
    void show(){
        for(int i=0;i<=10;i++) {
            System.out.println("From B");
        }
    }
}

public class threads {
    public static void main(String args[]){
        Runnable obj1 = (){
            for(int i=0;i<=5;i++){
                System.out.println("Executing A");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        Runnable obj2 = (){
            for(int i=0;i<=5;i++){
                System.out.println("From B");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }


//        A obj1 = new A();
//        B obj2 = new B();
//
//        obj1.show();
//        obj2.show();
    }
}
