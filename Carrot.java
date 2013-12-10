import java.util.ArrayList;



/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */


/**

 *

  * @author 176

 */

public class Carrot {

    private int x=0;

   private int y=0;

    public final int X_DIRECTION=1;

    public final int Y_DIRECTION=0;

    private int direction=X_DIRECTION;

   

    public void moveFvd(int distance){
    
        moveBvd(distance*(1));
       
    }

    public void moveBvd(int distance){

         if(direction==Y_DIRECTION){

            y+=distance;

        }

        if(direction==X_DIRECTION){

            x+=distance;

        }

    }

    public void turn(){

        if(direction==X_DIRECTION){

            direction=Y_DIRECTION;

        }

        if(direction==Y_DIRECTION){

            direction=X_DIRECTION;

       }

   }

    

   public ArrayList<Integer> getCoords(){

       ArrayList<Integer> coords = new ArrayList<Integer>();

        coords.add(x);

        coords.add(y);

        return coords;

    }

    

    

    public boolean setDirection(int aDirection){

        if(aDirection==X_DIRECTION || aDirection==Y_DIRECTION){

            this.direction=aDirection;

            return true;

        }else{

            System.out.println("Wrong direction");

            return false;

        }

    }

    public int getDirection(){

        return this.direction;

   }

    

   

    

    

}