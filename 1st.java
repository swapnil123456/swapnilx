import java.util.*;
import java.io.*;
import java.util.regex.*;
public class lust
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=ob.next();
String t=ob.next();
char ch[]=t.toCharArray();int c=0;
for(int i=0;i<s.length();i++)
{
int x=Arrays.binarySearch(ch,s.charAt(i));
if(x>=0)
{c++;
s=s.substring(x);
i=0;
}
}
}

}
