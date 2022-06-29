import org.junit.Test;


public class InvertABinaryTree_29_06_2022Test {
    @Test
    public void testCase_1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        root = InvertABinaryTree_29_06_2022.solution(root);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }
}
