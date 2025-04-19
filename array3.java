//Linear Search
import java.util.Scanner;
public class array3{
    public static void main(String[] args){
    boolean found = false;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = in.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter value of array:");
    
    for(int i=0;i<arr.length;i++){
        arr[i] = in.nextInt();
    }
    System.out.println();
    System.out.println("enter the element to be found:");
    int target = in.nextInt();

    for(int j=0;j<arr.length;j++){
        if(arr[j]==target)
        {
            System.out.println("target found at index" + j);
            found = true;
        }
    }

    if(!found){
        System.out.println("target not found");
    }
    }

}