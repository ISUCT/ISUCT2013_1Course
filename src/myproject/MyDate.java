/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author stud_5
 */
public class MyDate {
    public static void main(String[] args) {
    Date a = new Date();
//    myCalendar.setTime(a);
    System.out.println(a);
    Calendar c = Calendar.getInstance();
    c.set(2013,2,1,9,10);
    System.out.println("Текущая дата " + c.getTime());
    long diff = (a.getTime()-c.getTimeInMillis());
    long day1 = c.getTimeInMillis();
    day1 += 1000*60*60;
    c.setTimeInMillis(day1);
    System.out.println("Новый час " + c.get(c.HOUR_OF_DAY));
    c.add(c.DATE, 35);
    System.out.println("Добавить 35 дней " + c.getTime());
    c.roll(c.DATE, 35);
    System.out.println("Прокрутить 35 дней " + c.getTime());
    c.set(c.DATE, 1);
    System.out.println("Установить дату в 1  " + c.getTime());
    
    System.out.println("Текущая дата " + diff);
    System.out.println("Текущая дата " + diff);
    }
}