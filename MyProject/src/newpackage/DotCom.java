/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author метро
 */
public class DotCom {
    private ArrayList <String> locationCells;
        private String name;
        
        public void setLocatoinCells (ArrayList <String> loc) {
            locationCells = loc;
            
        }
        
        public void setName (String n) {
            name = n; 
        }
        
        public String checkYourself (String userInput) {
            String result = "Мимо";
            int index = locationCells.indexOf (userInput);
            if (index >=0) {
                locationCells.remove(index);
                
                if (locationCells.isEmpty ()) {
                    result = "Потопил";
                    System.out.println ("Ой! Вы потопили" + name + " : ( ");
                    
                } else {
                    result = "Попал";
                }
            }
            return result;
}
}
