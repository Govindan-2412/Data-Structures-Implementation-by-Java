/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
import java.util.Queue;
import java.util.LinkedList;
public class BinaryTre {
    public TreeNode root;
    public class TreeNode{
        int data;
        TreeNode leftnode;
        TreeNode rightnode;
        TreeNode(int data){
            this.data=data;
        }}
        BinaryTre(){
            this.root=null;
    }
public void binary(){
TreeNode first=new TreeNode(2);
TreeNode second=new TreeNode(4);
TreeNode third=new TreeNode(6);
TreeNode fourth=new TreeNode(8);
TreeNode five=new TreeNode(10);
root=first;
first.leftnode=second;
first.rightnode=third;
second.leftnode=fourth;
second.rightnode=five;
third.leftnode=fourth;
third.rightnode=five;
}
public void levelorder(TreeNode root){
    if(root==null){
        return;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        TreeNode temp=queue.poll();
        System.out.print(temp.data+" ");
        if(temp.leftnode!=null){
            queue.offer(temp.leftnode);
        }
        if(temp.rightnode!=null){
            queue.offer(temp.rightnode);
        }
    }   
    }
public static void main(String args[]){
    BinaryTre sd=new BinaryTre();
    sd.binary();
    sd.levelorder(sd.root);
   
   
}
}
