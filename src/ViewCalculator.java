import java.util.Scanner;


/**
 * @apiNote Класс осуществляющий работу с пользователем
 * @apiNote ввод/вывод иформации, пользовательское меню
 * @apiNote Services класс
 */
public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        // ввод первой пары чисел для расчета
        while (true) {
            int realFirstArg = promptInt("Введите вещественную часть первого аргумента: ");
            int imagFirstArg = promptInt("Введите мнимую часть первого аргумента: ");

            calculator.firstPair(realFirstArg, imagFirstArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);

            // меню выбора операции с числами и ввод второй пары чисел для расчета
            // также вывод информации о заданных числах и результат расчета
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =) :  ");
                
                if (cmd.equals("+")) {
                    int argReal = promptInt("Введите второй вещественный аргумент: ");
                    int argImag = promptInt("Введите второй мнимый аргумент: ");
                    calculator.sum(argReal, argImag);
                    continue;
                }
                if (cmd.equals("*")) {
                    int argReal = promptInt("Введите второй вещественный аргумент: ");
                    int argImag = promptInt("Введите второй мнимый аргумент: ");
                    calculator.multi(argReal, argImag);
                    continue;
                }
                if (cmd.equals("/")) {
                    int argReal = promptInt("Введите второй вещественный аргумент: ");
                    int argImag = promptInt("Введите второй мнимый аргумент: ");
                    calculator.divide(argReal, argImag);
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println("----------------");
                    System.out.println("(Справка) вводные данные: ");
                    System.out.println(calculator);
                    System.out.println("----------------");
                    System.out.printf("Результат:\nвещественная часть: %d и мнимая часть: %di\n"
                                , calculator.getResult().getRealArg()
                                , calculator.getResult().getImagArg());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
