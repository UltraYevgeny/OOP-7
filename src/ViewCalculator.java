import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int realFirstArg = promptInt("Введите вещественную часть первого аргумента: ");
            int imagFirstArg = promptInt("Введите мнимую часть первого аргумента: ");

            
            calculator.sum(realFirstArg, imagFirstArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);

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
                    System.out.printf("Результат:\nвещественная часть: %d и мнимая часть: %di\n"
                                , calculator.getResult().getRealArg()
                                , calculator.getResult().getImagArg());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                calculator.getResult().setRealArg(0);
                calculator.getResult().setImagArg(0);
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
