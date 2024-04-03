class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       Map<TreeNode, TreeNode> markmap = new HashMap<>();
        MarkParent(root, markmap);
        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target, true);
        int distance = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (distance == k) {
                break;
            }
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                // Enqueue the children of the current node if they exist and have not been visited
                if (curr.left != null && visited.get(curr.left) == null) {
                    queue.offer(curr.left);
                    visited.put(curr.left, true);
                }
                if (curr.right != null && visited.get(curr.right) == null) {
                    queue.offer(curr.right);
                    visited.put(curr.right, true);
                }
                // Enqueue the parent of the current node if it exists and has not been visited
                TreeNode parent = markmap.get(curr);
                if (parent != null && visited.get(parent) == null) {
                    queue.offer(parent);
                    visited.put(parent, true);
                }
            }
            distance++;
        }
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }
        return result;
    }

    private static void MarkParent(TreeNode root, Map<TreeNode, TreeNode> map) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.left != null) {
                map.put(curr.left, curr);
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                map.put(curr.right, curr);
                queue.offer(curr.right);
            }
        }
    }
}
