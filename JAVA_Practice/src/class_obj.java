public class class_obj {
    public static void main(String args[]){
        int num1 = 5;
        int num2 = 10;
        int numx = 15;

        double num3 = 5.1;
        double num4 = 10.3;
        //System.out.println(num1+num2);
//        Calculate obj1 = new Calculate();
//        int output = obj1.add();
//        System.out.println(output);


        Calculate obj2 = new Calculate();

       // double output = obj2.add(num3,num4);
        double output = obj2.add(num3,num4);
        System.out.println(output);







    }
}


//class Calculate{
//    public int add(){
//        System.out.println("from add");
//        return 0;
//    }
//}



//class Calculate{
//    public int add(int a,int b,int c){
//        return a+b+c;
//    }
//
//    public double add(double a,double b){
//        return a+b;
//    }
//}


class Calculate{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}