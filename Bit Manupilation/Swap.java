

public class Swap {
    public static void main(String[] args) {
        int x=3,y=4;

        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swap x="+x+" and y="+y);
    }
    
}
