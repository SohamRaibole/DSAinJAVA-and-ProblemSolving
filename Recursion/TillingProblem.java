public class TillingProblem {   // floor size is 2*n

    public static int Tilling(int n){
        if(n==0 || n==1){              
            return 1;
        }

        // verticle
        int verticle=Tilling(n-1);

        // horizontal
        int horizontal=Tilling(n-2);

        int totWays=verticle+ horizontal;

        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(Tilling(4));
        System.out.println(Tilling(3));
    }
}