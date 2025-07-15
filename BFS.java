/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BFS {
   static List<List<Integer>>ans;
    public List<List<Integer>> levelOrder(TreeNode root) {
        ans=new ArrayList<>();
         if (root == null) return ans;
        bfs(root);
        return ans;
    }
    public static void bfs(TreeNode root)
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(q.size()>0)
        {
                        int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();
                level.add(current.val);

                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
            ans.add(level);

        }
    }
}