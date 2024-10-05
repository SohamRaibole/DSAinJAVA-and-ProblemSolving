class Student{
String name;
int rollno;

Student(){
    //unparamiterized cons
    System.out.println("Constructor is called");
}

//parameterized connstructor
Student(String name){
    this.name=name;
    System.out.println(name);
}
Student(int rollno){
    this.rollno=rollno;
    System.out.println(rollno);
}
}
public class Constructors {
    public static void main(String[] args) {
        Student S1=new Student();
        Student S2=new Student("Soham Raibole");
        Student S3=new Student(55);
    }
    
}
