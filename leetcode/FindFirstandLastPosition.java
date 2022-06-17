package leetcode;
public class FindFirstandLastPosition {
    
    
    public int[] searchRange(int[] nums, int target) {
        
        int []arr={-1,-1};
        int a=0;
        int b=nums.length-1;
        int m;
            for(int i=0;i<nums.length;i++){

                m=(a+b)/2;
                if(nums[m]==target){
                    System.out.println("block 1");
                    int n=m;
                    
                    
                    if(nums[n-1]==nums[m]){
                        System.out.println("block 2");
                         arr[0]=n-1;
                         arr[1]=m;

                        return arr;
                    }else{
                        System.out.println("block 3");
                         arr[0]=m;
                         arr[1]=m+1;
                        return arr;
                    }

                }else if(target<nums[m]){

                    b=m;

                }else if(target>m){
                    a=m;
                }

            }
          return arr;
        
    }
    public static void main(String[] args) {
          int[]  nums = {1,1,2,2,3,4,5,5};
          
          int target = 1;
          FindFirstandLastPosition fnlp=new FindFirstandLastPosition();
          int nums2[]=fnlp.searchRange(nums, target);
          System.out.println(nums2[0]+" "+nums2[1]);
            
                    
    }   
    
}
