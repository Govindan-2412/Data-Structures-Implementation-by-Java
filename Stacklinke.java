/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
public class Stacklinke {
    class Node{
    int data;
   Node next;
   Node(int data){
       this.data=data;
       this.next=null;
   }
}
    private Node head;
    Stacklinke(){
        this.head=null;
    }
    public void push(int data){
    Node newnode=new Node(data);
    newnode.next=this.head;
    this.head=newnode;
    }
    public int peek()throws Exception{
        if(head==null){
            throw new Exception("Stack is empty");
        }
        return this.head.data;
    }
    public int push()throws Exception{
        if(head==null){
            throw new Exception("Stack is empty");
        }
        Node temp=this.head;
        this.head=this.head.next;
        return temp.data;
    }
}
