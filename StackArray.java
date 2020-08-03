/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
public class StackArray {
    static final int Max=300;
    int a[]=new int[Max];
    int top;
    StackArray(){
        top=-1;
    }
    boolean isEmpty(){
        return (top<0);
    }
    boolean push(int x){
        if(top>=Max-1){
            System.out.println("Stack overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x+" This element is pushed into stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack is underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack is underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }
    }
    int size(){
      int i=0;
      int count=0;
      while(a[i]!=0){
          count++;
          i++;
      }
      return count;
   }
}

