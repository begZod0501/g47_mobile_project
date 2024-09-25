


package Lesson_6.Calendar;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class Kalendar {
        static Scanner scanner = new Scanner(System.in);


        public static void main(String[] args) {
            System.out.print(" sana  (dd/MM/yyyy) : ");
            String strData = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(strData, formatter);
            int Year = date.getYear();
            int month = date.getMonthValue();
            int day = date.getDayOfMonth();
            kalendar(Year, month, day);

        }


        static void kalendar(int year, int month, int day) {

            YearMonth yearMonth = YearMonth.of(year, month);

            LocalDate firstDay = yearMonth.atDay(1);
            int LastDay = yearMonth.lengthOfMonth();

            DayOfWeek dayOfWeek = firstDay.getDayOfWeek();
            int firstDayofweek = dayOfWeek.getValue();

            System.out.println("Du    Se    Chor    Pay    Juma    Shan    Yak");

            for (int i = 1; i < firstDayofweek; i++) {
                System.out.print("    ");
            }


            for (int kun = 1; kun <= LastDay; kun++) {


                if (kun == day) {
                    System.out.printf("%s       ", kun);
                } else {
                    System.out.printf("%s       ", kun);
                }

                if ((kun + firstDayofweek - 1) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();

        }


    }
