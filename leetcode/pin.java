/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.Scanner;


public class pin {
    public static void main(String[] args) {
        
        int []a=new int[4];
        
        int []b=new int[4];
        int []c=new int[4];
        int d=a[0],e=0,f=c[0];
                
        
        
        
        Scanner sc=new Scanner(System.in);
                int input1=sc.nextInt();
                int input2=sc.nextInt();
                int input3=sc.nextInt();
                int input4=sc.nextInt();
        
                
    for(int i=0;i<4;i++){
        a[i]=input1%10;
        input1=input1/10;
        
    }
    
    
    Arrays.sort(a);
    
    for(int i=0;i<4;i++){
        
        if(a[i]<d){
            d=a[i];
        }
    }
    Arrays.sort(b);
    
    
    for(int i=0;i<4;i++){
        c[i]=input3%10;
        input3=input3/10;
        
    }
    Arrays.sort(c);
    
    
    int out=(a[0]*a[4]*a[0]);
        System.out.println(out-input4);
    
    
}
    
}
