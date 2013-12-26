/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author dns
 */
public class TechnologyTest extends TestCase {
    public static void main(String[] args){
       
        
        LadaCar aLadaCar = new LadaCar();
//        aLadaCar.makeNoize();
        
        CherieCar aCherieCar = new CherieCar();
//        aCherieCar.makeNoize();
        
        Machine aMachine = new Machine();
//        aMachine.makeNoize();
        
        
        ArrayList<Technology> technologyList= new ArrayList<Technology>();
        technologyList.add(aLadaCar);
        technologyList.add(aCherieCar);
        technologyList.add(aMachine);
        
        for (Technology technology : technologyList){
            technology.makeNoise();
        }
        
        ArrayList<Car> carList= new ArrayList<Car>();
        carList.add(aLadaCar);
        carList.get(0).accelerate();
        
        System.out.println(aLadaCar);
        System.out.println(aCherieCar);  
    }   
}