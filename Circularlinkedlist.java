
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
public class Circularlinkedlist {
    private listnode last;
    private int length;

   
    private class listnode{
        int data;
        listnode next;
        listnode(int data){
            this.data=data;
        }
    }
    Circularlinkedlist(){
        this.last=null;
        this.length=0;
        
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void circular(){
        listnode first=new listnode(10);
        listnode second=new listnode(20);
        listnode third=new listnode(30);
        listnode fourth=new listnode(40);
        listnode five=new listnode(50);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        five.next=first;
        last=five;
    }
    
    public void display(){
        if(last==null)
            return ;
        listnode first=last.next;
        while(first!=last){
            System.out.print(first.data+"-->");
            first=first.next;  
        }
        System.out.println(first.data);
    }
    public void insertfirst(int value){
        listnode temp=new listnode(value);
        if(last==null){
            last=temp;
        }
        else{
            temp.next=last.next;
        }
        last.next=temp;
        length++;
    }
    public void insertlast(int value){
        listnode newnode=new listnode(value);
        if(last==null){
           last=newnode;
           last.next=last;
        }
        newnode.next=last.next;
        last.next=newnode;
        last=newnode;
        length++;
    }
    public listnode removefirstnode(){
        if(isEmpty()){
            throw new NoSuchElementException("Alreay the circularlinked list is Empty");
        }
        listnode temp=last.next;
        if(last.next==last){
            last=null;
        }else{
       last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }
    public static void main(String args[]){
        Circularlinkedlist as=new Circularlinkedlist();
       as.insertlast(10);
       as.insertlast(3);
      as.insertlast(20);
       as.display();
       as.removefirstnode();
       as.removefirstnode();
        System.out.println(as.length());
        as.display();
    }
}
