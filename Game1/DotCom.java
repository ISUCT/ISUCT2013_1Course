/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Game1;
import java.util.*;
/**
 *
 * @author stud_17
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    
    public void setLocationCells(ArrayList<String> loc){
    locationCells = loc;
    }
    
    public void setName(String n){
    name = n;
    }
    
    public String checkYourself(String userInput){
    String result = "Мимо";
    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
        locationCells.remove(index);
        
        if(locationCells.isEmpty()) {
            result = "Потопил";
            System.out.println("Вы потопили" + name);   
        }else{
            result = "Попал";
        }
    }
    return result;
    }
}