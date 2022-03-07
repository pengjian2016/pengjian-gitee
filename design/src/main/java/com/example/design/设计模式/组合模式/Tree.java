package com.example.design.设计模式.组合模式;

/**
 * @author pengjian
 * @since 2022-03-07
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }
}
