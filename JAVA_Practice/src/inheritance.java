class Animal{
    public void eat(){
        System.out.println("I can eat");
    }
}



class Dog extends Animal{
    public void bark(){
        System.out.println("I can bark");
    }
}

class inheritance {
    public static void  main(String args[]){
        Dog d1 = new Dog();
        Animal a1 = new Animal;
        d1.eat();
    }
}
