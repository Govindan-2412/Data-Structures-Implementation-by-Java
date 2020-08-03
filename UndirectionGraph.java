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
class Edge{
    int startvertex;
    int endvertex;
    Edge(int start,int end){
        this.startvertex=start;
        this.endvertex=end;
        
    }
}
public class UndirectionGraph {
    public static void main(String args[]){
 int vertex=5;
 int matrix[][]=new int[vertex+1][vertex+1];
 ArrayList<Edge> edgelist=new ArrayList<Edge>();
 edgelist.add(new Edge(1,3));
 edgelist.add(new Edge(3,1));
 edgelist.add(new Edge(1,4));
 edgelist.add(new Edge(4,1));
 edgelist.add(new Edge(4,2));
 edgelist.add(new Edge(2,4));
 edgelist.add(new Edge(2,5));
 edgelist.add(new Edge(5,2));
 edgelist.add(new Edge(5,3));
 edgelist.add(new Edge(3,5));
 edgelist.add(new Edge(3,4));
 edgelist.add(new Edge(4,3));

 for(int i=0;i<edgelist.size();i++){
     Edge currentedge=edgelist.get(i);
     int startvertex=currentedge.startvertex;
     int endvertex=currentedge.endvertex;
     matrix[startvertex][endvertex]=1;
 }
     
 for(int i=1;i<=vertex;i++){
     for(int j=1;j<=vertex;j++){
         System.out.print(matrix[i][j]+" ");
     }
     System.out.println();
 }
 }
 }
