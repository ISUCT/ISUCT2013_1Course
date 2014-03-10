/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * DateAndTime
 */

import java.util.*;

public class Date {

  public static void main(String[] args) {
    java.util.Date DateAndTime = new java.util.Date();
    java.sql.Date Date = new java.sql.Date(DateAndTime.getTime());
    System.out.println("Время и дата: " + DateAndTime);
    System.out.println("Другой вид даты: " + Date);
  }
}

