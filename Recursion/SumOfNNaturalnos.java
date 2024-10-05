public class SumOfNNaturalnos {
    public static int sum(int n){
        int sum=0;
        if (n==1){
            return 1;
        }
        int sum1= sum(n-1);

         sum= n+sum1;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
