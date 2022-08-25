import org.junit.jupiter.api.Test;
import vendingMachine.VendingMachine;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    @Test
    public void productPriceLowerThenIInsertedMoney_returnsChange(){

        int []vector=new int[]{0,1,0,1,0,4};
        assertArrayEquals(vector, VendingMachine.getFirstPartChangeAndSecondChange(400,30));//5   0.7

    }
    @Test
    public void productPriceHighThenIInsertedMoney_returnsChange(){

        int []vector=new int[]{0,0,2,0,1,0};
        assertArrayEquals(vector, VendingMachine.getFirstPartChangeAndSecondChange(70,0));//0.7   5

    }

}