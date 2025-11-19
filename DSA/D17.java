//Find intersection of two sorted arrays
public class D17 {

    public static void Sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void intersection(int[] arr1 , int[] arr2){

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4,8,6,3,28,26,11};
        int[] arr2 = {1,2,4,6,11,12,8};
        Sort(arr1);
        Sort(arr2);
        System.out.println("The intersetion of two sorted array is ");
        intersection(arr1, arr2);
}
}
