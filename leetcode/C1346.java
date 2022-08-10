package leetcode;

class Solution3 {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
                    
            for(int j=0;j<arr.length;j++){
                
                if(arr[j]==2*arr[i])
                      return true;
            }
        }
       return false; 
    }
}
public class C1346 {
    public static void main(String[] args) {
        
        Solution3 s3=new Solution3();
       int  arr[]={-2,0,10,-19,4,6,-8};
        System.out.println(s3.checkIfExist(arr));   
    }
}
