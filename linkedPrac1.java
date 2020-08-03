/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
public class linkedPrac1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void display(Node head){
        if(head==null){
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print(current);
    }
    public Node insertfrist(Node head,int value){
        Node newnode=new Node(value);
        if(head==null){
            head=newnode;
            return newnode;
        }
        newnode.next=head.next;
        head=newnode;
        return head;
    }
    public Node insertlast(Node head,int value){
        Node newnode=new Node(value);
        if(head==null){
            head=newnode;
            return head;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
        return head;
    }
    public void insertAfter(Node previous,int value){
        if(previous==null){
            System.out.println("Previous node is empty");
            
        }
        Node newnode=new Node(value);
        newnode.next=previous.next;
        previous.next=newnode;
    }
    public int size(Node head){
        Node current=head;
        int count=0;
        while(current.next!=null){
            current=current.next;
            count++;
        }
       return count;
    }
    public Node insertPosition(Node head,int value,int position){
        int size=size(head);
         if(position>(size+1)||position<1){
            System.out.println("Invalid position");
        return head;
    }
      Node newnode=new Node(value);
    if(position==1){
        newnode.next=head;
        return newnode;
       }
    else{
        int count=1;
        Node previous=head;
        while(count<position-1){
            previous=previous.next;
            count++;
        }
        Node current=previous.next;
        newnode.next=current;
        previous.next=newnode;
        return head;
    }}
    public static void main(String args[]){
        Node head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        Node five=new Node(50);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        linkedPrac1 in=new linkedPrac1();
        in.display(head);
        System.out.println();
        Node inn=in.insertfrist(head,15);
        in.display(inn);
        System.out.println();
        Node innn=in.insertlast(head,55);
        in.display(innn);
        System.out.println();
        in.insertAfter(second,35);
        in.display(head);
        System.out.println();
        System.out.println("The size of the linklednode "+in.size(head));
        Node ad=in.insertPosition(head,24,6);
        in.display(ad);    }
    
}
