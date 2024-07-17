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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();
        Set<Integer> toDeleteSet = new HashSet<>();
        for (int del : to_delete) {
            toDeleteSet.add(del);
        }
        deleteNodes(root, toDeleteSet, result, true);
        return result;
    }

    private TreeNode deleteNodes(TreeNode node, Set<Integer> toDeleteSet, List<TreeNode> result, boolean isRoot) {
        if (node == null) {
            return null;
        }

        boolean toDelete = toDeleteSet.contains(node.val);
        if (isRoot && !toDelete) {
            result.add(node);
        }

        node.left = deleteNodes(node.left, toDeleteSet, result, toDelete);
        node.right = deleteNodes(node.right, toDeleteSet, result, toDelete);

        return toDelete ? null : node;
    }
}