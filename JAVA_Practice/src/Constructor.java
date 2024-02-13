class Person{
    public String name;
    public int age;
    public int mob;

    public Person(){
        System.out.println("from constructor");
        //name = "Sujal";
        age = 11;
        mob = 1234;
    }

    public Person(String name,int age,int mob){
        this.name = name;
        this.age = age;
        this.mob = mob;
    }

    public void output(){
        System.out.println("Name : "+name+"Age : "+age+"Mob : "+mob);
    }
}



public class Constructor {
    public static void main(String args[]){
        //Person p1 = new Person("Madhvan",34,2345);
        Person p2 = new Person();
//        Person p3 = new Person();
      //  System.out.println(p1.name);

    }


}



/*
-A constructor is a block of code similar to class .
-It is called when an instance of a class is created.
-Every time an object is created using the new keyword, at least one constructor is called.
-Java compiler provides a default constructor by default, this constructor is there if no constructor available in class.

RULES-
-Constructor name must be same as its class
-Constructor should have no return type.
 */
