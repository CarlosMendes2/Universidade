import java.util.Date;
import java.util.Map;
public class ServicoHotelzinho extends Servico{
    private int quantidadeHorasHotel;
    private static final Map<Tamanho, Double> PRECOS_BASE = Map.of(
            Tamanho.PEQUENO, 20.0,
            Tamanho.MEDIO, 30.0,
            Tamanho.GRANDE, 40.0);

    public ServicoHotelzinho(int codigo, String tamanhoAnimal, int quantidadeHorasHotel) {
        super(codigo, tamanhoAnimal);
        this.quantidadeHorasHotel = quantidadeHorasHotel;
    }

    public int getQuantidadeHorasHotel() {
        return quantidadeHorasHotel;
    }
    public void setQuantidadeHorasHotel(int quantidadeHorasHotel) {
        this.quantidadeHorasHotel = quantidadeHorasHotel;
    }
    @Override
    public double getPreco() {
        return PRECOS_BASE.get(getTamanhoAnimal()) * getQuantidadeHorasHotel();
    }

    @Override
    public String toString() {
        return "ServicoHotelzinho{" +
                " quantidadeHorasHotel =" + quantidadeHorasHotel +
                ", precoServico = "+ getPreco()+
                '}';
    }
}
