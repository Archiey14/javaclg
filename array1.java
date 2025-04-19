/*public class array1{
./    int[] arr={1,2,3,4,5,6};
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
    System.out.println("enter size of array");
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

  /*
  Maximum element of array
  System.out.println();
    int max=0;
    
    for(int k=0;k<arr.length;k++){
       if (arr[k]>max)
       max = arr[k];
       if(max>max2)
    }
    System.out.println(max);    */


//Sum of All Elements of Array
    int sum=0;
    
     for(int r = 0;r<arr.length;r++){
        
        sum = sum +arr[r];

        }
        System.out.println(sum);
     }
    }
    