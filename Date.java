import java.util.*;

public class Date {

public static void main(String[] args) {
java.util.Date DateAndTime = new java.util.Date();
java.sql.Date Date = new java.sql.Date(DateAndTime.getTime());
System.out.println("Дата и Время: " + DateAndTime);
System.out.println("Другой вид Даты: " + Date);
  }
}
