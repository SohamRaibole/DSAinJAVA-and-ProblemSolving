public class XpowerN {
    public static int power(int x,int n){

        if(n==0){
            return 1;
        }

        int px1= power(x, n-1);
        int px=x*px1;
        return px;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
    
}
