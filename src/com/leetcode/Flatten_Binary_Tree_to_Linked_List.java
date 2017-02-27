package com.leetcode;

//无法改变传入对象的地址，只能改变改地址对象的属性
public class Flatten_Binary_Tree_to_Linked_List {
	TreeNode temp;

	public void flatten(TreeNode root) {
		temp = root;
		if (root == null || (root.left == null && root.right == null))
			return;
		TreeNode left = root.left;
		TreeNode right = root.right;
		treeFlatten(left, temp);
		treeFlatten(right, temp);
	}

	// node1为当前节点，node2为上一节点
	public void treeFlatten(TreeNode node1, TreeNode node2) {
		if (node1 == null)
			return;
		temp = node1;
		TreeNode left=node1.left;
		TreeNode right=node1.right;
		node2.left = null;
		node2.right = node1;
		treeFlatten(left, temp);
		treeFlatten(right, temp);

	}
}
