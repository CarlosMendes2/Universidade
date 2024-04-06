import java.util.ArrayList;
import java.util.List;

public class InventarioDeServicos {
    List<Servico> inventarioDeServicos = new ArrayList<>();
    public int adicionaServico(Servico servico){
        inventarioDeServicos.add(servico);
        return inventarioDeServicos.indexOf(servico);
    }
    public List<Servico> getInventarioDeServicos(){
        return inventarioDeServicos;
    }
    public double getPrecoTotal(){
        int precoTotal = 0;
        for (Servico servico: inventarioDeServicos){
            precoTotal+= servico.getPreco();
        }
        return precoTotal;
    }
    public int getQuantidadeServicos(){
        return inventarioDeServicos.size();
    }
    public Servico getServico(int codigo){
        for (Servico servico: inventarioDeServicos){
            if (servico.getCodigo()== codigo){
                return servico;
            }
        }
        throw new IllegalArgumentException("Servico não encontrado.");
    }

}
