import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarApplicationTest {
    @Test
    public void applyDiscountPercentage(){
        Car_Question313 car3 = new Car_Question313("honda", "2001", 50000.00);
        Car_Question313 car4 = new Car_Question313("honda", "2001", 150000.00);
        car3.applyDiscount(20.00);
        car4.applyDiscount(15.00);
        assertEquals(40000.00,car3.getPrice());
        assertEquals(127500.00,car4.getPrice());
    }

}
