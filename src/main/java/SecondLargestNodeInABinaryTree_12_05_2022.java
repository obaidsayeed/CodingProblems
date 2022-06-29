import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val = x;
        this.left = null;
        this.right = null;
    }
}
public class SecondLargestNodeInABinaryTree_12_05_2022 {

    static int i;
    public static TreeNode deseriaize(String data){
        if(data == null){
            return null;
        }
        i = 0;
        String arr[] =data.split(" ");
        return helper(arr);
    }
    public static TreeNode helper(String[] arr){
        if(arr[i].equals("-1")){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        i++;
        root.left = helper(arr);
        i++;
        root.right = helper(arr);
        return root;
    }
    public static int solution(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        int res;
        q.add(root);
        int maxnode = root.val;
        int secondmaxnode = root.val;
        while(q.size() != 0){
            int n = q.size();
            for(int j = 0;j < n;j++){
                TreeNode curr = q.remove();
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(maxnode < curr.val){
                    if(secondmaxnode != maxnode){
                        secondmaxnode = maxnode;
                    }
                    maxnode = curr.val;
                }
            }
        }

        return secondmaxnode;
    }
}
