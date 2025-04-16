//leap year checker
//divisible by 5 and 11
public class basic9{
    public static void main(String[] args){
    int x=2024;
    if((x%4==0 && x%10!=0)||(x%400==0)){
        System.out.println("leap year");
    }
    else{
        System.out.println("not a leap year");
    }
}
}