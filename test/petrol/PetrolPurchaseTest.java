package petrol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetrolPurchaseTest {
    private PetrolPurchase petrolPurchase;

    @BeforeEach
    public void petrolPurchase() {petrolPurchase = new PetrolPurchase();}

    @Test
    public void test_getAndSetLocation () {
        petrolPurchase.setLocation("yaba");
        String result = petrolPurchase.getLocation();
        Assertions.assertNotNull(result);
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

}