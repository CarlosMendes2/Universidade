import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String post;
    private final List<Usuario> likes;
    private final LocalDate dataAgora;
    private final LocalTime tempoAgora;


    public Post(String post) {
        this.post = post;
        this.dataAgora = LocalDate.now();
        this.tempoAgora = LocalTime.now();
        this.likes = new ArrayList<>();
    }
    public static boolean isPostInvalido(String post){
        if (post.isEmpty() || post.isBlank() || post == null){
            return true;
        }
        return false;
    }
    public boolean setPost(String postEdit) {
        if (isPostInvalido(post)){
            this.post = postEdit;
            return true;
        }return false;
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
