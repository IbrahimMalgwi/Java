package petrol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {
    private PetrolPurchase petrolPurchase;

    @BeforeEach
    public void petrolPurchase() {petrolPurchase = new PetrolPurchase("yaba");}

    @Test
    public void test_getAndSetLocation () {
        petrolPurchase.getLocation();
        assertEquals(yaba, );
    }

    @Test
    public void test_getAndSetTypeOfPetrol(){
        petrolPurchase.setTypeOfPetrol("Diesel");
        String result = petrolPurchase.getTypeOfPetrol();
        Assertions.assertNotNull(result);
    }

    @Test
    public void test_getAndSetPrice(){
        petrolPurchase.setPrice(200.00);
        double result = petrolPurchase.getPrice();
        Assertions.assertNotNull(result);
    }
    @Test
    public void test_getAndSetQuantity(){
        petrolPurchase.setQuantity(20);
        int result = petrolPurchase.getQuantity();
        Assertions.assertNotNull(result);
    }

    @Test
    public void test_setAndGetDiscount(){
        petrolPurchase.setDiscount(20.5);
        double result = petrolPurchase.getDiscount();
        Assertions.assertNotNull(result);
    }

}