package Recursion;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {6,1, 3, 4, 5, 2};
    System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int ind){
        if(ind == arr.length - 1) return true;
        return arr[ind] < arr[ind+1] && isSorted(arr, ind + 1);
    }
}
