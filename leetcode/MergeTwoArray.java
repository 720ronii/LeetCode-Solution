
package leetcode;

import java.util.Arrays;

public class MergeTwoArray {
      public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k=m+n-1;
        m-=1;
        n-=1;
        while(n>=0 && m>=0){
            if(nums2[n]>nums1[m]){
                nums1[k]=nums2[n];
                k--;
                n--;
            }else{
                nums1[k]=nums1[m];
                k--;
                m--;
            }
        }
        System.out.println("k: "+k+"N: "+n+"M: "+m);
        for(int i=n;i>=0;i--)
        {
            nums1[k]=nums2[n];
            n--;
            k--;
        }
        for(int i=m;i>=0;i--){
            nums1[k]=nums1[m];
            m--;
            k--;
        }
        
        System.out.println("k2: "+k+"N: "+n+"M: "+m);
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
        
     }
    public static void main(String[] args) {
       int nums1[]={1,2,3,2,5,6};
        int m=3,n=3;
        int nums2[]={2,5,6};
//           //int nums1[] = {0}; 
//           int m = 0;
//           int  nums2[] ={1};
//           int n = 1;
         //MergeTwoArray mta=new MergeTwoArray();
        //mta.merge(nums1, m, nums2, n);
        for(int i:nums1)
            System.out.print(i);
        Arrays.sort(nums1);
          for(int i:nums1)
            System.out.print("    "+i); 
    }   
}