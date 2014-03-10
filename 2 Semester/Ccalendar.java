/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l
 */

import java.util.*;
 
public class Ccalendar{
    public static void main (String args []){

       Calendar c = Calendar.getInstance(); 
        c.set(2012,07,7,10,35);
        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
 
        c.setTimeInMillis(day1);
        System.out.println("Новый час: " +c.get(c.HOUR_OF_DAY));
        c.add(c.DATE,20);
        System.out.println("Добывляем 20 дней: " + c.getTime());
        c.roll(c.DATE,35);
        System.out.println("Прокрутить 35 дней: " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Устанавливаем месяц первого числа: " + c.getTime());
    }
}
