import java.util.*;
import java.time.*;
public class q1 {
    public static String findDay(int month, int day, int year) {
        LocalDate d = LocalDate.of(year, month, day);
        String s1 = d.getDayOfWeek().name();
        return s1;
    }

    public static void main(String[] args) {
        String s = q1.findDay(8,5,2015);
        System.out.println(s);
    }
}
