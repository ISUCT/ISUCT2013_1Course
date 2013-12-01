import java.util.ArrayList;

public class Shop {
    private int x=0;
    private int y=0;
    public final int keyboard=0;
    public final int mouse=1;
    private int price=keyboard;
    
    public void Shop1 (int total){
        if(price==keyboard){
            x+=total;
        }
        if(price==mouse){
            y+=total;
        }
    }
    
        public void Shop2(int total){
        Shop1(total*(-1));
    }
    
    public ArrayList<Integer> getTotal(){
        ArrayList<Integer> total = new ArrayList<Integer>();
        total.add(x);
        total.add(y);
        return total;
    }
    
    
    public boolean setPrice(int aPrice){
        if(aPrice==keyboard || aPrice==mouse){
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