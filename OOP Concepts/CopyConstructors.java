

class Student{
    String name;
    int rollno;
    int password;
    int []marks= new int[3];
    
    Student(Student S1){
        this.name=S1.name;         // SHALLOW COPY
        this.rollno=S1.rollno;
        this.password=S1.password;
        this.marks=S1.marks;

    }
    
    Student(){
        //unparamiterized cons
        
        System.out.println("Constructor is called");
    }
    
    //parameterized connstructor
    
    }
    public class CopyConstructors {
        public static void main(String[] args) {
            Student S1=new Student();
            S1.name="soham";
            S1.rollno=55;
            S1.password=1234;
            S1.marks[0]=100;
            S1.marks[1]=90;
            S1.marks[2]=80;

            Student S2= new Student(S1);  // COPY CONSTRUCTOR IS CALLED 
            S2.password=4567;    
            System.out.println(S2.password);          // HERE PASS IS CHANGED 
                                    
            S1.marks[2]=100;               //HERE MARKS IS CHANGED

            for (int i=0;i<S2.marks.length;i++){
                System.out.println(S2.marks[i]);
            }
        }
        
    }
    