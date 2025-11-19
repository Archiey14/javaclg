//Print diagonals of a matrix
class D42{
    static void principaldiagonal(int matrix[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(matrix[i][j]+",");
                }
            }
            
        }
        System.out.println();

    }

    static void secondarydiagonal(int matrix[][],int n){
     for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)==n-1){
                    System.out.print(matrix[i][n-i-1]+",");
                }
            }
            
        }
        System.out.println();   
    }

    public static void main(String[] args) {
        int n =4;
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};

        principaldiagonal(matrix, n); 
        secondarydiagonal(matrix, n); 
    }
}