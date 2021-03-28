import java.util.Scanner;
import java.util.regex.*;
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int test = Integer.parseInt(in.nextLine());
        while (test > 0) 
        {
            String pattern = in.nextLine();
            try
            {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException exception)
            {
                System.out.println("Invalid");
            }
            test--;
        }
        in.close();
	}
}
