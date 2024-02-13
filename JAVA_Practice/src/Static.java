class Student{
    public String studentName;
    public int rollno;
    public static String uniName;

    public void output(){
        System.out.println(studentName + " " + rollno + " " + uniName);
    }

    public static void myStaticMethod(){
        System.out.println("From static method " + uniName);
    }
}




public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
      //  s1.studentName = "kartik";
        s1.rollno = 1;
      //  Student.uniName = "LPU";
        s1.output();
        s1.myStaticMethod();

        Student s2 = new Student();
       // s2.studentName = "Tanishk";
        s2.rollno =2;
       // Student.uniName = "LPU";
        s2.output();

    }
}



//Difference in instance var and static var

// -Instance variable are declared in a class but outside a method
// -Class/static variable are declared with a static keyword in a class but outside a method

// -Instance variable are created when an object is created with the use of "new" keyword and they get destroyed when the object is destroyed
// -Static Variable are created when the program starts and destroyed when the program stops

// -Instance Variable can be accessed directly by calling