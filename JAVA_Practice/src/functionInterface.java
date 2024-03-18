interface A{
    int x = 5;

    void print(int i);
}

class B implements A{
    public void display(){
        System.out.println("From B");
    }
}
public class functionInterface {
    public static void main(String args[]){
        A obj = new A() {
            public void display() {
                System.out.println("From print " + i);
            }
        };
    }
}
