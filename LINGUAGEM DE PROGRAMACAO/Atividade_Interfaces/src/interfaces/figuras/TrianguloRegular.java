package interfaces.figuras;

import java.util.Objects;

public class TrianguloRegular implements  Figura2D{
    private double lado;
    public TrianguloRegular(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public String getDescricao() {
        return "Triangulo Regular";
    }

    @Override
    public double calculaArea() {
        return lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double calculaPerimetro() {
        return 3*lado;
    }

    @Override
    public String toString() {
        return "TrianguloRegular{" +
                "lados=" + lado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrianguloRegular that = (TrianguloRegular) o;
        return Double.compare(lado, that.lado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado);
    }
}
