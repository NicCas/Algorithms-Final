import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- Question 2 ----------");
        int [] a = {2, -8, 3, -2, 4, -10};
        System.out.println("Sum: " + questionTwo(a));

        System.out.println();
        System.out.println("---------- Question 3 ----------");
    }

    public static int questionTwo(int[] array)
    {
        int tempSum, sum = array[0];
        int ptr_i = 0, ptr_j = 1;

        for (int i = 0; i < array.length; i++)
        {
            tempSum = array[i];

            for (int j = i + 1; j < array.length; j++)
            {
                tempSum += array[j];
                if (tempSum > sum)
                {
                    sum = tempSum;
                    ptr_i = i;
                    ptr_j = j;
                }
            }
        }
        int[] sequence = new int[ptr_j - ptr_i + 1];
        for (int m = 0; m < sequence.length; m++){
            sequence[m] = array[ptr_i + m];
        }

        System.out.println("Sum Sequence: " + Arrays.toString(sequence));
        return sum;
    }
}
