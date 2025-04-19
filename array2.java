//Count Even and Odd Numbers

import java.util.Scanner;
   public class array2{
    public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = in.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter value of arr");
    
    for(int i=0;i<n;i++){
       arr[i] = in.nextInt();
    }
    System.out.println();
    for(int k=0;k<arr.length;k++){
       System.out.println(arr[k]);
    }


    System.out.println();

    int odd = 0;
    int even = 0;

    for(int p=0;p<arr.length;p++){
        if(arr[p]%2==0)
        even++;
        else
        odd++;
    }

    System.out.println("even numbers are" + even);
    System.out.println("even numbers are" + odd);
    }
   }