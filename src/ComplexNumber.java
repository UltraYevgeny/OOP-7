
/**
 * @apiNote экземпляры этого класса содержат пару чисел - вещественное и мнимое
 * @apiNote Domain класс
 */
public class ComplexNumber{
    private int realArg;
    private int imagArg;

    public void zero(){
        realArg = 0;
        imagArg = 0;
    }

    public int getRealArg() {
        return realArg;
    }
    public void setRealArg(int realArg) {
        this.realArg = realArg;
    }
    public int getImagArg() {
        return imagArg;
    }
    public void setImagArg(int imagArg) {
        this.imagArg = imagArg;
    }
}
