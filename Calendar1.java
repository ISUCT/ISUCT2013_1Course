import java.util.*;
 
public class Calendar1{
public static void main (String args []){

Calendar c = Calendar.getInstance(); 
c.set(2013,09,5,12,35);
long day1 = c.getTimeInMillis();
day1 += 1000*60*60;
 
c.setTimeInMillis(day1);
System.out.println("Новый час: " +c.get(c.HOUR_OF_DAY));
c.add(c.DATE,20);
System.out.println("Добавляем 27 дней: " + c.getTime());
c.roll(c.DATE,35);
System.out.println("Прокрутить 35 дней: " + c.getTime());
c.set(c.DATE, 1);
System.out.println("Устанавите дату в значении 1: " + c.getTime());
    }
}
