import java.util.*;
public class SuperKeyword {
     
     String name,city;
     int rollno, pincode;

      SuperKeyword(int r, String c,int p){
         rollno=r;
         city=c;
        pincode=p;

        System.out.println("Rollno is "+rollno+"City is "+c+" pincode is "+p);
      }}
    class child extends SuperKeyword{
        child(int r,String c,int p,String n){
            super(r, c, p);
            name=n;
            System.out.println(" name is "+name);
        }


    }
    class test{
    public static void main(String[] args) {
        SuperKeyword s= new SuperKeyword(55, "AMT", 444607);

        child c= new child(55, "nag", 4444,"sudhir");

        
    }}

