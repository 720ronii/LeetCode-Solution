package leetcode;
import java.util.Scanner;
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        
        int []arr={0,0};
        
        for(int i=0;i<nums.length;i++){
           // System.out.println("i="+i);
            for(int j=i+1;j<nums.length;j++){
                //System.out.println("j="+j);
                if(nums[i]+nums[j]==target){   
                   arr[0]=i;
                   arr[1]=j;
                   return arr;
                }
                        
            }
        }
        //System.out.println(arr[0]+" "+arr[1]);         
      return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the target");
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value in array: ");
            arr[i]=sc.nextInt();
        }
        TwoSum ts=new TwoSum();
        int []as=ts.twoSum(arr,target);
        System.out.println(as[0]+" "+as[1]);
    }
    
}
