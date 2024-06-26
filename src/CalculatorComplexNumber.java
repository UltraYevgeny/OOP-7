
/**
 * @apiNote класс проводит матиматические расчеты с введенными числами
 * @apiNote и выдет результат
 * @apiNote Domain класс
 */
public final class CalculatorComplexNumber implements iCalculable {
    // первая пара введенных пользователем чисел
    private ComplexNumber complexNumberFirst = new ComplexNumber();
    // вторая пара введенных пользователем чисел
    private ComplexNumber complexNumberSecond = new ComplexNumber();
    // пара чисел полученных в хде матиматической операции
    private ComplexNumber complexNumberResult = new ComplexNumber();
    
    public CalculatorComplexNumber(){
    }

    @Override
    public void firstPair(int argReal, int argImag) {
        complexNumberFirst.setRealArg(argReal);
        complexNumberFirst.setImagArg(argImag);
    }
    private void secondPair(int argReal, int argImag){
        complexNumberSecond.setRealArg(argReal);
        complexNumberSecond.setImagArg(argImag);
    }

    @Override
    public void sum(int argReal, int argImag) {
        secondPair(argReal, argImag);
        complexNumberResult.setRealArg(complexNumberFirst.getRealArg() + argReal);
        complexNumberResult.setImagArg(complexNumberFirst.getImagArg() + argImag);
    }

    @Override
    public void multi(int argReal, int argImag) {
        secondPair(argReal, argImag);
        // a, b, c, d - введены для удобства записи математической формулы
        int a = complexNumberFirst.getRealArg(); int b = complexNumberFirst.getImagArg();
        int c = argReal; int d = argImag;
        complexNumberResult.setRealArg(a*c - b*d);
        complexNumberResult.setImagArg(b*c + a*d);
    }

    @Override
    public void divide(int argReal, int argImag) {
        secondPair(argReal, argImag);
        // a, b, c, d - введены для удобства записи математической формулы
        int a = complexNumberFirst.getRealArg(); int b = complexNumberFirst.getImagArg();
        int c = argReal; int d = argImag;
        complexNumberResult.setRealArg((a*c + b*d)/(c*c + d*d));
        complexNumberResult.setImagArg((b*c - a*d)/(c*c + d*d));
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumberResult;
    }

    @Override
    public String toString() {
        return "первое вещественное значение: " + complexNumberFirst.getRealArg()
            + "\nпервое мнимое значение: " + complexNumberFirst.getImagArg()
            + "\nвторое вещественное значение: " + complexNumberSecond.getRealArg()
            + "\nвторое мнимое значение: " + complexNumberSecond.getImagArg();
    }

}