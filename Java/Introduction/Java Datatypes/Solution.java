import java.util.*;
import java.io.*;
public class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                {
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if((x>=-32768 && x<=-129)|(x>=128&&x<=32767))
                {
                    System.out.println("* short\n* int\n* long");
                }
                else if((x>=-2147483648 && x<=-32769)|(x>=32768 && x<=2147483647))
                {
                    System.out.println("* int\n* long");
                }
                else
                {
                    System.out.println("* long");                    
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
