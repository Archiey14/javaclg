// Check if array is sorted and rotated
public class D9 {
    static boolean sortedrotated(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }
        
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        return (count <= 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        if (sortedrotated(arr)) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is not sorted and rotated.");
        }
    }
}
