import java.util.*;
public class ConvertToString {
   static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void String(int num){

        if(num==0){
            return;
        }
        int lastDigit=num%10;  // return last digit 
        String(num/10);        //convert value less than one place
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int num=1234;
        String(num);

    }
}
