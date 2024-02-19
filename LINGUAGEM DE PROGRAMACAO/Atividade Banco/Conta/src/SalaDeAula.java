public class SalaDeAula {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos");
        Aluno aluno01 = aluno;
        aluno01.setNome("Josézin");

        System.out.println(aluno.getNome());

    }
}
