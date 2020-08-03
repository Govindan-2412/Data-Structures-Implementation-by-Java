/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
import java.util.Stack;
public class BinaryTree2 {
    TreeNode root;
    public class TreeNode{
     int data;
     TreeNode leftnode;
     TreeNode rightnode;
     TreeNode(int data){
         this.data=data;
     }
    }
    BinaryTree2(){
        this.root=null;
    }
    public void binary(){
        TreeNode first=new TreeNode(10);
        TreeNode second=new TreeNode(20);
        TreeNode third=new TreeNode(30);
        TreeNode fourth=new TreeNode(40);
        TreeNode five=new TreeNode(50);
        root=first;
        first.leftnode=second;
        first.rightnode=third;
        second.leftnode=fourth;
        second.rightnode=five;  
    }
    public void preorder(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+"-->");
            if(temp.rightnode!=null){
                stack.push(temp.rightnode);
            }
            if(temp.leftnode!=null){
                stack.push(temp.leftnode);
            }
        }
    }
    public static void main(String args[]){
        BinaryTree2 aa=new BinaryTree2();
        aa.binary();
        aa.preorder();
    }
}
