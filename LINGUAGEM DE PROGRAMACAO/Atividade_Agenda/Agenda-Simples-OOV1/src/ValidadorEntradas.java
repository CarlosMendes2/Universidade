public class ValidadorEntradas {

    public boolean verificaEntradaString(String entrada){
        boolean verificaEntradaStringStatus = true;
        for (int i = 0; i<entrada.length();i++){
            if (Character.isDigit(entrada.charAt(i))){
                verificaEntradaStringStatus = false;
            }
        }
        return verificaEntradaStringStatus;
    }

    public boolean verificaEntradaNumber(String entrada){
        boolean verificaEntradaNumberStatus = true;
        for (int i = 0; i<entrada.length();i++){
            if(!Character.isDigit(entrada.charAt(i))){
                verificaEntradaNumberStatus = false;
            }
        }
        return verificaEntradaNumberStatus;
    }
    public boolean verificaEntradaEmail(String entrada){
        boolean verificaEntradaEmailStatus = false;
        for (int i = 0; i<entrada.length();i++){
            if("@".equalsIgnoreCase(String.valueOf(entrada.charAt(i)))){  // ***
                verificaEntradaEmailStatus = true;
                break;
            }
        }
        return verificaEntradaEmailStatus;
    }
    public boolean verificaEntradaEvento(String entrada){
        String busca = "busca";
        String adicionar = "adicionar";
        String sair = "sair";
        String todosContatos = "todos contatos";
        String buscasPorLetra = "busca por letra";
        return busca.equalsIgnoreCase(entrada) || adicionar.equalsIgnoreCase(entrada)
                || sair.equalsIgnoreCase(entrada) || todosContatos.equalsIgnoreCase(entrada)
                || buscasPorLetra.equalsIgnoreCase(entrada) ; //***
    }
    public boolean verificaEntradaLetra(String entrada){
        return entrada.length() == 1 && verificaEntradaString(entrada);
    }


}


