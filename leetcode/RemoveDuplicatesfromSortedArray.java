/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
class RemoveDuplicatesfromSortedArray {
 public int removeDuplicates(int[] nums) {
        int duplicate=0;  
        int L=1,R=1;
        for(int i=0;i<nums.length-1;i++){
            int k=i+1;
            if(nums[i]!=nums[k]){
                nums[L]=nums[k];
                L++;
                R++;
                duplicate++;
            }
            R++;
           
    }
        return duplicate;
 }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,1,1,1,1,1,1,1,2,2,2,3,3,4};
        int nums2[]={1,2,2,3,3,3,4,4,5,6,7,8,9};
         RemoveDuplicatesfromSortedArray rd=new RemoveDuplicatesfromSortedArray();
        int duplicate=rd.removeDuplicates(nums2);
        for(int i=0;i<=duplicate;i++)      {
        System.out.println(nums[i]);
    }
        
    }    
}
