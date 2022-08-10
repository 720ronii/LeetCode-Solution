/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

class Summary_Ranges{
    
       public List<String> summaryRanges(int[] nums) {
        
        ArrayList<Integer> list1=new ArrayList<>();
        
        ArrayList<String> list2=new ArrayList<>();
        
        
        int j=0;
        int temp_sum=0;
        
        for(int i=0;i<nums.length-1;i++){
            j=i+1;
//            System.out.print("I: "+i);
//            System.out.print(" J: "+j);
            temp_sum=nums[i]+1;
           // System.out.println(" Temp_sum: "+temp_sum);
            if(temp_sum==nums[j])
            {
              //  System.out.println("temp sum and J are equals "+nums[j]);
                list1.add(nums[i]);
              //  System.out.println("Index added: "+i);
            }else{
              //  System.out.println("Last Index added: "+i);
                list1.add(nums[i]);
                System.out.println(list1);
                list1.clear();
               // System.out.println("List clear: "+i);
            }   
        }
        list1.add(nums[j]);
        System.out.println(list1);
        //System.out.printf("J: "+j);
       return list2; 
    }  
}
public class Summary_Ranges228 {
    public static void main(String[] args) {
        int a[]={0,2,3,4,6,8,9};
        int b[]={0,1,2,4,5,7,};
        Summary_Ranges l1=new Summary_Ranges();
        l1.summaryRanges(a);
        System.out.println("\n");
        l1.summaryRanges(b);
    }
    
}
