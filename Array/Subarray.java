import java.util.*;

class Subarray {

    private static int x;
    public static void Printsub(int numbers[]){

        for(int i=0; i<numbers.length;i++){
            int start=i;
            for(int j=i+1; j<numbers.length;j++){
                int end=j;
                for(int x=start ;x<=end ;x++){
                
                System.out.print(numbers[x]+" ");
            }
            System.out.println();
        }
    
       System.out.println();

    }}
    public static void main(String[] args) {
        int numbers[]={2,4,6,8};
     Printsub(numbers);
    }
}
