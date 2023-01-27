/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	    String string="3141592653589793238462643383279";
		int tq=sc.nextInt();
		while(tq-->0){
		    String str11 = sc.next();
		    int count=0;
		    char[] charr1 = new char[string.length()];
            char[] charr2 = new char[str11.length()];
              for (int i = 0; i < string.length(); i++) {
            charr1[i] = string.charAt(i);
        }
         for (int i = 0; i < str11.length(); i++) {
            charr2[i] = str11.charAt(i);
        }
        if(charr2[0]=='3'){
            for(int i =0 ; i<str11.length();i++){
                if(charr1[i]==charr2[i]){
                    count++;
                }
                else{
                    break;
                }
            }
        }
            System.out.println(count);
	}
}

}
