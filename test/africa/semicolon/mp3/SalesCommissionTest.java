package africa.semicolon.mp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalesCommissionTest {
  private SalesCommission calculator;

    @BeforeEach
    void  allTestStartsWith(){
      calculator = new SalesCommission();
    }
    @Test
   void salesCommissionCalculatorCanBeCreated(){

     assertNotNull(calculator);
    }
    @Test
    void salesPersonWeeklyPay(){
        calculator.setWeeklyPay(200);
        assertEquals(200.0,calculator.getWeeklyPay());
    }
    @Test
    void itemsCanBeAddedToGiveGrossSales(){
        assertEquals(100, calculator.getTotalSales(20,10,30,40));
    }
    @Test
    void calculateSalesPersonGrossSales(){
        calculator.setGrossSales(4500);
        assertEquals(4500,calculator.getGrossSales());
    }
    @Test
    void salesCommissionCanBeCalculated(){
      calculator.salesCommission(4500);
      assertEquals(405.0000160932541,calculator.getSalesCommission());
    }
    @Test
   void salesPersonTotalEarningsCanBeCalculated(){
      calculator.setTotalEarnings(200.0,4500,405);
      assertEquals( 5105.0 , calculator.getTotalEarnings());
    }

}
