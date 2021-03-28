import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh){
       Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double v = 0;
            double b1 = b;
            for(int j=0;j<n;j++)
            {
                v += (Math.pow(2, j)) * b1;
                int v1 = a+((int)v);
                System.out.print(v1+" ");    
            }
            System.out.println();
        }
        in.close();
    }
}
