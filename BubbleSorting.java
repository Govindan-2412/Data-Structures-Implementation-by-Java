/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
public class BubbleSorting {
    public void print(int[] arr){
        int length=arr.length;
        for(int i=0;i<length-1;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public void Bubble(int[] arr){
        int length=arr.length;
        boolean isSwapped;
        for(int i=0;i<length-1;i++){
            isSwapped=false;
            for(int j=0;j<length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped==false)
                break;
        }
    }
    public static void main(String args[]){
        int arr[]={2,1,35,22,78,90,45,54,32};
        BubbleSorting ad=new BubbleSorting();
        ad.print(arr);
        ad.Bubble(arr);
        ad.print(arr);
    }
    
}
