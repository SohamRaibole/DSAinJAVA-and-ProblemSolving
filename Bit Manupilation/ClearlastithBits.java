

public class ClearlastithBits {
    public static int cleari(int n, int i){
        int bitmask=-1<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(cleari(15, 2));
    }
}
