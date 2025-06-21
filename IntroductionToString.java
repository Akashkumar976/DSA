import java.util.*;
public class IntroductionToString {
    public static void main(String args[])
{
    String s=new String("Akashkumar");
    System.out.println(s);
    System.out.println(s.contains("a"));
    System.out.println(s.endsWith("ar"));
    System.out.println(s.lastIndexOf('a'));
    System.out.println(s.getBytes());//for encoding purpoae
    System.out.println(s.indexOf("ak"));
    System.out.println(s.indexOf('a'));
    System.out.println(s.startsWith("Ak"));
    System.out.println(s.equalsIgnoreCase("AKASHKUMAR"));
    s="Hello World       Santosh Dugane"+100;
    System.out.println(s.replaceAll("\\s+"," "));
    // s.replaceAll("\\s+"," ");
    String [] arr=s.split("\\s+");
    System.out.println(arr[0]);
}}
