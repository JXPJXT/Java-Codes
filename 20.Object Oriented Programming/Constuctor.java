public class Constuctor{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("JAPJOT");
    }
}

class Student{
    String name;
    int roll;
    Student(String name){
        this.name = name;
    }
    Student(){
        System.out.println("Constructor is called");
    }
}