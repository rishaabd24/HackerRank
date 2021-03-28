import java.util.Scanner;
public class Solution {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char [] s1 = a.toCharArray();
        char [] s2 = b.toCharArray();
        if(a.length() != b.length())
          return false;
        int[] frequencies = new int[256];
        for (int i = 0; i < s1.length; i++) 
        {
          frequencies[s1[i] - 'a']++;
          frequencies[s2[i] - 'a']--;
        }

      for (int frequency : frequencies) {
          if (frequency != 0)
              return false;
      }
        return true;
    }
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
