public final class CalculatorComplexNumber implements iCalculable {
    private ComplexNumber complexNumber = new ComplexNumber();

    public CalculatorComplexNumber(int primaryRealArg, int primaryImagArg) {
        complexNumber.setRealArg(primaryRealArg);
        complexNumber.setImagArg(primaryImagArg);
    }

    @Override
    public iCalculable sum(int argReal, int argImag) {
        complexNumber.setRealArg(complexNumber.getRealArg() + argReal);
        complexNumber.setImagArg(complexNumber.getImagArg() + argImag);
        return this;
    }

    @Override
    public iCalculable multi(int argReal, int argImag) {
        complexNumber.setRealArg(complexNumber.getRealArg() * argReal);
        complexNumber.setImagArg(complexNumber.getImagArg() * argImag);
        return this;
    }

    @Override
    public iCalculable divide(int argReal, int argImag) {
        complexNumber.setRealArg(complexNumber.getRealArg() / argReal);
        complexNumber.setImagArg(complexNumber.getImagArg() / argImag);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }
}
