package interfaces.figuras;

import java.util.Objects;

public class Circulo implements Figura2D {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return Double.compare(getRaio(), circulo.getRaio()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRaio());
    }

    @Override
    public String getDescricao() {
        return "CIRCULO";
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
