/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import javax.xml.stream.events.Characters;

/**
 *
 * @author __roonit
 */
class Solution1796{
    
       public int secondHighest(String s) {
        int arr[]=new int[10];
        char []ch=s.toCharArray();
        int max=0;
        
        for(int i=0;i<ch.length;i++){
            
            if(ch[i]=='0' ||ch[i]=='1' ||ch[i]=='2' ||ch[i]=='3' ||ch[i]=='4' ||ch[i]=='5' ||ch[i]=='6' ||ch[i]=='7' ||ch[i]=='8' ||ch[i]=='9')
            {
                int a= Integer.parseInt(Character.toString(ch[i]));
                if(max<a)
                    max=a;
            }  
        }
        char x=(char)max;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==x){
                
                
            }
        }
        
        
        
        for(int i=0;i<arr.length;i++){
                if(arr[i]>0)
                    max=i;
            
            }
        System.out.println(max);
        for(int i=max;i>0;i--){
            int j=i-1;
                
            if(arr[j]>0)
                return j;
            
            
        }
        
        
      return -1;  
    }
}


public class Second1796 {
    
    public static void main(String[] args) {
        String s = "dfa12321afd";
                
        Solution1796 s1=new Solution1796();
        System.out.println(s1.secondHighest(s));
    }
    
    
    
}
