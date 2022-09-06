import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int count =0;
        int chor=0;
        for(int i=0 ; i<n ; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            
            if(arr1[i]>0){
                count=count + arr1[i];
            }
            else if(arr1[i]<0){
               count=count+arr1[i];
               if(count<0){
                   chor = chor + 1;
                   count=0;
               }
            }
            
        }
        System.out.println(chor);
    }
}
