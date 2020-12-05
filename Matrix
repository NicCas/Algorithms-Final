public class Matrix {

    static int findSumMatrix (int[][] matrix)
    {
        int maxSum = -1, minSum = Integer.MIN_VALUE, localSum;
        int negRow = 0, negCol = 0, thisCol;
        int rowS = 0, rowE = 0;
        int colS = 0, colE = 0;
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int sumMatrix[][] = new int[rowSize + 1][colSize];

        for (int i = 0; i < rowSize; i++)
            for (int j = 0; j < colSize; j++)
                sumMatrix[i + 1][j] = sumMatrix[i][j] + matrix[i][j];

        for (int i = 0; i < rowSize; i++)
        {
            for (int row = i; row < rowSize; row++)
            {
                localSum = 0;
                thisCol = 0;

                for (int col = 0; col < colSize; col++)
                {
                    localSum += sumMatrix[row + 1][col] - sumMatrix[i][col];

                    if (localSum < 0)
                    {
                        if (minSum < localSum)
                        {
                            minSum = localSum;
                            negRow = row;
                            negCol = col;
                        }
                        localSum = 0;
                        thisCol = col + 1;

                    } else if (maxSum < localSum) {
                        maxSum = localSum;
                        rowS = i;
                        rowE = row;
                        colS = thisCol;
                        colE = col;
                    }
                }
            }
        }

        if (maxSum == -1)
            System.out.println("[ " + matrix[negRow][negCol] + "]");
        else {
            for (int i = rowS; i <= rowE; i++)
            {
                System.out.print("[ ");

                for (int j = colS; j < colE; j++)
                    System.out.print(matrix[i][j] + " ");

                System.out.println("]");
            }
        }

        return maxSum == -1 ? minSum : maxSum;
    }
}
