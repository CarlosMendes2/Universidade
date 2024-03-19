import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Anotacao {
    String anotacao;
    int dia;
    String mes;
    int ano;

    LocalDate localDate = LocalDate.now();
    public Anotacao(String anotacao) {
        this.anotacao = anotacao;
        this.dia = localDate.getDayOfWeek().ordinal();
        this.mes = localDate.getMonth().name();
        this.ano = localDate.getYear();
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public String getAnotacao() {
        return anotacao;
    }

    @Override
    public String toString() {
        return getAnotacao();
    }
}
