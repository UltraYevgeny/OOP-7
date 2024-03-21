/**
 * @author
 * @version 2.1
 * @apiNote
 */
public class App {
    public static void main(String[] args) throws Exception {
      //iCalculable calc = new CalculatorComplexNumber();

      iCalculable decorator = new Decorator(new CalculatorComplexNumber(), 
                                             new Logger());

      ViewCalculator view = new ViewCalculator(decorator);
      //ViewCalculator view = new ViewCalculator(calc);
      view.run();
    }
}
