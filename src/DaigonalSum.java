public class DaigonalSum {
    public static int daigonalSum(int matrix[][]) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                } else if(i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;

    }
    public static void main(String args[]) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(daigonalSum(matrix));
    }
}

//public static int diagonalSum(int matrix[][]) {
//    int sum = 0;
//    int n = matrix.length;
//
//    for(int i = 0; i < n; i++) {
//        // Primary diagonal
//        sum += matrix[i][i];
//
//        // Secondary diagonal, avoid double counting center element
//        if(i != n - 1 - i) {
//            sum += matrix[i][n - 1 - i];
//        }
//    }
//    return sum; // O(n) complexity..
//o(n2) time complexity
//i+j = n-1 for sd j = n-1-i for the overallping val for that only this cond of the !n-1-i