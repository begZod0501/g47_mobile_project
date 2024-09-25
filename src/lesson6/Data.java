package lesson6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        LocalDate today=LocalDate.now();

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatterDate= today.format(formatter);
        System.out.println("Bugungi sana  = " + formatterDate);

        System.out.println();

//        LocalDateTime localDateTime=LocalDateTime.now();
//
//        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
//
//        String FormatterDateTime=localDateTime.format(formatter1);
//
//        System.out.println("FormatterDateTime = " + FormatterDateTime);

//         LocalDateTime now=LocalDateTime.now();
//
//         DateTimeFormatter dateTimeFormatter=new DateTimeFormatterBuilder()
//                 .appendValue(ChronoField.YEAR,4).appendLiteral(' ')
//                 .appendText(ChronoField.MONTH_OF_YEAR,TextStyle.FULL)
//                 .appendLiteral(' ').appendValue(ChronoField.HOUR_OF_DAY,2)
//                 .appendLiteral(':').appendValue(ChronoField.MINUTE_OF_HOUR,2)
//                 .appendLiteral(':').appendValue(ChronoField.SECOND_OF_MINUTE,2)
//                 .toFormatter();
//
//            String formattedDateTime=now.format(dateTimeFormatter);
//        System.out.println("formattedDateTime = " + formattedDateTime);

//        Scanner scanner=new Scanner(System.in);
//        DateTimeFormatter formatter2= new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR,4).appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL).appendValue(ChronoField.DAY_OF_MONTH,2).toFormatter();
//
//        System.out.println("Iltimos sanani kiriting (YYYY/MM/DD) : ");
//        String inputDate=scanner.nextLine();
//
//        LocalDate date= LocalDate.parse(inputDate);
//
//        System.out.println("date.format(formatter2) = " + date.format(formatter2));


        ZonedDateTime zonedDateTime=ZonedDateTime.now();

        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDateTime=zonedDateTime.format(dateTimeFormatter);
        System.out.println("formattedDateTime = " + formattedDateTime);

        ZonedDateTime tokyoTime=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("tokyoTime = " + tokyoTime);


    }

}
