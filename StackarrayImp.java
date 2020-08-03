/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
public class StackarrayImp {
    public static void main(String args[]){
        StackArray in=new StackArray();
        in.push(22);
        in.push(14);
        in.push(87);
        in.push(98);
        System.out.println("Then top of the element is "+in.peek());
        System.out.println(in.pop()+" This element is popped");
        System.out.println(in.pop()+" This element is popped");
        System.out.println("The top of the element of is "+in.peek());
       
      
        
    }
}
