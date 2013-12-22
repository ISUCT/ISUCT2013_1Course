/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acdc;

/**
 *
 * @author 176
 */
public abstract class ACDC {
    String picture;
    String food;
    int hunger;
    int[]boundaries;
    int[]location;
    public abstract void makeNoize();
    
    public void eat(){
        System.out.println("Animal eat");
    }
    public void sleep(){
        System.out.println("Animal sleep");
    }
    public void drink(){
        System.out.println("Animal roam");
    }
} 


   