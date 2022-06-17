/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Scanner;

/**
 *
 * @author __roonit
 */
public class RemoveElement {
     public int removeElement(int[] nums, int val) {
       
        int k=0;
        int val2=1000;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]!=val){
               k++;  
            }
            else{
                nums[i]=val2;
            }
            
            
        }
        val2=nums.length-1;
        for(int e=0;e<nums.length;e++)
        {
        for(int i=0;i<nums.length-1;i++){
            
            int j=i+1;
            if(nums[i]==1000){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                
            }  
        }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        return k;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        RemoveElement re=new RemoveElement();
         System.out.println("Returned value "+re.removeElement(arr, val));
    }
}
