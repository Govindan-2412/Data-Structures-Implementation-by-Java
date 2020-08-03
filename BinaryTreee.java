/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */

public class BinaryTreee {
public TreeNode root;
public class TreeNode{
    int data;
    TreeNode leftnode;
    TreeNode rightnode;
    TreeNode(int data){
        this.data=data;
    }}
    BinaryTreee(){
      this.root=null;  
    }
    public void Binary(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode five=new TreeNode(5);
        root=first;
        first.leftnode=second;
        first.rightnode=third;
        second.leftnode=fourth;
        second.rightnode=five;
        third.leftnode=fourth;
        third.rightnode=five;
}
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.leftnode);
        preorder(root.rightnode);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.leftnode);
        System.out.print(root.data+" ");
        inorder(root.rightnode);
    }
    public void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.leftnode);
        postorder(root.rightnode);
        System.out.print(root.data+" ");
    }
    public static void main(String args[]){
        BinaryTreee aa=new BinaryTreee();
        aa.Binary();
        
    }
}
