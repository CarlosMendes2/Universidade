package interfaces.figuras;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<Figura2D> figuras = new ArrayList<>();

    public void adicionaFigura(Figura2D figura) {
        figuras.add(figura);
    }
    public Figura2D getFigura2D(int indice) {
        return figuras.get(indice);
    }

    public double getAreaDeFigura(int indice) {
        return figuras.get(indice).calculaArea();
    }

    public double getPerimetroDeFigura(int indice) {
        return figuras.get(indice).calculaPerimetro();
    }

    public int getQtdeDeFiguras() {
        return figuras.size();
    }

    public String getDescricaoDeFigura(int indice) {
        return figuras.get(indice).getDescricao();
    }
}