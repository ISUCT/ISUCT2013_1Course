/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.*;
 
public class Ccalendar{
    public static void main (String args []){

       Calendar c = Calendar.getInstance(); 
        c.set(2003,10,3,12,55);
        long day1 = c.getTimeInMillis();
        day1 += 1000*60*60;
 
        c.setTimeInMillis(day1);
        System.out.println("New Hour: " +c.get(c.HOUR_OF_DAY));
        c.add(c.DATE,10);
        System.out.println("Прибаляем 10 дней: " + c.getTime());
        c.roll(c.DATE,15);
        System.out.println("Прокрутить 15 дней: " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Установить первый день месяца: " + c.getTime());
    }
}
