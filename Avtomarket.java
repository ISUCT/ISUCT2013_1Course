import java.util.ArrayList;

public class Avtomarket {
private int x=0;
private int y=0;
public final int bmw=0;
public final int audi=1;
private int price=keyboard;
    
   public void Shop1 (int total){
        if(price==bmw){
            x+=total;
        }
        if(price==audi){
            y+=total;
        }
    }
    
        public void Avtomarket2(int total){
        Avtomarket1(total*(-1));
    }
    
    public ArrayList<Integer> getTotal(){
        ArrayList<Integer> total = new ArrayList<Integer>();
        total.add(x);
        total.add(y);
        return total;
    }
    
    
    public boolean setPrice(int aPrice){
        if(aPrice==bmw || aPrice==audi){
            this.price=aPrice;
            return true;
        }
        else{
            System.out.println("Wrong price");
            return false;
        }
    }
    public int getPrice(){
        return this.price;
    }   
}
