/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

public class FirstMissingPositive {
     public int firstMissingPositive(int[] nums) {
        
         int min=nums[0];
         for(int i=0;i<nums.length;i++){
             if(nums[i]<min)
                 min=nums[i];
         }
         for(int i=0;i<min;i++){
             if(i==nums[i]){
                 
             }
             
         }
         
         return 1;
    }

    
}
