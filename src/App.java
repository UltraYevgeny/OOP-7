/**
 * @author Пинжин Евгений Иванович
 * @version 2.2
 * @apiNote Программа для подсчета комплексных чисел
 * @apiNote выполняет операции: сложение, умножение и деление
 * @apiNote клиентский класс
 */
public class App {
    public static void main(String[] args) throws Exception {
      //iCalculable calc = new CalculatorComplexNumber();

      // Декоратор введен для того чтобы "логировать" операции колькулятора
      iCalculable decorator = new Decorator(new CalculatorComplexNumber(), 
                                             new Logger());

      ViewCalculator view = new ViewCalculator(decorator);
      
      // или без декоратора
      //ViewCalculator view = new ViewCalculator(calc);
      
      // запуск класса ViewCalculator через метод run
      view.run();
    }
}
