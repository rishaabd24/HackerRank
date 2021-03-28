import java.io.*;
import java.util.*;

public class StringToken {
    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = removeLeadingNonLetters(s);
        if (s.length() > 400000)
            return;
        else if(s.length()==0)
        {
            System.out.println("0");
            return;
        }
        else
        {
            String[] s1 = s.split("[^a-zA-Z]+");           
            int n = s1.length;
            System.out.println(n);
            for (String a : s1)
                System.out.println(a);
        }
    }
}
