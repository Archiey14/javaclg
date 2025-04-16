/*public class array1{
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6};
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    }
    }
    */
import java.util.Scanner;
   public class array1{
    public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    System.out.println("ener size of array");
    int n = in.nextInt();
    int[] arr= new int[n];
    System.out.println("enter value of arr");
    
    for(int i=0;i<n;i++){
       arr[i] = in.nextInt();
    }
    System.out.println();
    for(int k=0;k<arr.length;k++){
       System.out.println(arr[k]);
    }


    System.out.println();
    for(int j=arr.length-1;j>=0;j--){
         System.out.println(arr[j]);
    }

  /*System.out.println();
    int max=0;
    
    for(int k=0;k<arr.length;k++){
       if (arr[k]>max)
       max = arr[k];
       if(max>max2)
    }
    System.out.println(max);    */

    int sum=0;
    int target = 5;
     for(int r = 0;r<arr.length;r++){
        for(int s = 1;s<arr.length;s++){
        sum = sum + arr[r];
        if((arr[r]+arr[s])==5){
            System.out.println(arr[r]);
            System.out.println(arr[s]);


        }
     }
    }
    }
   }