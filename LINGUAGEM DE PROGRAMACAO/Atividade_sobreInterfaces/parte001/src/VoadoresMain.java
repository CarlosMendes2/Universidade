import java.util.Random;

public class VoadoresMain {
    public static void main(String[] args) {
        Voador qqVoador = recebeVoador();
        qqVoador.voar();
        qqVoador.planar();
        qqVoador.pousar();
    }
    public static Voador recebeVoador() {
        Random r = new Random();
        if(r.nextBoolean())
            return new GalinhaVoadora();
        else
            return new Drone("do tipo bom!");

    }
}
