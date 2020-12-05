public class BinaryTree {
    Node rootContainer, rootTarget;

    private boolean same (Node firstRoot, Node secondRoot)
    {
        if (firstRoot == null && secondRoot == null)
            return true;

        if(firstRoot == null || secondRoot == null)
            return false;

        boolean check = firstRoot.value == secondRoot.value &&
                same(firstRoot.l, secondRoot.l) &&
                same(firstRoot.r, secondRoot.r);

        return check;
    }

    boolean isSubtree (Node containerTree, Node targetTree)
    {
        if (targetTree == null)
            return true;
        else if (containerTree == null)
            return false;

        if (same(containerTree, targetTree))
            return true;

        return isSubtree(containerTree.l, targetTree) || isSubtree(containerTree.r, targetTree);
    }
}

class Node
{
    int value;
    Node l, r;

    Node (int data){
        value = data;
        l = null;
        r = null;
    }
}
