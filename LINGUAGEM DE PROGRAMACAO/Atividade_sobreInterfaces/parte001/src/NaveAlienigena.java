public class NaveAlienigena implements Voador{
    //Garanta também que esta classe tenha pelo menos um atributo.
    String formato;

    public NaveAlienigena(String formato) {
        this.formato = formato;
    }
    //Garanta que a interface Voador será implementada e que existe pelo menos mais um método na classe que não existe na interface
    public boolean abduzir(){
        return true;
    }
    public String getFormato() {
        return formato;
    }

    // Sei que não é para usar print, mas a  professora usou print nos exemplos dela,então eu achei que poderia usar nesse caso também.
    @Override
    public double voar() {
        System.out.println("Nave voando...");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Nave planando...");
    }

    @Override
    public boolean pousar() {
        System.out.println("Nave pousando...");
        return false;
    }
}
