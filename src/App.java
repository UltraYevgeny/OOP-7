public class App {
    public static void main(String[] args) throws Exception {
      iCalculable calc = new CalculatorComplexNumber(0,0);

       //iCalculable decorator = new Decorator(new Calculator(0, 0), 
       //                                       new Logger());

       //ViewCalculator view = new ViewCalculator(decorator);
       ViewCalculator view = new ViewCalculator(calc);
       view.run();
    }
}
