class Solution {
    public int countNodes(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=leftHeight(root);
        int right=RightHeight(root);
        if (left==right){
            return (2<<(left))-1;
        }else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
        
    }
    private static int leftHeight(TreeNode root){
        int cnt=0;
        while(root.left!=null){
            cnt++;
            root=root.left;
        }
        return cnt;
    } 
    private static int RightHeight(TreeNode root){
        int cnt=0;
        while(root.right!=null){
            cnt++;
            root=root.right;
        }
        return cnt;
    } 
}
