//kthmaxmin
public class D3 {

    public static void BubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int KthMin(int[] arr, int k) {
        BubbleSort(arr);
        return arr[k - 1]; // kth minimum is at index k-1
    }

    public static int KthMax(int[] arr, int k) {
        BubbleSort(arr);
        return arr[arr.length - k]; // kth maximum is at index length-k
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 3, 56, 76, 23, 6, 2, 1};
        int k = 4;

        System.out.println("The " + k + "th minimum element is " + KthMin(arr.clone(), k));
        System.out.println("The " + k + "th maximum element is " + KthMax(arr.clone(), k));
    }
}
