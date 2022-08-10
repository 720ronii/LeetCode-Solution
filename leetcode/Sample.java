/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        
      HashMap<String, Integer> map=new HashMap<>();
      
      
      String s[]= {"Hello userTwooo","Hi  userThree","Wonderful day Alice","Nice day userThree","RONIT IS A good BOY"};
      String sender[]={"Alice","userTwo","userThree","Alice","RONIT"};
      
      int vale[]=new int[s.length];
      
      for(int i=0;i<s.length;i++){
          String words[]=s[i].split(" ");
          vale[i]=words.length;
         }
       for(int i=0;i<s.length;i++){
           //System.out.println(sender[i]+": "+vale[i]);
           System.out.println(map.put(sender[i],vale[i]));
       }
        
            //System.out.println(map);
      
      
       
    }
}
