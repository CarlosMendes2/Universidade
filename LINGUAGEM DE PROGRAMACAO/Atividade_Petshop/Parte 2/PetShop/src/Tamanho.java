public enum Tamanho {
    GRANDE("G"), PEQUENO("P"),MEDIO("M");
    private String valor;
    Tamanho(String tamanho) {
        this.valor = tamanho;
    }
    public String getValor() {
        return valor;
    }
}
