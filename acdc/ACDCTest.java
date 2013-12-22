/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acdc;
import java.util.ArrayList;
/**
 *
 * @author 176
 */
public class ACDCTest {
    public static void main(String[] args){
    
        Johnson mrJohnson = new Johnson();
        Angus  mrAngus = new Angus ();
    
  ArrayList<ACDC> RokersList = new ArrayList<ACDC>();
  RokersList.add(mrJohnson);
  RokersList.add(mrAngus);
  
  for(ACDC Rokers :RokersList ){
      Rokers.makeNoize();
  }
  ArrayList<Vokals> vokalsList = new ArrayList<Vokals>();
  vokalsList.add(mrJohnson);
   vokalsList.get(0).play();
  
   ArrayList<Guitar> guitarList = new ArrayList<Guitar>();
   guitarList.add(mrAngus);
   guitarList.get(0).play();
   
   System.out.println(mrJohnson);
        System.out.println(mrAngus);
}
}