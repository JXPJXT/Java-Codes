public class StaticKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "JANKIDEVI";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName); 

        Student s3 = new Student();
        s3.schoolName = "LPU";
        System.out.println(s3.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Student{
    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
    
    String name;
    int roll;

    static String schoolName;
    
    void setName(String name){
        this.name = name;
    }
    String getName(String name){
        return this.name;
    }
}