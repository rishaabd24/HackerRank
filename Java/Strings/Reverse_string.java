import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String rev = "";
    int n = A.length();
    for ( int i =n - 1; i >= 0; i-- )  
         rev = rev + A.charAt(i);
    if(A.equals(rev))
      System.out.println("Yes");
    else
      System.out.println("No");
    }
}
