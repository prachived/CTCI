public class SetZeros {

    public static void main(String[] args)
    {
        int[][] input = { {3, 5, 0, 4, 2},
                {2, 1, 9, 7, 3},
                {3, 2, 1, 0, 4},
                {8, 5, 0, 4, 8} };
        zeroMatrix(input);
    }
    static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void zeroMatrix(int[][] matrix)
    {
        int rows = matrix[0].length;
        int cols = matrix.length;
        boolean rowHasZero = false;
        boolean colHasZero = false;

        for(int i = 0; i<rows; i++)
        {
            if(matrix[0][i] == 0)
            {
                rowHasZero = true;
                break;
            }
        }

        for(int j = 0; j<cols; j++)
        {
            if(matrix[j][0] == 0)
            {
                colHasZero = true;
                break;
            }
        }

        for (int i = 1; i< cols; i++)
        {
            for (int j = 1; j < rows; j++)
            {
                if (matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1;i< cols;i++)
        {
            if (matrix[i][0] == 0)
                nullifyRow(matrix,i);
        }

        for (int j =1 ;j <rows; j++)
        {
            if (matrix[0][j] == 0)
                nullifyColumn(matrix,j);
        }


        if (rowHasZero) {
            nullifyRow(matrix, 0);
        }

        if (colHasZero) {
            nullifyRow(matrix, 0);
        }
        printMatrix(matrix);
    }

    static void nullifyRow(int[][] matrix, int row)
    {
        for (int j = 0; j < matrix[0].length; j++)
        {
            matrix[row][j] = 0;
        }
    }

    static void nullifyColumn(int[][] matrix, int col)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            matrix[i][col] = 0;
        }
    }

}


