package by.ecp;
import org.junit.Assert;
import org.junit.Test;
public class AppTest {
   @Test
   public void  testCalcAdd(){
      Calculator calculator = new Calculator();
      Assert.assertEquals("Некорректно сложение!", 4.0, calculator.add(1.0, 3.0), 0.00001);
   }

   @Test
   public  void  testCalcDivide(){
      Calculator calculator = new Calculator();
      Assert.assertEquals("Некорректно деление!", 2.0, calculator.divide(4.0, 2.0), 0.00001);
   }
   @Test
   public  void  testCalcSubtract(){
      Calculator calculator = new Calculator();
      Assert.assertEquals("Некорректно вычитание!", 2.0, calculator.divide(4.0, 2.0), 0.00001);
   }
   @Test
   public  void  testCalcMult(){
      Calculator calculator = new Calculator();
      Assert.assertEquals("Некорректно умножение!", 8.0, calculator.multiply(4.0, 2.0), 0.00001);
   }

//   @Test(expected = ArithmeticException.class)
//   public void testDivision(){
//      Calculator calculator = new Calculator();
//      calculator.divide(1, 0);
//   }
}
