//snake pattern printing
class D43{
    static void print(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0;i<m;i++){
            if(i%2==0){
                for(int j = 0;j<n;j++){
                    System.out.print(matrix[i][j] + " ");

                }
            }

            else{
                for(int j = n-1;j>=0;j--){
                    System.out.print(matrix[i][j] + " ");
                }
            }

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {12,34,56},
            {37,89,65},
            {44,32,88}
        };

        print(matrix);

    }
}