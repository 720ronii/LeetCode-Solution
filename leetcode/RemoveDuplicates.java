/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
public class RemoveDuplicates {
     public int removeDuplicates(int[] nums) {
        
        int k=1;
        //int number=nums[nums.length-1];
        
        for(int i=nums.length-1;i>0;i--){
            int j=i-1;
            if(nums[j]<nums[i]){
                k++;
            }
    
        }
        return k;
    }
    public static void main(String[] args) {
        int []nums={1,1,2};
        RemoveDuplicates rd=new RemoveDuplicates();
        System.out.print(rd.removeDuplicates(nums));
    }
}
