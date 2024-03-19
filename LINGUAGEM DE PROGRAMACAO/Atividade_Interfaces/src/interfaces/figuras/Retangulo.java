package interfaces.figuras;

import java.util.Objects;

public class Retangulo implements Figura2D {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Retangulo retangulo)) return false;
        return Double.compare(getLado1(), retangulo.getLado1()) == 0 && Double.compare(getLado2(), retangulo.getLado2()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLado1(), getLado2());
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }

    @Override
    public String getDescricao() {
        return "RETANGULO";
    }

    @Override
    public double calculaArea() {
        return lado1 * lado2;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * lado1 + 2 * lado2;
    }
}
