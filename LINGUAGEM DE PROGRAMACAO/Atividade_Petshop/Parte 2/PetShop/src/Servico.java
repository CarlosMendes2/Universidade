import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public abstract class Servico {
    private int codigo;
    private LocalTime timeServico = LocalTime.now();
    private LocalDateTime dateServico = LocalDateTime.now();
    private Tamanho tamanhoAnimal;

    public Servico(int codigo,  String tamanhoAnimal) {
        this.codigo = codigo;
        this.tamanhoAnimal = Tamanho.valueOf(tamanhoAnimal);
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public LocalTime getTimeServico() {
        return timeServico;
    }

    public LocalDateTime getDateServico() {
        return dateServico;
    }

    public Tamanho getTamanhoAnimal() {
        return tamanhoAnimal;
    }
    public void setTamanhoAnimal(Tamanho tamanhoAnimal) {
        this.tamanhoAnimal = tamanhoAnimal;
    }
    public abstract double getPreco();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servico servico = (Servico) o;
        return codigo == servico.codigo && Objects.equals(timeServico, servico.timeServico) && tamanhoAnimal == servico.tamanhoAnimal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, timeServico, tamanhoAnimal);
    }
}
