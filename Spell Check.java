import java.util.Scanner;
public class solution{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
      while(test!=0){
      String str2 = "Timru";
      int n = sc.nextInt();
      String str = sc.next();
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      String new_str= new String(charArray);
      if(new_str.equals(str2)){
          System.out.println("YES");
      }
      else{
          System.out.println("No");
      }
      test--;
      }
        
    }
}
