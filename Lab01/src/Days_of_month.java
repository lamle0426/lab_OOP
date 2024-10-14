// Lab 01: Environment Setup and Java Basics
// Ex4: Write a program to display the number of days of a month, which is entered by users (both month and year).
// If it is an invalid month/year, ask the user to enter again.
//- The user can either enter a month in its full name, abbreviation, in 3 letters, or in number.
//        To illustrate, the valid inputs of January are January, Jan., Jan, and 1.
//- The user must enter a year in a non-negative number and enter all the digits.
//        For instance, the valid inputs of year 1999 is only 1999, but not 99, “one thousand nine hundred ninety-nine”, or anything else.
//- A year is either a common year of 365 days or a leap year of 366 days.
//        Every year that is divisible by 4 is a leap year, except for years that are divisible by 100, but not by 400.
//        For instance, year 1800 is not a leap year, yet year 2000 is a leap year. In a year, there are twelve months, which are listed in order as follows.

import javax.swing.JOptionPane;

public class Days_of_month {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidYear(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public static int getValidYear() {
        String inputYear;
        int year = -1;

        while (year < 0) {
            inputYear = JOptionPane.showInputDialog(null, "Enter the year:");
            if (inputYear == null) {
                JOptionPane.showMessageDialog(null, "Program cancelled");
                System.exit(0);
            }

            if (isValidYear(inputYear)) year = Integer.parseInt(inputYear);
            else {
                JOptionPane.showMessageDialog(null,
                        "Invalid year. Please enter a valid year in a non-negative number and enter all the digits.",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return year;
    }

    public static boolean isValidMonth(String month) {
        String[] validMonths = {
                "January", "Jan", "Jan.", "1",
                "February", "Feb", "Feb.", "2",
                "March", "Mar", "Mar.", "3",
                "April", "Apr", "Apr.", "4",
                "May", "5",
                "June", "Jun", "6",
                "July", "Jul", "7",
                "August", "Aug", "Aug.", "8",
                "September", "Sep", "Sept.", "9",
                "October", "Oct", "Oct.", "10",
                "November", "Nov", "Nov.", "11",
                "December", "Dec", "Dec.", "12"
        };

        for (String validMonth : validMonths) {
            if (month.equals(validMonth)) return true;
        }
        return false;
    }

    public static String getValidMonth() {
        String month;

        while (true) {
            month = JOptionPane.showInputDialog(null, "Enter the month:");

            if (month == null) {
                JOptionPane.showMessageDialog(null, "Program cancelled");
                System.exit(0);
            }

            if (isValidMonth(month)) return month;
            else {
                JOptionPane.showMessageDialog(null,
                        "Invalid month: '" + month + "'. Please enter a valid month (January to December)",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static int getDaysInMonth(String month, int year) {
        return switch (month) {
            case "January", "Jan", "Jan.", "1" -> 31;
            case "February", "Feb", "Feb.", "2" -> isLeapYear(year) ? 29 : 28;
            case "March", "Mar", "Mar.", "3" -> 31;
            case "April", "Apr", "Apr.", "4" -> 30;
            case "May", "5" -> 31;
            case "June", "Jun", "6" -> 30;
            case "July", "Jul", "7" -> 31;
            case "August", "Aug", "Aug.", "8" -> 31;
            case "September", "Sep", "Sept.", "9" -> 30;
            case "October", "Oct", "Oct.", "10" -> 31;
            case "November", "Nov", "Nov.", "11" -> 30;
            case "December", "Dec", "Dec.", "12" -> 31;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int year = getValidYear();
        String month = getValidMonth();

        int days = getDaysInMonth(month, year);
        JOptionPane.showMessageDialog(null,
                "Number of days in the month " + month + " of the year " + year + ": " + days + " days");
    }
}
