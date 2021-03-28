import java.util.Scanner;
public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String s1 = s.substring(0, k);
        String smallest = s1;
        String largest = s1;
        for(int i=k;i<s.length();i++)
        {
            s1 = s1.substring(1,k) + s.charAt(i);
            if(largest.compareTo(s1)<0)
              largest = s1;
            if(smallest.compareTo(s1)>0)
              smallest = s1;  
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
