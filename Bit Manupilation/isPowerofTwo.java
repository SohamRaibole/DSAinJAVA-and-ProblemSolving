import java.util.*;
public class isPowerofTwo {
    public static boolean poweroftwo(int n){
        return( n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(poweroftwo(8));
    }
}
