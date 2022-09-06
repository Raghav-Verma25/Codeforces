import java.util.Scanner;
public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,5,10,20,100};
        int target = sc.nextInt();
        int len = arr1.length;
        int sum =0;
        int count =0;
        for(int i = len -1 ; i>=0 ; i-- ){
            sum = sum + arr1[i];
            count++;
            if(sum  < target){
                i++;
            }
            else if(sum == target){
                System.out.println(count);
            }
            else if( sum > target){
                sum = sum - arr1[i];
                count--;
            }
        }
    }
}
