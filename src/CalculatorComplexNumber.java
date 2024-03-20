public final class CalculatorComplexNumber implements iCalculable {
    private ComplexNumber complexNumber = new ComplexNumber();

    public CalculatorComplexNumber(int primaryRealArg, int primaryImagArg) {
        complexNumber.setRealArg(primaryRealArg);
        complexNumber.setImagArg(primaryImagArg);
    }

    @Override
    public void sum(int argReal, int argImag) {
        complexNumber.setRealArg(complexNumber.getRealArg() + argReal);
        complexNumber.setImagArg(complexNumber.getImagArg() + argImag);
    }

    @Override
    public void multi(int argReal, int argImag) {
        complexNumber.setRealArg(complexNumber.getRealArg() * argReal);
        complexNumber.setImagArg(complexNumber.getImagArg() * argImag);
    }

    @Override
    public void divide(int argReal, int argImag) {
        complexNumber.setRealArg(complexNumber.getRealArg() / argReal);
        complexNumber.setImagArg(complexNumber.getImagArg() / argImag);
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }
}