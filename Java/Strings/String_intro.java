import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int n1 = A.length();
        int n2 = B.length();
        int sum = n1 + n2;
        int compare = A.compareTo(B);
        String first1 = A.substring(0,1);
        String first2 = B.substring(0,1);
        String remain1 = A.substring(1,A.length());
        String remain2 = B.substring(1,B.length());
        first1 = first1.toUpperCase();
        first2 = first2.toUpperCase();
        A = first1+remain1;
        B = first2+remain2;
        if(compare>0)
        {
            System.out.println(sum);
            System.out.println("Yes");
            System.out.println(A+" "+B);
        }
        else
        {
            System.out.println(sum);
            System.out.println("No");
            System.out.println(A + " " + B);
        }
    }
}
