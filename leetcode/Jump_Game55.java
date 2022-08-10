/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
class Solution55 {
    public boolean canJump(int[] nums) {
      
       if(nums[0]==0) 
           return false;
        
        int rechable=0;
        int max=0;
       int minimum=0;
        for(int i=0;i<nums.length;i++){
            
            max=nums[i]+i;
           
            if(rechable<=max){
                rechable=max;
                minimum++;
                if(rechable>=nums.length-1){
                    System.out.println("MIN: "+minimum);
                    return true;
                    }
            }
            if(i>=rechable){
                System.out.println("MIN: "+minimum);
                return false;
            }
                
        }
      System.out.println("MIN: "+minimum);
      return true;
    }
}

public class Jump_Game55 {
    public static void main(String[] args) {
        
        //int arr[]={2,3,1,1,0,4};
        //int arr[]={1,1,3,0,2,1,1,0,0};
        int []arr={2,3,0,1,4};
        Solution55 s55=new Solution55();
        System.out.print(s55.canJump(arr));
    }
    
}