public class spiralmatirx {

    public static void printspiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){// it can be used for the all odds and even matrix
            // i for the row and j for the col

            //top -- here startRow is fixed startRow to endCol
            for(int j=startRow;j<=endCol;j++){
                System.out.println(matrix[startRow][j]+" ");
            }
            //right -- here endCol is fixed startRow+1 to endRow
            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(matrix[i][endCol]+" ");
            }
            //bottom -- here endRow is fixed endCol-1 to starCol
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol == endCol){
                    break;
                }
                System.out.println(matrix[endRow][j]+" ");
            }
            //left-- here starCol is fixed endRow-1 to startRow+1
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.println(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;

        } System.out.println();


    }

    public static void main(String args[])
    {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9,10,11,12},
                          {13,14,15,16}};

        printspiral(matrix);
    }



}