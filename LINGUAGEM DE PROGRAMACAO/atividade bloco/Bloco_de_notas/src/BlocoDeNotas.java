import java.util.ArrayList;
import java.util.List;

public class BlocoDeNotas {
    List<Anotacao> blocoDeNotas;

    public BlocoDeNotas() {
        this.blocoDeNotas = new ArrayList<>();
    }

    public int  adicionarNovaAnotacao(String novaAnotacao){
        Anotacao anotacao = new Anotacao(novaAnotacao);
        blocoDeNotas.add(anotacao);
        return blocoDeNotas.indexOf(anotacao);
    }

    public void removerAnotacao(int index){
        blocoDeNotas.remove(index);
    }

    public void editarAnotacao(int index, String anotacaoEditada){
        blocoDeNotas.get(index).setAnotacao(anotacaoEditada);
    }

    public List<Anotacao> getBlocoDeNotas() {
        return blocoDeNotas;
    }
}


