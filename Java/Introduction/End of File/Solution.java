import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []s = new String[10000];
        int i = 0;
        while(true)
        {
            s[i] = sc.nextLine();
            String s1 = s[i];
            int n = s[i].length();
            if (!sc.hasNext())
            {
                break;
            }
            i++;  
        }
        for(int j=0;j<=i;j++)
        {
            System.out.println((j+1)+" " + s[j]);
        }
    }
}
