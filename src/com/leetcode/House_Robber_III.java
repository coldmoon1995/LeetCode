package com.leetcode;



public class House_Robber_III {
	public int rob(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return root.val;
		else if (root.left == null && root.right != null) {
			return Math.max(root.val + rob(root.right.left)
					+ rob(root.right.right), rob(root.right));
		} else if (root.left != null && root.right == null) {
			return Math.max(root.val + rob(root.left.left)
					+ rob(root.left.right), rob(root.left));
		} else {
			int max1 = root.val + rob(root.left.left) + rob(root.left.right)
					+ rob(root.right.left) + rob(root.right.right);
			int max2 = rob(root.left) + rob(root.right);
			return Math.max(max1, max2);
		}

	}
}
