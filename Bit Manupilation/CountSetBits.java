public class CountSetBits {
    public static int CountSetBits(int n){
        int count=0;
        while(n>0){
            if ((n&1)!=0){   // CHECKING 0 OR NOT// (LSB)
                count++;
            }
           n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountSetBits(15));
        System.out.println(CountSetBits(3));
    }
    
}
