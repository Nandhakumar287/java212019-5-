import java.io.*;
import java.util.*;
  public class AsciiAdd{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The String");
      String str=sc.next();
      int c;
      String str1=" ";
        for(int i=0;i<str.length();i++)
          {
            c=(int)str.charAt(i);
			c=c+3;
			char a=(char)c;
            str1=str1+a;
            
           }
		   System.out.println("ANSWER:"+str1);
            
     }
  }   
            
