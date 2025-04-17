package hashing;

public class CountFreq{
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n){
        boolean visited[] = new boolean[n];
        int minFreq = n, maxFreq = 0;
        int minEle = 0, maxEle = 0;

        for (int i = 0; i < n; i++){


            if(visited[i]){
                continue;
            }

            int count = 1;
            for(int j = i+ 1; j<n; j++){
                if(arr[i]==arr[j]){
                    visited[i] = true;
                    count++;
                }
            }
            if(count > maxFreq){
                maxFreq = count;
                maxEle = arr[i];
            }
            if(count < minFreq){
                minFreq = count;
                minEle = arr[i];
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
}
