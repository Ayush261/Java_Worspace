package String;
import java.util.Scanner;
public class Exp8_prog1 {

	public static void main(String[] args) {
		int str1,str2,last=0;
      Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string:");
         String s1=scan.next();
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter searching string:");
        String s2=scan1.next();
         str1=s1.length();
         str2=s2.length();
        for(int i=0;i<=(str1-str2);i++)
           {
        	if(s1.substring(i,str2+i).equals(s2))
          {
          if(last==0)
         System.out.println("first occurence is at position :"+(i+1));
         last=i+1;
        }
  }
             if(last!=0) 
           System.out.println("last occurence is at position :"+last); 
        else
          System.out.println("the string is not found");
						}
}

