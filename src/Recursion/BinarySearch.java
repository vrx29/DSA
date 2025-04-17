package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {

        if (start > end) return -1;
        int mid = (start + end) / 2;

        if (arr[mid] == target) return mid;

        if (target < arr[mid]) return search(arr, target, start, mid - 1);
        return search(arr, target, mid + 1, end);
    }
}
