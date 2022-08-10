package leetcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author __roonit
 */
class Solution605{
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        int fO=0;
        int type=0;
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
            {
                fO=i;
                break;
            }
            
        }
        System.out.println("First index with 1: "+fO);
        if(fO%2==0){
            type=1;
        }
        
        for(int i=type;i<=arr.length-1;i+=2){
            
            if(arr[i]==1){
                return false;
            }
        }
        System.out.println("FO 1: "+fO);
        
        for(int i=type;i<arr.length-1;i+=2){
            
            System.out.println("F of I: "+i);
            
            if(arr[i]==0)
                n--;
            
        }
        if(n<=0)
            return true;
        
        return false;
    } 
}
public class Flower605 {
    
    public static void main(String[] args) {
        int []werbed = {0,0,1,0,1};
        int n = 1;
        Solution605 s1=new Solution605();
        System.out.println(s1.canPlaceFlowers(werbed, n));
    }
    
}
