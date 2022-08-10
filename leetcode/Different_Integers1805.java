/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

class Solution1805{
    public char numDifferentIntegers(String word,int z) {
        String word2="";
        String final_word="";
       
        char []wor=word.toCharArray();
        int k=0;
        
        for(int i=0;i<wor.length;i++){
            
            if(wor[i]=='1'|| wor[i]=='2'|| wor[i]=='3'|| wor[i]=='4'|| wor[i]=='5'|| wor[i]=='6'|| wor[i]=='7'|| wor[i]=='8'|| wor[i]=='9'||wor[i]=='0' ){
               
                
                
                int t=(Integer.parseInt(Character.toString(wor[i])));
                
                // String word = "RONIT  2  SAGAR9";
                
                String conver=word.substring(k, i); // conver== substrig
                k=i+1;
               
                word2=word2+conver;
               
                String repeated = new String(new char[t]).replace("\0", word2); 
               
                word2=repeated;
                
                
                final_word=repeated;
                System.out.println(final_word);
                
            }
        }
        //System.out.println(final_word);
        return final_word.charAt(z);
    }
    
    
}

public class Different_Integers1805 {
    public static void main(String[] args) {
        
       
        
        
        Solution1805 s1805=new Solution1805();
        
        String word = "RONIT2";
        System.out.println("Char at index are : "+s1805.numDifferentIntegers(word,0));
    }
    
}
