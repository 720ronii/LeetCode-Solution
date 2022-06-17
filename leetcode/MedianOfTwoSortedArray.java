/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
import java.util.Scanner;
public class MedianOfTwoSortedArray {
      public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
         int a=nums1.length;
         int b=nums2.length;
         int []arr=new int[a+b];
            int i=0,j=0,k=0;
        double median=0.0;
        while(i<a && j<b){
            if(nums1[i]>nums2[j]){
                arr[k]=nums2[j];
                j++;
                k++;
                
            }else if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums1[i];
                k++;
                i++;
                j++;
            }
        }
       if(i<a){
           for(;i<a;i++){
               arr[k]=nums1[i];
               k++;
           }
       }else{
           for(;j<b;j++){
               arr[k]=nums2[j];
               k++;
           }
           
       }
       for(int e=0;e<arr.length;e++){
           System.out.println(arr[e]);
       }
      
       int c=arr.length/2;
      
       if(c%2==1){
           median=arr[c];
       }else{
           
           double sum=(arr[c]+arr[c-1])*1.0;
          // sum=sum/2;
           return sum/2;
           //System.out.println("median even: "+sum);
       }
       
       
     return median;
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []nums1=new int[x];
         x=sc.nextInt();
        int []nums2=new int[x];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
            
        }
         for(int i=0;i<nums2.length;i++){
            nums2[i]=sc.nextInt();
            
        }
         
        MedianOfTwoSortedArray ms=new MedianOfTwoSortedArray();
        System.out.println(ms.findMedianSortedArrays(nums1, nums2));
    }
    
}
