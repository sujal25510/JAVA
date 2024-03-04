interface class Food{
    void eat();
}
class Nonveg implements Food{
    void eat(){
        System.out.println("Non veg food");
    }
}
class Veg implements Food{
    void eat(){
        System.out.println("Veg food");
    }
}


class Icecreams implements Food{
    void eat(){
        System.out.println("Eating ice cream");
    }
}
class Dog{
    void eating Food item(){
        item.eat();
    }
}




interface Flyable {
    void fly_obj();
}


class Spacecraft implements Flyable {

    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}


class Airplane implements Flyable {

    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}


class Helicopter implements Flyable {

    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}


public class FlyableTest {
    public static void main(String[] args) {

        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();


        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}






public class Interface {
    public static void main(String args[]){
        Dog d1 = new Dog();
        Veg v1 = new Veg();
        Nonveg n1 = new Nonveg();

    }
}
