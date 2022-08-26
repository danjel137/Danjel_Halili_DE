import org.junit.jupiter.api.Test;
import vendingMachine.VendingMachine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
    @Test
    public void changeIfInputIsBiggerThenPriceTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method=VendingMachine.class.getDeclaredMethod("change",double.class,double.class);
        method.setAccessible(true);
        VendingMachine vendingMachine=new VendingMachine();
        double subtract = (double) method.invoke(vendingMachine,5,0.7);
        assertEquals(4.3,subtract);
    }
    @Test
    public void changeIfInputIsSmallerThenPriceTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method=VendingMachine.class.getDeclaredMethod("change",double.class,double.class);
        method.setAccessible(true);
        VendingMachine vendingMachine=new VendingMachine();
        double subtract = (double) method.invoke(vendingMachine,0.7,5);
        assertEquals(0.7,subtract);
    }

}