import java.util.Date;
import java.util.Map;

public class ServicoTosa extends Servico{
    private static final Map<Tamanho, Double> PRECOS_BASE = Map.of(
            Tamanho.PEQUENO, 22.0,
            Tamanho.MEDIO, 30.0,
            Tamanho.GRANDE, 40.0
    );
    public ServicoTosa(int codigo, String tamanhoAnimal) {
        super(codigo, tamanhoAnimal);
    }
    @Override
    public double getPreco() {
        return PRECOS_BASE.get(getTamanhoAnimal());
    }

    @Override
    public String toString() {
        return "ServicoTosa{ precoServico = "+ getPreco()+"}";
    }
}
