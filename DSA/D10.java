//Leaders in an array
public class D10 {

    static void leaders(int[] arr){

        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){

                if(arr[i]<=arr[j])
                    break;
            }

            if(j == arr.length)
System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr={16,17,4,3,5,2};
System.out.println("The leaders of the given array are");
        leaders(arr);
    }
    }
