
/**
 * @apiNote Controllers класс
 */
public interface iCalculable {
    void firstPair(int argReal, int argImag);
    void sum(int argReal, int argImag);
    void multi(int argReal, int argImag);
    void divide(int argReal, int argImag);
    ComplexNumber getResult();
}
