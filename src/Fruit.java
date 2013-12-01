
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stud_17
 */
public class Fruit {
// закрытые поля:
    private int x=0;
   private int y=0;
// открытые поля (константы):   
public final int Red=0;
public final int Yellow=1;
public final int Green=2;
private int color=Red;
    
    public void Fruit(int number){
        if(color==Red){
            x+=number;
        }
        if(color==Yellow){
            y+=number;
        }
        if(color==Green){
            y+=number;
        }
    }
    public void Vegetable(int number){
        Fruit(number*(-1));
    }
    
    public ArrayList<Integer> getNumber(){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(x);
        number.add(y);
        return number;
    }
    
    
    public boolean setColor(int aColor){
        if(aColor==Red || aColor==Yellow || aColor==Green){
            this.color=aColor;
            return true;
        }else{
            System.out.println("Wrong color");
            return false;
        }
    }
    public int getColor(){
        return this.color;
    }  
}