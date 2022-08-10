/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
class Solution2 {
    public boolean searchMatrix(int [][]arr, int target) {
        int m=arr.length;
        int n=arr[0].length-1;
        int k=0;
        
        for(int i=0;i<arr.length;i++){
         if(target<=arr[i][n]){
            k=i;
            break;
         }
        }
        for(int i=0;i<=n;i++){
            if(target==arr[k][i])
                return true;
        }
        
        
        return false;
        
    }
}

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        
        Solution2 s1=new Solution2();
        
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.err.println(s1.searchMatrix(arr, 1));
        
        
    }
    
}
