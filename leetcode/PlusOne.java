package leetcode;
import java.util.Scanner;
import java.util.stream.IntStream;
public class PlusOne {
     public int[] plusOne(int[] digits) {
        int newdigit[]=new int[2];
         int x=digits[digits.length-1];
         int sizeofarray=digits.length-1;
         x+=1;
         int length=String.valueOf(x).length();
         int newarray[]=new int[sizeofarray+length];
         if(length==1){
             digits[digits.length-1]=x;
             return digits;
         }else{
             
              String s = String.join("", IntStream.of(digits).mapToObj(String::valueOf).toArray(String[]::new));
                int y=Integer.parseInt(s);
                y+=1;
                
             int length2=String.valueOf(x).length();
         
            int newarray2[]=new int[length2];
         
         for(int i=newarray.length-1;i>=0;i--){
              newarray2[i]=x%10;
             x=x/10;
         } 
             
             
             /*
             for( int i=0;i<sizeofarray;i++){
                 newarray[i]=digits[i];
             }
             int j=0;
             for(int i=newarray.length-1;j<length;j++){
                 newarray[i]=x%10;
                 x=x/10;
                 i--;
             } 
             */
         
       return newarray;  
         }
    } 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the value in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
                    
        }
        PlusOne po=new PlusOne();
        int brr[]=po.plusOne(arr);
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
        
    }
    
}
