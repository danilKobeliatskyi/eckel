package danil.chapter13;

public class PrimitiveTypes {
    int i = 0;
    long l = 0;
    float f = 0.0f;
    double d = 0.0;

    PrimitiveTypes(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }
    public String toString() {
        return String.format("i = %d\nl = %d\nf = %.16g\nd = %.16g\n", i, l, f, d);
    }
}
