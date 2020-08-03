
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
public class doubprac {
    public list head;
    public list tail;
    public int length;
    public class list{
        int data;
        list next;
        list previous;
        list(int data){
            this.data=data;
        }
    }
    doubprac(){
        this.head=null;
        this.tail=null;
        this.length=0;
}
    public boolean isEmpty(){
        return length==0;
    }
    
     public int length(){
            return length;
        }
    public void displayfirst(){
        if(head==null){
            return;
        }
        list temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void displaylast(){
        if(tail==null){
            return;
        }
        list temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.previous;;
        }
        System.out.println("null");
    }
    public void insertfirst(int value){
       list newnode=new list(value);
        if(isEmpty()){
            tail=newnode;
        }
        else{
            head.previous=newnode;
        }
        newnode.next=head;
        head=newnode;
        length++;
    }
    public void insertlast(int value){
        list newnode=new list(value);
        if(isEmpty()){
            head=newnode;
        }
        else{
            tail.next=newnode;
        }
        newnode.previous=tail;
        tail=newnode;
        length++;
    }
    public list deletefirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Already empty");
        }
        list temp=head;
        if(head==tail){
        tail=null;
        }else{
        head.next.previous=null;
            }
        head=head.next;
        temp.next=null;
        return temp;
    }
    public list deletelast(){
        if(isEmpty()){
            throw new NoSuchElementException("Already empty");
        }
        list temp=tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
        }
    
    public static void main(String args[]){
        doubprac ss=new doubprac();
        ss.insertfirst(12);
        ss.insertfirst(23);
        ss.insertfirst(43);
       System.out.println(ss.length());
        System.out.println(ss.isEmpty());
    }
}