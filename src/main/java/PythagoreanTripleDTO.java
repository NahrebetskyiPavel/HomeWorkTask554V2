import java.util.Objects;

public class PythagoreanTripleDTO {
    int a;
    int b;
    int c;

    public PythagoreanTripleDTO(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTripleDTO that = (PythagoreanTripleDTO) o;
        return a == that.a &&
                b == that.b &&
                c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
