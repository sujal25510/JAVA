class Car{
    void Drive(){
        System.out.println("Drive");
    }

    void Brake(){
        System.out.println("Brake");
    }

    abstract void Speed(){

    }
}

class Ford extends Car{
    void Speed(){
        System.out.println("Speed");
    }
}

public class abstraction {
    public static void main(String args[]){
        Car c1 = new Car();
        c1.Drive();
        c1.Speed();
    }
}

// Abstract class -> An Abstract class can be declared with abstract keyword.
// It can have abstract and non abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods.