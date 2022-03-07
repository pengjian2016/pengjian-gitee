package com.example.design.设计模式.组合模式;

import java.util.List;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class Test<psvm> {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");

        TreeNode t = tree.root;
        System.out.println("root名字为" + t.getName());

        walk(t);
    }

    public static void walk(TreeNode t) {
        List<TreeNode> nodes = t.getChildren();
        if (!nodes.isEmpty()) {
            for (TreeNode treeNode : nodes) {
                System.out.println(t.getName() + " 的子节点为  " + treeNode.getName());
                walk(treeNode);
            }
        }
    }

}
