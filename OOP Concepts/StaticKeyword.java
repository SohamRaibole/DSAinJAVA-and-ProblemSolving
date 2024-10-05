public class StaticKeyword {

    public static void main(String[] args) {
        Student s1= new Student();
        s1.setroll(14);
        s1.getroll();
        s1.schoolnaame="Montfort";
        System.out.println(s1.schoolnaame);
        s1.percentage(1,2,3);          //static function

        Student s2 =new Student();            //for static keyword it is set once and used for all
        System.out.println(s2.schoolnaame);
        s2.percentage(6,7, 8);
    }
    
}
class Student{
    int rollno;
    String name;

    static String schoolnaame;

    void setroll(int rollno){
        this.rollno=rollno;
        
    }
    int getroll(){
        return this.rollno;
    }

    static void  percentage(int a,int b, int c){
        System.out.println((a+b+c)/3);
    }

}