import java.util.Date;
import java.util.Map;
public class ServicoBanho extends Servico{
    private Tamanho tamanhoPeloAnimal;
    private static final Map<Tamanho, Double> PRECOS_BASE = Map.of(
            Tamanho.PEQUENO, 20.0,
            Tamanho.MEDIO, 30.0,
            Tamanho.GRANDE, 40.0
    );
    private static final Map<Tamanho, Double> PRECOS_ADICIONAIS_PELO = Map.of(
            Tamanho.MEDIO, 10.0,
            Tamanho.GRANDE, 20.0
    );

    public ServicoBanho(int codigo, String tamanhoAnimal, Tamanho tamanhoPeloAnimal) {
        super(codigo, tamanhoAnimal);
        this.tamanhoPeloAnimal = tamanhoPeloAnimal;
    }
    public Tamanho getTamanhoPeloAnimal() {
        return tamanhoPeloAnimal;
    }
    public void setTamanhoPeloAnimal(Tamanho tamanhoPeloAnimal) {
        this.tamanhoPeloAnimal = tamanhoPeloAnimal;
    }
    @Override
    public double getPreco() {
        return PRECOS_BASE.get(getTamanhoAnimal()) + PRECOS_ADICIONAIS_PELO.getOrDefault(tamanhoPeloAnimal, 0.0);
    }
    @Override
    public String toString() {
        return "ServicoBanho{" +
                "tamanhoPeloAnimal=" + tamanhoPeloAnimal +
                "precoServico = "+ getPreco()+
                '}';
    }
}
