import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []s = new String[3];
        int []x = new int[3];
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
                
            s[i]=sc.next();
            x[i]=sc.nextInt();
        }
        for(int j=0;j<3;j++)
        {
            System.out.printf("%-15s%03d \n",s[j],x[j]);
        }
        System.out.println("================================");
    }
}




