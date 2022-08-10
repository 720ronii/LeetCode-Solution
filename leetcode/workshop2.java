package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solutionw{
     public int[] kWeakestRows(int[][] mat, int k) {
         
         int arr[]=new int[mat[0].length];
         
         for(int i=0;i<mat.length;i++){
             int l=0;
             for(int j=0;j<mat[0].length;j++){
                 if(mat[i][j]==1)
                     l++;
             }
             arr[i]=l;
         }
         Map<Integer ,Integer> map=new HashMap<Integer, Integer>();
         
         
              
        
         
         return arr;
    }
     
    
}
public class workshop2 {
    public static void main(String[] args) {
        
        Solutionw s4=new Solutionw();
        int [][]mat={
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
        
        s4.kWeakestRows(mat, 3);
        
        
    }
            
    
}
