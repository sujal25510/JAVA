class Student{
    public String studentName;
    public int rollno;
    public static String uniName;

    public void output(){
        System.out.println(studentName + " " + rollno + " " + uniName);
    }
}




public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.studentName = "kartik";
        s1.rollno = 1;
        Student.uniName = "LPU";
        s1.output();

        Student s2 = new Student();
        s2.studentName = "Tanishk";
        s2.rollno =2;
        Student.uniName = "LPU";
        s2.output();

    }
}
