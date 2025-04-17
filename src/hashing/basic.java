package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class basic {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int freq = 0;
            if(map.containsKey(arr[i])){
                freq = map.get(arr[i]);
            }
            freq++;
            map.put(arr[i], freq);
        }

        int q;
        q = scn.nextInt();
        while (q-- > 0) {
            int number;
            number = scn.nextInt();
            // fetch:
            if (map.containsKey(number)) System.out.println(map.get(number));
            else System.out.println(0);
        }
    }
}
