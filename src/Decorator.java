public class Decorator implements iCalculable {
    private CalculatorComplexNumber a;
    private Logger b;
    public Decorator(CalculatorComplexNumber a, Logger b) {
        this.a = a;
        this.b = b;

    }
    @Override
    public void sum(int argReal, int argImag) {
        //int firstArg = a.getResult();
        //b.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg, argReal, argImag));
        a.sum(argReal, argImag);
        b.log(String.format("Вызова метода sum произошел"));

    }
    @Override
    public void multi(int argReal, int argImag) {
        //int firstArg = a.getResult();
        //b.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, argReal, argImag));
        a.multi(argReal, argImag);
        b.log(String.format("Вызова метода multi произошел"));
    }

    @Override
    public void divide(int argReal, int argImag) {
        //int firstArg = a.getResult();
        //b.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, argReal, argImag));
        a.divide(argReal, argImag);
        b.log(String.format("Вызова метода divide произошел"));
    }

    @Override
    public ComplexNumber getResult() {
        b.log(String.format("Получение результата!"));
        return a.getResult();
    }
}
