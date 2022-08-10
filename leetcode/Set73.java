/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Solution73{
    void setZe(int [][]matrix,int i,int j){
        
      //  System.out.print(i+" "+j);
        
        for(int k=0;k<matrix[0].length;k++)
            matrix[i][k]=0;
        for(int k=0;k<matrix.length;k++)
            matrix[k][j]=0;   
    }
    
    
    
    
    
    
    public void setZeroes(int[][] matrix) {
      
        List <Integer> listi=new ArrayList<Integer>();
        List <Integer> listj=new ArrayList<Integer>();
        
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    listi.add(i);
                    listj.add(j);
                }  
            }
        }
        for(int i=0;i<listi.size();i++){
            setZe(matrix,listi.get(i),listj.get(i));
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[i][j]+" ");
            
                System.out.print("\n");
            
        }
        
    }
    
}


public class Set73 {
    
    public static void main(String[] args) {
        //int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        
        Solution73 s73=new Solution73();
        s73.setZeroes(arr);
    }
    
    
}
