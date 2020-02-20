package String;
import java.util.Scanner;
public class Exp8_prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=32;
        Scanner scan=new Scanner(System.in);
           System.out.println(" enter a word = ");
         String txt=scan.nextLine();
         for(int i=0;i<txt.length();i++)
 {
              char y= txt.charAt(i);
               int code=y;
               code=code-x;
            char c=(char)code;
            System.out.print(""+c);
	}
}
}
