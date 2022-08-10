/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author __roonit
 */
public class sort {
    public static void main(String[] args) {
        
        int arr[]={9,8,6,4,2,77,88};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
           for(int i:arr){
    System.out.println(i);
}
        
    }
 
    
}
