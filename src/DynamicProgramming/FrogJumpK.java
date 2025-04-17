package DynamicProgramming;

public class FrogJumpK {
    public static int solve(int ind, int[] height, int k){
    if(ind == 0) return 0;
    int mmSteps = Integer.MAX_VALUE;

    for(int i = 1; i <= k ; i++){
        if(ind - i >= 0){
            int jump = solve(ind - i, height, k) + Math.abs(height[ind] - height[ind-i]);
            mmSteps = Math.min(mmSteps, jump);
        }
    }
    return mmSteps;
    }
    public static void main(String[] args){
        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int k = 2;
        System.out.println(solve(n-1, height, k));
    }
}
