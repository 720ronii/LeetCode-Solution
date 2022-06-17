/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;
public class BestTimetoBuyandSellStock {
    
     public int maxProfit(int[] prices) {
         int indexvalue=0;
         int min=prices[0];
         int maxprofit=0;
         
          int max=0;
         for(int i=indexvalue;i<prices.length;i++){
             if(prices[i]>max){
                 max=prices[i];
             }   
         }
         
         
         for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                indexvalue=i;
                //System.out.println(min);
            }    
         } 
          
         return max-min;
    }
     public static void main(String[] args) {

         BestTimetoBuyandSellStock maxp=new BestTimetoBuyandSellStock();
         
         int []nums1={7,6,4,3,1};
         System.out.println(maxp.maxProfit(nums1));;
    }    
}