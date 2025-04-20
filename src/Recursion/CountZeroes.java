package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int n = 3020400;
        System.out.println(solve(n, 0));
    }
    static int solve(int n, int count){
        if (n == 0) return count;
        int rem = n%10;
        if(rem == 0){
            count++;
            return solve(n/10, count);
        }
        return solve(n/10, count);
    }
}
