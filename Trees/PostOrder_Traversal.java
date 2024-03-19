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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode>stack=new Stack<>();
       List<Integer>list=new ArrayList<>();
       TreeNode curr=root;
       while(!stack.isEmpty()||curr!=null){
        if (curr!=null){
            stack.push(curr);
            curr=curr.left;
        }
        else{
            TreeNode temp=stack.peek().right;
            if (temp!=null){
                curr=temp;
            }else if (temp==null){
                temp=stack.peek();
                stack.pop();
                list.add(temp.val);
                while(!stack.isEmpty() && stack.peek().right==temp){
                    temp=stack.peek();
                    stack.pop();
                    list.add(temp.val);
                }
            }
        }
       }
       return list;

    }
}
