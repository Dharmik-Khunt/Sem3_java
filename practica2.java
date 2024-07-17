
import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        while (true) {
            System.out.print("enter a month(1-12):");
            int month = n.nextInt();
            System.out.print("enter a year:");
            int year = n.nextInt();
            if (month < 1 && 12 > month) {
                System.out.println("invalid month enter a value between 1-12");
                continue;
            }
            if (year < 1) {
                System.out.println("invalid year ");
                continue;

            }
            printcalender(month, year);
            System.out.print(" do you want another month enter yes");
            String r = n.nextLine();
            if (!r.equalsIgnoreCase("yes")) {
                break;
            }

        }
        n.close();
    }

    public static void printcalender(int month, int year) {
        int[] daysmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isleapyear(year)) {
            daysmonth[1] = 29;
        }
        String[] monthname = {"jan", "fab", "march", "april", "june", "july", "aug", "sep", "out", "nov", "dec"};
        System.out.println(" " + monthname[month - 1] + " " + year);
        int firstdaymonth = firstdaymonth(month, year);
        System.out.println("  sun    mon    tue    wen   thu   fri   sat");
        for (int i = 0; i < firstdaymonth; i++) {
            System.out.printf("      ");
        }
        for (int i = 1; i <= daysmonth[month - 1]; i++) {
            System.out.printf("%6d", i);
            if ((firstdaymonth + i) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");

    }

    public static boolean isleapyear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;

    }

    public static int firstdaymonth(int month, int year) {
        int q = 1;
        if (month == 1 || month == 2) {
            month = month + 12;
        }
        int K = year % 100;
        int j = year / 100;
        int h = (q + (13 * (month + 1) / 5) + K + (K / 4) + (j / 4) + 5 * j) % 7;
        return (h + 6) % 7;
    }
}
