

public interface iCalculable {
    iCalculable sum(int argReal, int argImag);
    iCalculable multi(int argReal, int argImag);
    iCalculable divide(int argReal, int argImag);
    ComplexNumber getResult();
}
