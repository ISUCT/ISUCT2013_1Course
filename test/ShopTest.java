import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest{

    @Test
    public void testShop1() {
        System.out.println("Shop1");
        int total = 3;
        Shop instance = new Shop();
        instance.Shop1(total);
        instance.setPrice(instance.keyboard);
        assertEquals(3, instance.getTotal().get(0),0);

    }

    @Test
    public void testShop2() {
        System.out.println("Shop2");
        int total = 5;
        Shop instance = new Shop();
        instance.Shop2(total);
        instance.setPrice(instance.keyboard);
        assertEquals(5, instance.getTotal().get(1),0);

    }

    @Test
    public void testSetGetPrice() {
        System.out.println("Set and Get Price");
        Shop instance = new Shop();
        int aPrice = instance.keyboard;
        assertEquals(true,instance.setPrice(aPrice));
        assertEquals(instance.keyboard,instance.getPrice());   
        
        assertEquals(true,instance.setPrice(instance.mouse));
        assertEquals(instance.mouse,instance.getPrice());
        
        assertEquals(false,instance.setPrice(30));
    }
}