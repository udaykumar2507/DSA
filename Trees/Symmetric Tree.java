class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return false;
        }
        if (SymmetricCheck(root.left,root.right)){
            return true;
        }else{
            return  false;
        }
    }
    private static boolean SymmetricCheck(TreeNode left,TreeNode right){
        if (left==null || right==null){
            return left==right;
        }
        if (left.val!=right.val){
            return false;
        }
        return SymmetricCheck(left.left,right.right) && SymmetricCheck(left.right,right.left);
    }
}
