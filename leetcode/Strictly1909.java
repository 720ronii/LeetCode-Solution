/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author __roonit
 */
class Solution1909 {
    public boolean canBeIncreasing(int[] nums) {
        
        int k=0;
        
        for(int i=nums.length-1;i>0;i--){
            int j=i-1;
            if(nums[j]>nums[i]){
                if(k<1)
                {
                 k++;    
                }else if(k>0)
                    return false;
            }   
        }
        return true;
    }
}



public class Strictly1909 {
    
    public static void main(String[] args) {
        //int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int arr[]={2,3,1,2};
        
        Solution1909 s1909=new Solution1909();
       System.out.print( s1909.canBeIncreasing(arr));
                
    }
    
    
}