class Student{
    String name;
    int rollno;
    int password;
    int []marks= new int[3];
    
    Student(Student S1){
                                      // DEEP COPY 
        this.name=S1.name;         
        this.rollno=S1.rollno;       
        this.password=S1.password;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=S1.marks[i];    //NO CHANGES HERE IN ARRAY 
        }
        

    }
    
    Student(){
        //unparamiterized cons
        
        System.out.println("Constructor is called");
    }
    
    
    
    }
    public class DeepCopy {
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
            
            S1.marks[2]=100;               //HERE MARKS IS CHANGED BUT NO EFFET IN DEEP COPY

            for (int i=0;i<S2.marks.length;i++){
                System.out.println(S2.marks[i]);
            }
        }
        
    }