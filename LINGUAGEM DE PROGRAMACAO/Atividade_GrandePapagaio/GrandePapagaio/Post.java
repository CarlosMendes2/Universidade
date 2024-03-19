import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String post;
    private List<Usuario> likes;
    private LocalDate dataAgora;
    private LocalTime tempoAgora;


    public Post(String post) {
        try {
            isPostInvalido(post);
        }catch (IllegalArgumentException nsfe){
            throw new IllegalArgumentException("Entrada inválida");
        }
        this.post = post;
        this.dataAgora = LocalDate.now();
        this.tempoAgora = LocalTime.now();
        this.likes = new ArrayList<>();
    }
    public boolean isPostInvalido(String post){
        if (post == null){
            throw new IllegalArgumentException("Entrada Null!");
        }
        if (post.isEmpty() || post.isBlank()){
            throw new IllegalArgumentException("Entrada em branco ou vazia!");
        }
        return false;
    }
    public void setPost(String postEdit) {
        this.post = postEdit;
    }

    public String getPost() {
        return post;
    }

    public List<Usuario> getLikes() {
        return likes;
    }

    public void setLikes(Usuario usuarioLikes) {
        likes.add(usuarioLikes);
    }
    @Override
    public String toString() {
        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAgora.format(dataFormato);

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = tempoAgora.format(formatoHora);

        return  getPost() +"\n("+ dataFormatada +" "+ horaFormatada+")";
    }
}
