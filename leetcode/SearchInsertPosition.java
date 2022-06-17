/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Scanner;

public class SearchInsertPosition {
     public int searchInsert(int[] nums, int target) {
        int position=0;
        int second=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.print("position");
                return i;
               // position= i;
            }
            if(nums[i]>target){
               System.out.print("second");
               second=i;
               return i;
                
            }
                
        }
         System.out.println("Position: "+position+"\n second: "+second+"\n");
       
         return nums.length;
     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int []arr=new int[p];
        
        System.out.println("Enter the position: ");
        p=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        SearchInsertPosition si=new SearchInsertPosition();
       System.out.println( si.searchInsert(arr, p));
    }
            
}

/* 
package leetcode;
import java.util.Scanner;
public class PlusOne {
     public int[] plusOne(int[] digits) {
        int newdigit[]=new int[2];
        
        
         int x=digits[digits.length-1];
         int sizeofarray=digits.length-1;
         
                 
         System.out.println(digits[digits.length-1]);
         x+=1;
         //System.out.println("x: "+x);
         int length=String.valueOf(x).length();
         int newarray[]=new int[sizeofarray+length];
         //System.out.println("length of new array: "+newarray.length);
         
         
         if(length==1){
           //  System.out.println("length: "+length);
             digits[digits.length-1]=x;
             return digits;
         }else{
             for( int i=0;i<sizeofarray;i++){
                 newarray[i]=digits[i];
             }
             int j=0;
             for(int i=newarray.length-1;j<length;j++){
                 System.out.println("new i: "+i);
                 newarray[i]=x%10;
                 x=x/10;
                 System.out.println("new [i]: "+newarray[i]);
                 i--;
             }
             
         }
        // System.out.println("new array");
         
      return newarray;  
    } 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the value in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
                    
        }
        PlusOne po=new PlusOne();
        int brr[]=po.plusOne(arr);
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
        
    }
    
}




*/