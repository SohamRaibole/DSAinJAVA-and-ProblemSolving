public class FibonacciNoN {
    public static int fib(int n){

        if(n==0 || n==1){
            return n;
        }
        int fbn1=fib(n-1);
        int fbn2=fib(n-2);
        int fbn=fbn1+fbn2;

        return fbn;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
