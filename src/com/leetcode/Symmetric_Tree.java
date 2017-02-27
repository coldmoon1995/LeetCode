package com.leetcode;

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        	return true;
        return isSymmetricTree(root.left, root.right);
    }
	public boolean isSymmetricTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if ((p == null && q != null)||(p != null && q == null))
			return false;
		
		else {
			if (p.val == q.val)
				return isSymmetricTree(p.left, q.right)
						&& isSymmetricTree(p.right, q.left);
			else
				return false;
		}
	}
}
