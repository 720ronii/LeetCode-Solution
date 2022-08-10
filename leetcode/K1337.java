package leetcode;

import java.util.Arrays;

class Solution4{
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
         //for(int i=0;i<mat.length;i++)
            //System.out.print(arr[i]+" ");
         
         int brr[]=new int[arr.length];
         brr=arr;
         
         Arrays.sort(brr);
         for(int i=0;i<k;i++){
             
         }
         
       
         
         return brr;
    }
     
    
}
public class K1337 {
    public static void main(String[] args) {
        
        Solution4 s4=new Solution4();
        int [][]mat={
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}};
        
        s4.kWeakestRows(mat, 3);
        
        
    }
            
    
}
