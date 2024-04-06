public enum Tamanho {
    GRANDE('G'), PEQUENO('P'),MEDIO('M');
    private char valor;
    Tamanho(char pmg) {
        this.valor = pmg;
    }
    public char getValor() {
        return valor;
    }
}
