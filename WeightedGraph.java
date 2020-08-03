/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Govindan
 */
import java.util.ArrayList;
class Edgge{
    int startvertex;
    int endvertex;
    int weight;
    Edgge(int startvertex,int endvertex,int weight){
        this.startvertex=startvertex;
        this.endvertex=endvertex;
        this.weight=weight;
    }
}
public class WeightedGraph {
    public static void main(String args[]){
        int vertex=5;
        int matrix[][]=new int[vertex+1][vertex+1];
        ArrayList<Edgge> edgelist=new ArrayList<Edgge>();
        edgelist.add(new Edgge(1,4,2));
        edgelist.add(new Edgge(4,2,15));
        edgelist.add(new Edgge(2,5,8));
        edgelist.add(new Edgge(3,5,6));
        edgelist.add(new Edgge(3,4,5));
        edgelist.add(new Edgge(3,1,10));
        for(int i=0;i<edgelist.size();i++){
            Edgge currentedge=edgelist.get(i);
            int startindex=currentedge.startvertex;
            int endindex=currentedge.endvertex;
            int weight=currentedge.weight;
            matrix[startindex][endindex]=weight;
        }
        for(int i=1;i<=vertex;i++){
            for(int j=1;j<=vertex;j++){
            System.out.print(matrix[i][j]+" ");
        }
            System.out.println();
    }
}}
