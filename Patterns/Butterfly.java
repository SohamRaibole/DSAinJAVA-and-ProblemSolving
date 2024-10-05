public class Butterfly {

    public static void butterfly_pattern(int n){
    
     for (int i=1 ;i<=n;i++){

        for (int j=1;j<=i;j++){        //stars
            System.out.print("*");
        }
       for(int j=1;j<=(n-i)*2;j++){
        System.out.print(" ");        //spaces 
       }
       for (int j=1;j<=i;j++){
        System.out.print("*");     //star
       }
System.out.println();
}
         for (int i=n;i>=1;i--){     //just invert outer row other as it is 

    for (int j=1;j<=i;j++){         
        System.out.print("*");
    }
        for(int j=1;j<=(n-i)*2;j++){
    System.out.print(" ");
   }
        for (int j=1;j<=i;j++){
    System.out.print("*");
   }
System.out.println();
}
 }

public static void main(String[] args) {
    butterfly_pattern(4);
}


    
}
