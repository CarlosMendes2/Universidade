public class Main {
    public static void main(String[] args) {
        agendaSimplesOO();
    }
    private static void agendaSimplesOO() {
        Agenda agenda = new Agenda();
        boolean statusAgenda = true;
        while(statusAgenda){
            System.out.printf("%nComandos: 'Adicionar' | 'Busca' | 'Todos contatos' | 'Busca por letra' |'Sair'%n>_");
            String evento = agenda.entradaEventoAgenda();
            if("adicionar".equalsIgnoreCase(evento)){
                agenda.adicionarNovoUsuario();
            } else if ("busca".equalsIgnoreCase(evento)) {
                agenda.buscaUsuarioPeloNome();
            } else if("sair".equalsIgnoreCase(evento)){
                System.out.println("Aplicação finalizada!");
                statusAgenda = false;
            } else if ("todos contatos".equalsIgnoreCase(evento)) {
                agenda.buscaTodosContatos();
            } else if ("busca por letra".equalsIgnoreCase(evento)) {
                agenda.buscaPorLetra();
            }
        }
    }

}
