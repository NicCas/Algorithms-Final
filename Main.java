import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------- Question 2 ----------");
        int [] a = {2, -8, 3, -2, 4, -10};
        System.out.println("Sum: " + questionTwo(a));

        System.out.println();
        System.out.println("---------- Question 3 ----------");
        
         BinaryTree compareTree = new BinaryTree();

        compareTree.rootContainer = new Node (100);
        compareTree.rootContainer.l = new Node (60);
        compareTree.rootContainer.l.r = new Node (50);
        compareTree.rootContainer.l.l = new Node (40);
        compareTree.rootContainer.l.l.r = new Node (30);
        compareTree.rootContainer.l.l.l = new Node (20);
        compareTree.rootContainer.l.l.l.r = new Node (3);
        compareTree.rootContainer.l.l.l.l = new Node (11);
        compareTree.rootContainer.r = new Node (70);
        compareTree.rootContainer.r.r = new Node (2);
        compareTree.rootContainer.r.l = new Node (8);

        compareTree.rootTarget = new Node (20);
        compareTree.rootTarget.l = new Node (11);
        compareTree.rootTarget.r = new Node (3);

        if (compareTree.isSubtree(compareTree.rootContainer, compareTree.rootTarget))
            System.out.println("Subtree");
        else
            System.out.println("Not a Subtree");

        compareTree.rootContainer = new Node (100);
        compareTree.rootContainer.l = new Node (60);
        compareTree.rootContainer.l.r = new Node (50);
        compareTree.rootContainer.l.l = new Node (40);

        compareTree.rootTarget = new Node (60);
        compareTree.rootTarget.l = new Node (50);
        compareTree.rootTarget.r = new Node (3);

        if (compareTree.isSubtree(compareTree.rootContainer, compareTree.rootTarget))
            System.out.println("Subtree");
        else
            System.out.println("Not a Subtree");

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
