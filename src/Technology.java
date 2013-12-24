/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dns
 */
public abstract class Technology {
       String color;
    String capacity;
    int equipment;
    int[]use;
    int[]location;
   
    public abstract void  makeNoise();
    
    public void create(){
        System.out.println("Technology create");
    }
    public void stand(){
        System.out.println("Technology stand");
    }
    public void work(){
        System.out.println("Technology work");
    } 
}
