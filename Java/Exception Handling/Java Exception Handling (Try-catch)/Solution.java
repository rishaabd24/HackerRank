import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);        
        }
        catch(InputMismatchException e){
             System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e1){
             System.out.println(e1.getClass().getName()+": / by zero");
        }
    }
}
