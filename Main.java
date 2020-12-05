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
        int sum = array[0], tempSum = 0;
        int start = 0, ptr_s = 0, end = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (tempSum <= 0){
                ptr_s = i;
                tempSum = array[i];
            } else {
                tempSum += array[i];
            }

            if (tempSum > sum){
                sum = tempSum;
                start = ptr_s;
                end = i + 1;
            }
        }
        int[] sequence = new int[end - start];
        for (int m = 0; m < sequence.length; m++){
            sequence[m] = array[start + m];
        }

        System.out.println("Sum Sequence: " + Arrays.toString(sequence));

        return sum;
    }
}
