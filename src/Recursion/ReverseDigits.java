package Recursion;

public class ReverseDigits {
    static int sum =0;
    static void revese1(int n){
        if(n == 0) return;
        int rem = n%10;
         sum = sum*10 + rem;
        revese1(n/10);
    }
    static int revese2(int n, int l){
        if(n%10 == n) return n;
        return (((n%10) * (int)Math.pow(10, l-1)) + revese2(n/10, l - 1));
    }
    public static void main(String[] args) {
        int n = 1482;
        int l = (int)(Math.log10(n)) + 1;
        revese1(n);
        int ans = revese2(n, l);
        System.out.println(ans);
    }

}
