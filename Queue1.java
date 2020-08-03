/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
import java.util.NoSuchElementException;
public class Queue1 {
    private listNode front;
    private listNode rear;
    private int length;
    private class listNode{
        int data;
        listNode next;
        listNode(int data){
            this.data=data;
            this.next=null;
        }}
        Queue1(){
          this.front=null;
          this.rear=null;
          this.length=0;
        }
        public boolean isEmpty(){
            return length==0;
        }
        public int length(){
            return length;
        }
        public void enqueue(int value){
            listNode newnode=new listNode(value);
            if(isEmpty()){
               front=newnode;
            }
            else{
                rear.next=newnode;
            }
            rear=newnode;
            length++;
    }
        public int dequeue(){
            if(isEmpty()){
                throw new NoSuchElementException("Queue is already empty");
            }
            int results=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            length--;
            return results;
        }
        public void print(){
            if(isEmpty()){
                return;
            }
            listNode current=front;
            while(current!=null)
            {
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.println("null");
        }
        public int firstelement(){
            if(isEmpty()){
                throw new NoSuchElementException("Queue is empty");
            }
            return front.data;
        }
        public int lastelement(){
            if(isEmpty()){
                throw new NoSuchElementException("Queue is empty");
            }
            return rear.data;
        }
        public static void main(String args[]){
            Queue1 nu=new Queue1();
            nu.enqueue(10);
            nu.enqueue(20);
            nu.enqueue(30);
            nu.enqueue(40);
            nu.enqueue(50);
            nu.dequeue();
            nu.dequeue();
            nu.print();
            System.out.println(nu.firstelement());
            System.out.println(nu.lastelement());
        }
}
