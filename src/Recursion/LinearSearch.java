package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9, 2};
        System.out.println(Search(arr, 18, 0));
        System.out.println(SearchIndex(arr, 2, 0));
        System.out.println(SearchIndexLast(arr, 2, arr.length - 1));

        System.out.println(SearchIndexAll(arr, 2, 0, new ArrayList<>()));
    }

    static boolean Search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr, target, index + 1);
    }
    static int SearchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return SearchIndex(arr, target, index + 1);
    }
    static int SearchIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return  -1;
        }
        if(arr[index] == target){
            return index;
        }
        return SearchIndexLast(arr, target, index - 1);
    }


    static ArrayList<Integer> SearchIndexAll(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return SearchIndexAll(arr, target, index + 1, list);
    }

    // Array list inside function and not to be passed as parameter

    static ArrayList<Integer> SearchIndexAll2(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return SearchIndexAll2(arr, target, index + 1, list);
    }


}
