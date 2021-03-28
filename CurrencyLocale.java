import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyLocale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String france = nf1.format(payment);
        String us = nf3.format(payment);
        String china = nf2.format(payment);
        String india = nf4.format(payment);

        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}