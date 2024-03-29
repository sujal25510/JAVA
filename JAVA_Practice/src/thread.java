class Increment{
    int a;
    void increment(){
        a++;
    }
}


public class thread {
    public static void main(String args[]){
        Increment inc = new Increment();
        Runnable obj1 = () -> {
            for(int i=0;i<100;i++){
                inc.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i=0;i<100;i++){
                inc.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        System.out.println(inc.a);
    }
}
