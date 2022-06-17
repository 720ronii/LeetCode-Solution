package leetcode;
public class SingleNumber {
     public int singleNumber(int[] nums) {
         int a=0;  
        for(int i=1;i<nums.length;i++){
            System.out.println("hey");
            if(nums[a]!=nums[i]){
                a=nums[a];
                return a;
               
            }
            a++;
            i=1;
            
        }
        
        
        
      return a;  
        
    }
     public static void main(String[] args) {
        int nums1[]={2,2,1};
         SingleNumber mta=new SingleNumber();
        System.out.print(mta.singleNumber(nums1));
    }   
    
    
    
}
