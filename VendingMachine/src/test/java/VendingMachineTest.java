import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
    @Test
    public void change(){
        var v=new VendingMachine();

        assertEquals(4.3,v.change(5,0.7));
    }

    @Test
    public void getFirstPartChangeAndSecondChange(){

        int []vector=new int[]{0,1,0,1,0,4};
        assertArrayEquals(vector, VendingMachine.getFirstPartChangeAndSecondChange(400,30));

    }
    @Test
    public void returnVector(){
        assertEquals(0,VendingMachine.returnVector());
    }
}