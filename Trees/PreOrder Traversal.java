class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode>stack=new Stack<>();
        List<Integer>list=new ArrayList<>();
        if (root==null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode root1=stack.pop();
            list.add(root1.val);
            if(root1.right!=null){
                stack.push(root1.right);
            }if (root1.left!=null){
                stack.push(root1.left);
            }
        }
        return list;
        
    }
}
