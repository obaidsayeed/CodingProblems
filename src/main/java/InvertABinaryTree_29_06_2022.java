//asked by Google.
//
//Invert a binary tree.
//
//For example, given the following tree:
//
//    a
//   / \
//  b   c
// / \  /
//d   e f
//should become:
//
//  a
// / \
// c  b
// \  / \
//  f e  d
//Constraints:
//
//The number of nodes in the tree is in the range [0, 100].
//-100 <= Node.val <= 100

import sun.reflect.generics.tree.Tree;

public class InvertABinaryTree_29_06_2022 {
    public static TreeNode solution(TreeNode root){
        if (root == null){
            return root;
        }

        TreeNode newroot = new TreeNode(root.val);
        newroot.left = solution(root.right);
        newroot.right = solution(root.left);
        return newroot;
    }
}
