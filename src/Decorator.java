public class Decorator implements iCalculable {
    private CalculatorComplexNumber a;
    private Logger b;

    public Decorator(CalculatorComplexNumber a, Logger b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void sum(int argReal, int argImag) {
        b.log(String.format("запуск опирации: сумма Комплексных чисел"));
        a.sum(argReal, argImag);
    }

    @Override
    public void multi(int argReal, int argImag) {
        b.log(String.format("запуск опирации: умножение Комплексных чисел"));
        a.multi(argReal, argImag);
    }

    @Override
    public void divide(int argReal, int argImag) {
        b.log(String.format("запуск опирации: деление Комплексных чисел"));
        a.divide(argReal, argImag);
    }

    @Override
    public ComplexNumber getResult() {
        return a.getResult();
    }
    @Override
    public void firstPair(int argReal, int argImag) {
        a.firstPair(argReal, argImag);
        b.log(String.format("Первая пара чисел внесена в память"));
    }
    
    @Override
    public void zero() {
        b.log(String.format("Обнуление всех значений"));
        a.zero();
    }
    @Override
    public String toString() {
        return a.toString();
    }
}
