public class Decorator implements iCalculable {
    private CalculatorComplexNumber a;
    private Logger b;
    public Decorator(CalculatorComplexNumber a, Logger b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public iCalculable sum(int argReal, int argImag) {
        //int firstArg = a.getResult();
        //b.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, argReal, argImag));
        iCalculable result = a.sum(argReal, argImag);
        b.log(String.format("Вызова метода sum произошел"));
        return result;
    }
    @Override
    public iCalculable multi(int argReal, int argImag) {
        //int firstArg = a.getResult();
        //b.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, argReal, argImag));
        iCalculable result = a.multi(argReal, argImag);
        b.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public iCalculable divide(int argReal, int argImag) {
        //int firstArg = a.getResult();
        //b.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, argReal, argImag));
        iCalculable result = a.divide(argReal, argImag);
        b.log(String.format("Вызова метода divide произошел"));
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = a.getResult();
        b.log(String.format("Получение результата %d", result));
        return result;
    }
}
