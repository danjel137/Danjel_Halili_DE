import org.junit.jupiter.api.Test;
import vendingMachine.VendingMachine;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    @Test
    public void returnChangeAtVendingMachineInCoins(){

        int []vector=new int[]{0,1,0,1,0,4};
        assertArrayEquals(vector, VendingMachine.getFirstPartChangeAndSecondChange(400,30));

    }

}