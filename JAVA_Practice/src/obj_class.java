class Phone{
    String model;
    int price;

//    public String toString(){
//        return "Hello";
//    }
}


public class obj_class {

    public static void main(String args[]){
        Phone obj = new Phone();
        obj.model = "iphone";
        obj.price = 100;

        Phone obj1 = new Phone();
        obj1.model = "samsung";
        obj1.price = 50;

        boolean check = obj.equals(obj1);

//        System.out.println(obj.toString());
//        System.out.println(obj1.toString());
//


    }
}
