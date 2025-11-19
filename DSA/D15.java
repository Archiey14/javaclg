//Missing number in array [1 to n]
public class D15 {

    static int missing(int[] arr){
        int n = arr[arr.length - 1];
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int d=s-sum;
        return d;
}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        System.out.println("Array :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The missing no is "+ missing(arr));
    }
}
