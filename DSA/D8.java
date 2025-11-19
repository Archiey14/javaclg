public class D8 {
    static void sbarray(int[] arr){

        int sum;
        int max=arr[0];
        int a=0;

        for(int i=0;i<(arr.length-2); i++){

            sum=arr[i]+arr[i+1]+arr[i+2];
            if(sum>max){
                max=sum;
                a=i;
            }   
        }         

System.out.println("The sum is: "+ max);
System.out.println("The subarray consists of elements ");
System.out.println(arr[a]+" "+arr[a+1]+" "+arr[a+2]);
    } 
    public static void main(String[] args) {

        int[] arr={2,-7,0,5,6,-3,0,1};
        sbarray(arr);
    }
}
